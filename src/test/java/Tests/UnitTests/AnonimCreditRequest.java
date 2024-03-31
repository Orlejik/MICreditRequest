package Tests.UnitTests;

import ConfigProvider.ConfigProvider;
import Core.CoreSeleniumTest;
import Pages.AnonimUserCreditRequest._1_MainPage.MainPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnonimCreditRequest extends CoreSeleniumTest {

    @DisplayName("First test (creation credit request from anonymous user)")
    @Test
    public void testTest() throws InterruptedException {

        String userFirstLastName = ConfigProvider.USERNAME;
        String userPhoneNumber = ConfigProvider.PHONENUMBER;
        int creditAmount = ConfigProvider.CREDITAMOUNT;
        int paymentsTerm = ConfigProvider.PAYMENTTERM;
        Long idnoIdnp = ConfigProvider.IDNOIDNP;
        String email = ConfigProvider.EMAIL;

        String userFLName = String.valueOf(ConfigProvider.IDNOIDNP);
        String userPassword = ConfigProvider.ANONIM_PASSWORD;

        MainPage mainPage = new MainPage();
        mainPage.creditRequestAnonim(userFirstLastName, userPhoneNumber, creditAmount, paymentsTerm, idnoIdnp, email)
                .userCabinet()
                .userCabinet(userFLName, userPassword)
                .cabinetPage().checkMyRequestsOfCredit();
    }
}
