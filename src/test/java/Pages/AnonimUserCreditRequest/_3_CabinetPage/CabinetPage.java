package Pages.AnonimUserCreditRequest._3_CabinetPage;

import Core.CoreSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CabinetPage extends CoreSeleniumPage {
    List<WebElement> myCreditRequests = driver.findElements(By.xpath("/html/body/div[6]/div[1]/div/div/div/div[2]/table/tbody::*"));

    public CabinetPage() {PageFactory.initElements(driver, this);}

    public CabinetPage checkMyRequestsOfCredit() {

        if(myCreditRequests.isEmpty()){
            Assert.fail();
        }else{
            Assert.assertTrue(true);
        }

        return this;
    }
//    TODO : To create next page routes, depending on where the request status was checked
}
