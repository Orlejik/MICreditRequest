package Tests.UnitTests;

import ConfigProvider.ConfigProvider;
import Core.CoreSeleniumTest;
import Pages.CabinetUserCreditRequest._1_MainPage.MainPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class CreditRequestFfromCabinet extends CoreSeleniumTest {

    @DisplayName("Tests of Credit request from User Cabinet")
    @Test()
    public void cabinetTests() throws InterruptedException {

        String userLogin = String.valueOf(ConfigProvider.C_USER_LOGIN);
        String userPassword = ConfigProvider.C_USER_PASSWD;

        int creditAmount = ConfigProvider.C_CREDIT_AMOUNT;
        int paymentsTerm = ConfigProvider.C_PAYMENT_TERM;
        String userFirstName = ConfigProvider.C_USER_FIRST_NAME;
        String userSurname = ConfigProvider.C_USER_SURNAME;
        String phonenumber = ConfigProvider.C_USER_PHONE_NUMBER;
        String imagePath = ConfigProvider.C_IMAGE_PATH;
        String carDescr = ConfigProvider.CAR_DESCRIPTION;
        String carTehnPasspt = ConfigProvider.CAR_TEHN_PASSPT;


        MainPage mainPage = new MainPage();
        mainPage.creditRequestCabinet(userLogin, userPassword)
                .userCabiet()
                .applyNowCredit()
                .creditRequestFromCabinet()
                .sendCreditRequest(creditAmount,paymentsTerm,userFirstName, userSurname, phonenumber, imagePath, carDescr, carTehnPasspt)
                .checkRequests()
                .checkMyRequests();
    }

}
