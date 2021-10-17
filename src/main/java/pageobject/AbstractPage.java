package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import webdriverclient.CustomChromeDriver;

public abstract class AbstractPage {

   protected WebDriver webDriver;

   /*
   * Chrome driver will be present for all pages that extend this class
   * Driver will be passed as Dependency Injection of Cucumber Picocontainer
   * WebElements of each class would be initialized with the help of PageFactory pattern
   * */
    public AbstractPage(CustomChromeDriver driver) {
        this.webDriver = driver.getWebDriver();
        PageFactory.initElements(webDriver, this);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
