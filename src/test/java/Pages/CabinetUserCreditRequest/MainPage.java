package Pages.CabinetUserCreditRequest;

import ConfigProvider.ConfigProvider;
import Core.CoreSeleniumPage;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends CoreSeleniumPage {

    public MainPage(){
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage creditRequestCabinet(String idno, String password){




        return this;
    }
}
