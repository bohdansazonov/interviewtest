package webdriverclient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomChromeDriver {

    WebDriver webDriver;
    public static final String PATH_TO_CHROMEDRIVER = "src/main/resources/webdriver/chromedriver.exe";

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public CustomChromeDriver() {
        initializeDriver();
    }

    private void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
        webDriver = new ChromeDriver();
        getWebDriver().manage().window().maximize();
    }
}
