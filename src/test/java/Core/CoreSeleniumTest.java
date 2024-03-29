package Core;

import ConfigProvider.ConfigProvider;
import Helpers.IsNetworkPersists;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

abstract public class CoreSeleniumTest {
    protected WebDriver driver;

    @Before
    public void setup() {
        try {
            if (IsNetworkPersists.isConnected()) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                CoreSeleniumPage.setWebDriver(driver);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @After
    public void tearDown() {
        try {
            Thread.sleep(3000);
            driver.quit();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
