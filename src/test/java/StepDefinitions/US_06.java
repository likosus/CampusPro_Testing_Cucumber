package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class US_06 {
    DialogContent dc=new DialogContent();

    @Given("Click Calendar")
    public void clickCalendar() {

        dc.clickFunction(dc.Calenderfirst);


    }

    @When("Click second Calendar Button")
    public void clickSecondCalendarButton() {

    }

    @And("Click on Add button")
    public void clickOnAddButton() {
        dc.clickFunction(dc.CalAddButton);
    }

    @When("Click on event type and choose Meeting")
    public void clickOnEventTypeAndChooseMeeting() {
        dc.clickFunction(dc.typeofEvent);
        dc.clickFunction(dc.meetingMessage);

    }

    @And("Click on Apply Button")
    public void clickOnApplyButton() {
        dc.clickFunction(dc.applyButton);
        dc.sendKeysFunction(dc.nameofEvent,"MasterofCoding");
        dc.sendKeysFunction(dc.startTime, "14");
        dc.sendKeysFunction(dc.finishTime,"18");
        dc.clickFunction(dc.SaveButton);
    }
}
