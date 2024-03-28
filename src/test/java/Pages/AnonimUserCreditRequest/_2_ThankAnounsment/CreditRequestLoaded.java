package Pages.AnonimUserCreditRequest._2_ThankAnounsment;

import Core.CoreSeleniumPage;
import Pages.AnonimUserCreditRequest._3_CabinetPage.CabinetPage;
import org.openqa.selenium.support.PageFactory;

public class CreditRequestLoaded extends CoreSeleniumPage {

    public CreditRequestLoaded() {
        PageFactory.initElements(driver, this);
    }

    public CreditRequestLoaded login(String login, String password) {


        return this;
    }

    public CabinetPage cabinetPage() {

        return new CabinetPage();
    }
}
