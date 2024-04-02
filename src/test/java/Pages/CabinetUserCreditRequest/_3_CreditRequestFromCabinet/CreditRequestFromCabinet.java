package Pages.CabinetUserCreditRequest._3_CreditRequestFromCabinet;

import Core.CoreSeleniumPage;
import Helpers.RandomElem;
import Pages.CabinetUserCreditRequest._4_CheckMyRequests.CheckRequests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CreditRequestFromCabinet extends CoreSeleniumPage {

    public CreditRequestFromCabinet() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div/div/div[2]/div/p/span")
    WebElement creditPurpose;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div/div[1]/div/input")
    WebElement creditAmountInput;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div/div[2]/div/input")
    WebElement paymetnsTermInput;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[4]/div/div/div/div[2]/div/p/span")
    WebElement chooseOffice;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[5]/div[2]/div[1]/div/input")
    WebElement yourNameInput;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[5]/div[2]/div[2]/div/input")
    WebElement yourSurnameInput;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[5]/div[2]/div[3]/div/input")
    WebElement yourPhonenumberInput;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[2]/div[1]/div/input")
    WebElement yourPassportImageInput;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[2]/div[3]/label[2]/span")
    WebElement acceptSiteConditions;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[2]/div[4]")
    WebElement sendRequestBTN;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div[3]/div/div/input")
    WebElement carDescrInput;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/form/div[2]/div[2]/div/input")
    WebElement passTexnImagePath;

    @FindBy(xpath = "/html/body/header/div/div[3]/div/div/div[4]/div[3]/a/span[2]")
    WebElement myCreditsBtn;

    JavascriptExecutor js = (JavascriptExecutor) driver;
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public CreditRequestFromCabinet sendCreditRequest(int amountCredit, int payTerm, String username, String userSurename, String userPhoneNumber, String passportImagePath, String carDescr, String passTehn) throws InterruptedException {
        creditPurpose.click();
        Thread.sleep(1000);
        List<WebElement> listOfPurtposes = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div/div/div[2]/div/div/ul/li"));
        WebElement purpose = listOfPurtposes.get(RandomElem.getRandomElem(listOfPurtposes));
        wait.until(ExpectedConditions.elementToBeClickable(purpose));
        System.out.println(purpose);
        purpose.click();
        String textSpan = creditPurpose.getText();
        System.out.println(textSpan);
        if (textSpan.equals("Procurare automobil")) {

            WebElement creditAmountForCar = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div[1]/div[1]/div/input"));
            WebElement listOfCurrency = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/p/span"));

            creditAmountForCar.sendKeys(String.valueOf(amountCredit));
            wait.until(ExpectedConditions.elementToBeClickable(listOfCurrency));
            listOfCurrency.click();

            List<WebElement> listOfCurrencyelems = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div[1]/div[2]/div/div[2]/div/div/ul/li"));

            WebElement clickableElemFromList = listOfCurrencyelems.get(RandomElem.getRandomElem(listOfCurrencyelems));
            wait.until(ExpectedConditions.elementToBeClickable(clickableElemFromList));
            System.out.println(clickableElemFromList);
            clickableElemFromList.click();

            js.executeScript("let elem = document.evaluate(\"/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[3]/div[1]/label/span\",document, null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;elem.click();");
            carDescrInput.sendKeys(carDescr);
            passTexnImagePath.sendKeys(passTehn);
        } else if (textSpan.equals("Procurare imobil")) {

            WebElement creditAmountForAppt = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div[1]/div[1]/div/input"));
            WebElement listOfCurrency = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/p/span"));

            creditAmountForAppt.sendKeys(String.valueOf(amountCredit));
            listOfCurrency.click();
        } else if (textSpan.equals("Dezvoltarea afacerii")) {
            js.executeScript("let elem = document.evaluate(\"/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div[1]/div[1]/div/input\",document, null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;elem.value = '';");
            WebElement amountInput = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div[1]/div[1]/div/input"));
            amountInput.sendKeys(String.valueOf(amountCredit));
            WebElement payCreditTerm = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div[2]/div/div/input"));
            payCreditTerm.sendKeys(String.valueOf(payTerm));
        } else {
            Thread.sleep(1000);
            creditAmountInput.sendKeys(String.valueOf(amountCredit));
            paymetnsTermInput.sendKeys(String.valueOf(payTerm));
        }
        chooseOffice.click();
        Thread.sleep(1000);
        List<WebElement> listOfOffices = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/form/div[1]/div[4]/div/div/div/div[2]/div/div/ul/li"));
        listOfOffices.get(RandomElem.getRandomElem(listOfOffices)).click();
        yourNameInput.sendKeys(String.valueOf(username));
        yourSurnameInput.sendKeys(String.valueOf(userSurename));
        yourPhonenumberInput.sendKeys(String.valueOf(userPhoneNumber));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", chooseOffice);

        yourPassportImageInput.sendKeys(String.valueOf(passportImagePath));
        js.executeScript("let elem = document.evaluate(\"/html/body/div[4]/div[2]/div[2]/div/div/form/div[2]/div[3]/label[2]/span\",document, null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;elem.click();");

//        js.executeScript("let elemBTN = document.evaluate(\"/html/body/div[4]/div[2]/div[2]/div/div/form/div[2]/div[4]/div\",document, null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;elemBTN.style.backgroundColor = 'red';");
        js.executeScript("let elemBTN = document.evaluate(\"/html/body/div[4]/div[2]/div[2]/div/div/form/div[2]/div[4]/div\",document, null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;elemBTN.style.backgroundColor = 'red';");

        Thread.sleep(1000);
        return this;


    }

    public CheckRequests checkRequests() {
        myCreditsBtn.click();
        return new CheckRequests();
    }


}
