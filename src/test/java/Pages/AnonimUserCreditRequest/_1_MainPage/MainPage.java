package Pages.AnonimUserCreditRequest._1_MainPage;

import ConfigProvider.ConfigProvider;
import Core.CoreSeleniumPage;
import Pages.AnonimUserCreditRequest._3_UserCabinet.UserCabinet;
import org.openqa.selenium.support.PageFactory;

import static Helpers.SelectBase.selectBase;

public class MainPage extends CoreSeleniumPage {

    public MainPage(){
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage creditRequestAnonim(String nameSurname, String phoneNumber, long creditAmount, int paymentTerm, String idno, String email){
        selectBase(driver);

        return this;
    }

     public UserCabinet userCabinet(){

        return new UserCabinet();
     }


}
