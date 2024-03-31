package Pages.CabinetUserCreditRequest._2_MainCabinet;

import Core.CoreSeleniumPage;
import Pages.CabinetUserCreditRequest._3_CreditRequestFromCabinet.CreditRequestFromCabinet;
import Tests.UnitTests.CreditRequestFfromCabinet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCabiet extends CoreSeleniumPage {



    public UserCabiet() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/ul/li[3]")
    WebElement applyNowBTN;

    public UserCabiet applyNowCredit(){
        applyNowBTN.click();
        return this;
    }

    public CreditRequestFromCabinet creditRequestFromCabinet(){
        return new CreditRequestFromCabinet();
    }


}
