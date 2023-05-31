package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_02 {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }


    @When("Enter username and password and click the login button")
    public void loginUsernameAndPosswordAndClickLoginButton() {

        dc.sendKeysFunction(dc.username, "teacher_7");
        dc.sendKeysFunction(dc.password, "T12345");
        dc.clickFunction(dc.loginButton);

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsTextFunction(dc.successMessage, "Techno Study Intern School");

    }

    @When("Enter the wrong username or password and click the login button")
    public void enterTheWrongUsernameOrPasswordAndClickTheLoginButton() {

        dc.sendKeysFunction(dc.username, "Teacher_55");
        dc.sendKeysFunction(dc.password, "T12345");
        dc.clickFunction(dc.loginButton);

    }

    @Then("user should get error while logging in")
    public void userShouldGetErrorWhileLoggingIn() {
        dc.verifyContainsTextFunction(dc.errorMessage, "Invalid username or password");

    }
}

