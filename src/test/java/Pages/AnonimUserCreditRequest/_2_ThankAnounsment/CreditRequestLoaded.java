package Pages.AnonimUserCreditRequest._2_ThankAnounsment;

import ConfigProvider.ConfigProvider;
import Core.CoreSeleniumPage;
import Pages.AnonimUserCreditRequest._3_CabinetPage.CabinetPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditRequestLoaded extends CoreSeleniumPage {

    @FindBy(xpath = "/html/body/header/div/div[4]/div[1]/div/div[6]/div[3]/div[1]/span[2]")
    private WebElement userCabinet;
    @FindBy(xpath = "/html/body/header/div/div[4]/div[1]/div/div[6]/div[3]/div[2]/form/div[1]/div[1]/div[1]/input")
    private WebElement userName;
    @FindBy(xpath = "//*[@id=\"myPassword\"]")
    private WebElement userPassword;


    JavascriptExecutor js = (JavascriptExecutor) driver;



    public CreditRequestLoaded() {
        driver.get(ConfigProvider.TEMP_URL);
        PageFactory.initElements(driver, this);
    }

    public CreditRequestLoaded userCabinet(String login, String password) throws InterruptedException {
        userCabinet.click();
        Thread.sleep(1000);
        js.executeScript("let iAmClient = document.evaluate(\"/html/body/header/div/div[4]/div[1]/div/div[6]/div[3]/div[2]/form/div[2]/label[1]/input\",document, null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue; iAmClient.click();");
        userName.sendKeys(login);
        userPassword.sendKeys(password, Keys.ENTER);

        return this;
    }

    public CabinetPage cabinetPage() {
//        loginAccountBTN.click();
        return new CabinetPage();
    }
}
