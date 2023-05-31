package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    public WebElement username;

    @FindBy(id = "mat-input-1")
    public WebElement password;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Techno Study Intern School']")
    public WebElement successMessage;

    @FindBy(xpath = "//*[text()='Invalid username or password']")
    public WebElement errorMessage;


}
