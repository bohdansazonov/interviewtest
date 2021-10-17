package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import pageobject.ProfilePage;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ProfilePageStepDefinition {

    ProfilePage profilePage;

    public ProfilePageStepDefinition(ProfilePage profilePage) {
        this.profilePage = profilePage;
    }

    @When("user clicks profile button")
    public void userClicksProfileButton() {
        profilePage.clickProfileButton();
    }

    @When("user clicks logout button")
    public void userClicksLogoutButton() {
        profilePage.clickLogoutButton();
    }

    /*
    * This step checks that user session jwt is stored in local storage by 'C_C_M' key
    * */
    @Then("assert user credentials are stored in local storage")
    public void assertUserCredentialsAreStoredInLocalStorage(){
        LocalStorage local = ((WebStorage) profilePage.getWebDriver()).getLocalStorage();
        assertFalse(local.getItem("C_C_M").isEmpty());
    }

    @Then("assert user is redirected to profile page after successful login")
    public void assertUserIsRedirectedToProfilePageAfterSuccessfulLogin(){
        assertTrue(profilePage.isProfileButtonDisplayed());
    }
}
