package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.MainPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageStepDefinition {

    private MainPage mainPage;

    public MainPageStepDefinition(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    @Given("user opens main page")
    public void userOpensMainPage() {
        mainPage.userOpensMainPage();
    }

    @When("user clicks login button")
    public void userClicksLoginButton() {
        mainPage.clickLoginButton();
    }

    @Then("assert user is redirected to home page")
    public void assertUserIsRedirectedToHomePage() {
        assertTrue(mainPage.isLoginButtonDisplayed());
    }

    @When("unauthorized user opens secured link")
    public void unauthorizedUserOpensSecuredLink() {
        String MESSAGE_THREAD_LINK = "https://www.linkedin.com/messaging/thread/2-YjU1NjBjNDEtNDFhOC00MDg0LTk3M2ItYzZiZDZjM2UxMDBlXzAxMg==/";
        mainPage.getWebDriver().navigate().to(MESSAGE_THREAD_LINK);
    }
}
