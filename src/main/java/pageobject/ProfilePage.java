package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;
import webdriverclient.CustomChromeDriver;

import static utils.WaitUtils.waitForElementToBePresent;

public class ProfilePage extends AbstractPage {

    @FindBy(id = "ember31")
    private WebElement profileButton;

    @FindBy(xpath = "//*[@href='/m/logout/']")
    private WebElement logoutButton;

    public ProfilePage(CustomChromeDriver driver) {
        super(driver);
    }

    public void clickProfileButton() {
        profileButton.click();
    }

    public boolean isProfileButtonDisplayed() {
        waitForElementToBePresent(webDriver, profileButton);
        return profileButton.isDisplayed();
    }

    public void clickLogoutButton() {
        WaitUtils.waitForElementToBePresent(webDriver, logoutButton);
        logoutButton.click();
    }
}
