package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pageobject.MainPage;

import java.io.File;
import java.io.IOException;

public class Hooks {

    private MainPage mainPage;

    public Hooks(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    /*
    * Method closes webdriver after each scenario and take screenshot if scenario fails
    * Screenshots would be stored in local storage with path :src/test/resources/screenshots/"
    * */
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                File scrFile = ((TakesScreenshot) mainPage.getWebDriver()).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFileToDirectory(scrFile, new File("src/test/resources/screenshots/"));
            } catch (IOException exception) {
                System.out.println("Can not take screenshot of failure.");
            }
        }
        mainPage.getWebDriver().quit();
    }
}
