package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static junit.framework.TestCase.assertEquals;


public class CheckOutPage {

    @FindBy(id = "cart_quantity_down_2_7_0_440095")
    WebElement productBlouse;

    @FindBy(id = "total_price")
    WebElement checkTotal;

    @FindBy(css = ".standard-checkout.button-medium")
    WebElement btnProceedToCheckout;

    @FindBy(name = "processAddress")
    WebElement btnProceedToCheckoutAddress;

    @FindBy(id = "uniform-cgv")
    WebElement agreeTerms;

    @FindBy(name = "processCarrier")
    WebElement btnProceedToCheckoutShipping;

    @FindBy(css = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a")
    WebElement payByBankWire;

    @FindBy(css = "#cart_navigation > button")
    WebElement btnConfirmMyOrder;

    @FindBy(xpath = "//*[@class='price']")
    WebElement totalAmount;

    WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//----Page Actions

    public String getCheckTotalSummary() {
        return checkTotal.getText();
    }

    public void deleteProductBlouse() {
        productBlouse.click();
    }

    public void productBlouseIsVisible() {
        int isVisible =  driver.findElements(By.id("cart_quantity_down_2_7_0_440095")).size();
        assertEquals(0, isVisible);
    }

    public void clickOnBtnProceedToCheckout() {
        btnProceedToCheckout.click();
    }

    public void clickOnBtnProceedToCheckoutAddress() {
        btnProceedToCheckoutAddress.click();
    }

    public String getCheckTotalPayment() {
        return checkTotal.getText();
    }

    public void clickOnPayByBankWire() {
        payByBankWire.click();
    }

    public void clickOnAgreeTerms() {
        agreeTerms.click();
    }

    public void clickOnBtnProceedToCheckoutShipping() {
        btnProceedToCheckoutShipping.click();
    }

    public void clickOnBtnConfirmMyOrder() {
        btnConfirmMyOrder.click();
    }

    public String getCheckTotalAmount() {
        return totalAmount.getText();
    }

}

