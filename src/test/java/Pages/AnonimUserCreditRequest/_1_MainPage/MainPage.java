package Pages.AnonimUserCreditRequest._1_MainPage;

import ConfigProvider.ConfigProvider;
import Core.CoreSeleniumPage;
import Helpers.RandomElem;
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
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[5]/label[2]/span")
    private WebElement siteConditionAccesption;
    //    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[6]/div[1]/div")
//    private WebElement calculateBtn;
    @FindBy(xpath = "//*[@id=\"tab-1\"]/div[6]/div[2]/div")
    private WebElement applyCreditBtn;


    //    --------------------- NEXT STEPS -------------------------------------
    @FindBy(xpath = "//*[@id=\"tab-3\"]/div[1]/div[2]/div/input")
    private WebElement idno_idnp;
    @FindBy(xpath = "//*[@id=\"tab-3\"]/div[1]/div[3]/div/input")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"tab-3\"]/div[2]/div[2]/div/div[2]/div")
    private WebElement listOfOffices;

    @FindBy(xpath = "//*[@id=\"tab-3\"]/div[3]/div/div")
    private WebElement applyNowDTN;

    JavascriptExecutor js = (JavascriptExecutor) driver;


    //    --------------------- Next Window  -------------------------------------
    @FindBy(xpath = "//*[@id=\"tab-3\"]")
    private WebElement applyNowBlock;

    public MainPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    private static String getElemDisplayCssValue(WebElement elem, String attribute) {
        return elem.getAttribute(attribute);
    }

    public MainPage creditRequestAnonim(String nameSurname, String phoneNumberValue, long creditAmount, int paymentTerm, long idno, String emailValue) {

        selectBase(driver);
        try {
            userName.sendKeys(nameSurname);
            phoneNumber.sendKeys(phoneNumberValue);
            creditPurpose.click();
            Thread.sleep(1000);
            carOrder.click();
            currency.click();
            Thread.sleep(1000);
            currencyMLD.click();
            String emptyEmountInput = "let amountInp = document.evaluate(\"//*[@id='tab-1']/div[4]/div[1]/div/input\",document, null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue; amountInp.value = '';";
            js.executeScript(emptyEmountInput);
            Thread.sleep(1000);
            creaditAmonut.sendKeys(String.valueOf(creditAmount));
            String emptyTermIninput = "let termInp = document.evaluate(\"//*[@id='tab-1']/div[4]/div[2]/div/input\",document, null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue; termInp.value = '';";
            js.executeScript((emptyTermIninput));
            Thread.sleep(1000);
            creaditTerm.sendKeys(String.valueOf(paymentTerm));
            Thread.sleep(1000);
            String clickCheckBox2 = "let elem2 = document.evaluate(\"//*[@id='tab-1']/div[5]/label[2]/span\",document, null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;elem2.click();";
            js.executeScript(clickCheckBox2);
            Thread.sleep(1000);
            applyCreditBtn.click();
            String mainBlock = getElemDisplayCssValue(userDataForCreditBlock, "aria-hidden");
            String calculateBlock = getElemDisplayCssValue(applyNowBlock, "aria-hidden");

            if (calculateBlock.equals("false") && mainBlock.equals("true")) {
                List<WebElement> offices = driver.findElements(By.xpath("//*[@id=\"tab-3\"]/div[2]/div[2]/div/div[2]/div/div/ul/li"));
                idno_idnp.sendKeys(String.valueOf(idno));
                Thread.sleep(1000);
                email.sendKeys(emailValue);
                Thread.sleep(1000);
                listOfOffices.click();
                Thread.sleep(500);
                offices.get(RandomElem.getRandomElem(offices)).click();
            }
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return this;
    }

    public CreditRequestLoaded userCabinet() {
        js.executeScript("let elem = document.evaluate(\"//*[@id='tab-3']/div[3]/div/div\",document, null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;elem.style.backgroundColor = \"blue\";");
        return new CreditRequestLoaded();
    }


}
