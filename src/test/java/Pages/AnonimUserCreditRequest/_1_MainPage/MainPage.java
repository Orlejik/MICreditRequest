package Pages.AnonimUserCreditRequest._1_MainPage;

import ConfigProvider.ConfigProvider;
import Core.CoreSeleniumPage;
import Helpers.SelectBase;
import Pages.AnonimUserCreditRequest._2_ThankAnounsment.CreditRequestLoaded;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static Helpers.SelectBase.selectBase;

public class MainPage extends CoreSeleniumPage {

    //    Main Page First Div Elements-----------------
    @FindBy(xpath = "//*[@id=\"tab-1\"]")
    private WebElement userDataForCreditBlock;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[1]/div[2]/div/input")
    private WebElement userName;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[1]/div[3]/div/input")
    private WebElement phoneNumber;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[2]/div/div/div/p")
    private WebElement creditPurpose;
    //    ------------------ Credit Purpose DropDown list elements-------------------------
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[2]/div/div/div/div/ul/li[1]")
    private WebElement lessThan50K;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[2]/div/div/div/div/ul/li[2]")
    private WebElement moreThan50K;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[2]/div/div/div/div/ul/li[3]")
    private WebElement carOrder;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[2]/div/div/div/div/ul/li[4]")
    private WebElement appartmentNeeds;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[2]/div/div/div/div/ul/li[5]")
    private WebElement ownNeeds;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[2]/div/div/div/div/ul/li[6]")
    private WebElement lessTan20K;
    //    ------------------ Credit Purpose DropDown list elements-------------------------
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[3]/div/div/div/p")
    private WebElement currency;
    //    ------------------ Currency DropDown list elements-------------------------
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[3]/div/div/div/div/ul/li[1]")
    private WebElement currencyMLD;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[3]/div/div/div/div/ul/li[2]")
    private WebElement currencyEUR;
    //    ------------------ Currency DropDown list elements-------------------------
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[3]/div[1]/label/span")
    private WebElement personRequirenmentsCeckbox;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[3]/div[2]/label/span")
    private WebElement businessRequirenmenstsCheckbox;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[4]/div[1]/div/input")
    private WebElement creaditAmonut;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[4]/div[2]/div/input")
    private WebElement creaditTerm;
    //    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[5]/label[1]/span")
//    private WebElement persDataUsageAccesption;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[5]/label[2]/span")
    private WebElement siteConditionAccesption;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[6]/div[1]/div")
    private WebElement calculateBtn;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[6]/div[2]/div/span")
    private WebElement applyCreditBtn;


    //    --------------------- NEXT STEPS -------------------------------------
    @FindBy(xpath = "//*[@id=\"tab-3\"]/div[1]/div[2]/div/input")
    private WebElement idno_idnp;
    @FindBy(xpath = "//*[@id=\"tab-3\"]/div[1]/div[3]/div/input")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"tab-3\"]/div[2]/div[2]/div/div[2]/div/select")
            private WebElement listOfOffices;

    List<WebElement> offices = driver.findElements(By.xpath("//*[@id=\"tab-3\"]/div[2]/div[2]/div/div[2]/div/select/option"));

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public MainPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage creditRequestAnonim(String nameSurname, String phoneNumber, long creditAmount, int paymentTerm, String idno, String email) {
        selectBase(driver);

        return this;
    }

    public CreditRequestLoaded userCabinet() {

        return new CreditRequestLoaded();
    }


}
