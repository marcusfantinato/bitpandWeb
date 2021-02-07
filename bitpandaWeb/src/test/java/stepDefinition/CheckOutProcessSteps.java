package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.*;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class CheckOutProcessSteps {

    HeaderPage headerPage;
    CheckOutPage checkOutPage;
    String totalSummary;
    String totalPayment;
    String totalAmount;

    public WebDriver driver;

    public CheckOutProcessSteps() {
        driver = Hooks.driver;
    }

    @When("the customer clicks on cart")
    public void the_customer_clicks_on_cart() {
        headerPage = new HeaderPage(driver);
        headerPage.clickOnCart();
    }

    @And("clicks on Proceed to checkout summary")
    public void clicks_on_proceed_to_checkout_summary() {
        checkOutPage = new CheckOutPage(driver);
        totalSummary = checkOutPage.getCheckTotalSummary();
        checkOutPage.clickOnBtnProceedToCheckout();
        System.out.println("TOTAL SUMMARY: " + totalSummary);

    }

    @And("Clicks on Proceed to checkout address")
    public void clicksOnProceedToCheckoutAddress() {
        checkOutPage.clickOnBtnProceedToCheckoutAddress();
    }

    @And("agrees to the terms and click on Proceed to Checkout")
    public void agrees_to_the_terms_and_click_on_proceed_to_checkout() {
        checkOutPage.clickOnAgreeTerms();
        checkOutPage.clickOnBtnProceedToCheckoutShipping();
    }

    @And("selects the Method of Payment Pay by bank wire")
    public void selectsTheMethodOfPaymentPayByBankWire() {
        totalPayment = checkOutPage.getCheckTotalPayment();
        System.out.println("TOTAL Payment: " + totalPayment);
        checkOutPage.clickOnPayByBankWire();
    }

    @And("clicks on Confirm My Order")
    public void clicks_on_confirm_my_order() {
        checkOutPage.clickOnBtnConfirmMyOrder();
    }

    @Then("The Order is complete")
    public void the_order_is_complete() {
        totalAmount = checkOutPage.getCheckTotalAmount();
        assertEquals(totalPayment, totalAmount);
    }

}
