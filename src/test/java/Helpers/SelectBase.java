package Helpers;

import ConfigProvider.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SelectBase {
    public static void selectBase(WebDriver driver){
        driver.get(ConfigProvider.URL);
        WebElement baseList = driver.findElement(By.xpath("//*[@id=\"DBserverList\"]"));
        WebElement neededBase = driver.findElement(By.xpath("//*[@id=\"DBserverList\"]/option[2]"));

        baseList.click();
        neededBase.click();

        driver.switchTo().alert().accept();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

    }
}
