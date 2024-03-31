package Pages.CabinetUserCreditRequest._1_MainPage;

import ConfigProvider.ConfigProvider;
import Core.CoreSeleniumPage;
import Pages.CabinetUserCreditRequest._2_MainCabinet.UserCabiet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Helpers.SelectBase.selectBase;

public class MainPage extends CoreSeleniumPage {

    public MainPage(){
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/header/div/div[4]/div[1]/div/div[6]/div[3]/div[1]/span[2]")
    private WebElement userCabinet;
    @FindBy(xpath = "/html/body/header/div/div[4]/div[1]/div/div[6]/div[3]/div[2]/form/div[1]/div[1]/div[1]/input")
    private WebElement userName;
    @FindBy(xpath = "//*[@id=\"myPassword\"]")
    private WebElement userPassword;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public MainPage creditRequestCabinet(String idno, String password) throws InterruptedException {
        selectBase(driver);

        userCabinet.click();
        Thread.sleep(1000);
        js.executeScript("let iAmClient = document.evaluate(\"/html/body/header/div/div[4]/div[1]/div/div[6]/div[3]/div[2]/form/div[2]/label[1]/input\",document, null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue; iAmClient.click();");
        Thread.sleep(1000);
        userName.sendKeys(String.valueOf(idno));
        userPassword.sendKeys(String.valueOf(password));
        Thread.sleep(1000);
        userPassword.sendKeys(Keys.ENTER);

        System.out.println(idno);
        System.out.println(password);
        return this;
    }

    public UserCabiet userCabiet() {
        return new UserCabiet();
    }
}
