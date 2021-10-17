package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageStepDefinition {

    private LoginPage loginPage;

    /*
    * PageObjects would be added to step definition classes with the help if Cucumber Picocontainer
    * */
    public LoginPageStepDefinition(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @When("user enters login {string}")
    public void userEntersLogin(String login) {
        loginPage.clickLoginField();
        loginPage.typeLogin(login);
    }

    @When("user enters password {string}")
    public void userEntersPassword(String password) {
        loginPage.clickPasswordField();
        loginPage.typePassword(password);
    }

    @When("user clicks Enter button")
    public void userClicksEnterButton() {
        loginPage.clickEnterButton();
    }

    @Then("assert user is redirected to login page")
    public void assertUserIsRedirectedToLoginPage() {
        assertTrue(loginPage.isLoginFieldDisplayed());
    }
}
