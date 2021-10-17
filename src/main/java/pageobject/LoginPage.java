package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriverclient.CustomChromeDriver;

import static utils.WaitUtils.waitForElementToBePresent;

public class LoginPage extends AbstractPage {

    @FindBy(id = "username")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement enterButton;

    public LoginPage(CustomChromeDriver driver) {
        super(driver);
    }

    public void clickLoginField() {
        waitForElementToBePresent(webDriver, loginField);
        loginField.click();
    }

    public void typeLogin(String userName) {
        loginField.sendKeys(userName);
    }

    public boolean isLoginFieldDisplayed() {
        waitForElementToBePresent(webDriver, loginField);
        return loginField.isDisplayed();
    }

    public void clickPasswordField() {
        passwordField.click();
    }

    public void typePassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickEnterButton() {
        enterButton.click();
    }
}
