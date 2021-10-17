package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriverclient.CustomChromeDriver;

import static utils.PropertiesReader.getProperty;
import static utils.WaitUtils.waitForElementToBePresent;

public class MainPage extends AbstractPage {

    @FindBy(className = "nav__button-secondary")
    private WebElement loginButton;

    public MainPage(CustomChromeDriver driver) {
        super(driver);
    }

    public void userOpensMainPage() {
        webDriver.navigate().to(getProperty("app.url"));
    }

    public void clickLoginButton() {
        waitForElementToBePresent(webDriver, loginButton);
        loginButton.click();
    }

    public boolean isLoginButtonDisplayed() {
        waitForElementToBePresent(webDriver, loginButton);
        return loginButton.isDisplayed();
    }
}
