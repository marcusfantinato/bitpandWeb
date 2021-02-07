package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.*;

import java.util.concurrent.TimeUnit;

public class AddingAndRemovingProductsSteps {

    AuthenticationPage authenticationPage;
    HeaderPage headerPage;
    ProductDetailsPage productDetailsPage;
    CheckOutPage checkOutPage;

    public WebDriver driver;

    public AddingAndRemovingProductsSteps() {
        driver = Hooks.driver;
    }


    @Given("the customer is logged on")
    public void theCustomerIsLoggedOn() {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.accessAuthenticationPage();
        authenticationPage.setEmailAddress("automation@bitpanda.com");
        authenticationPage.setPassword("automation@bitpanda.com");
        authenticationPage.clickOnSingIn();
        driver.getPageSource().contains("automation bitpanda");
    }

    @And("added the product {string} to the cart")
    public void addTheProductToTheCart(String arg0) {
        headerPage = new HeaderPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        headerPage.setSearch(arg0);
        headerPage.clickOnBtnSearch();
        productDetailsPage.clickOnTheProduct(arg0);
        productDetailsPage.clickOnAddToCart();
    }

    @When("the customer realized a mistake and remove the product Blouse")
    public void theCustomerRealizedAMistakeAndRemoveTheProductBlouse() {
        checkOutPage = new CheckOutPage(driver);

        headerPage.clickOnCart();
        checkOutPage.deleteProductBlouse();
        headerPage.clickOnCart();
    }

    @Then("The product was removed")
    public void theProductWasRemoved() {
        checkOutPage.productBlouseIsVisible();
    }

}
