package Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

abstract public class CoreSeleniumPage {
    protected static WebDriver driver;
    public static void setWebDriver(WebDriver webDriver){
        driver=webDriver;
    }
}
