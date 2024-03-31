package Pages.AnonimUserCreditRequest._3_CabinetPage;

import Core.CoreSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CabinetPage extends CoreSeleniumPage {

    public CabinetPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div/div[2]")
    WebElement tableOfCredits;

    public CabinetPage checkMyRequestsOfCredit() throws InterruptedException {

        List<WebElement> myCreditRequests = driver.findElements(By.xpath("/html/body/div[6]/div[1]/div/div/div/div[2]/table/tbody/tr"));

        for (WebElement myCredis : myCreditRequests) {
            System.out.println("--------------- MY CREDIT REQUESTS -----------------");
            System.out.println(myCredis);
        }


        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tableOfCredits);
        Thread.sleep(5000);
        if (myCreditRequests.isEmpty()) {
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }

        return this;
    }
}
