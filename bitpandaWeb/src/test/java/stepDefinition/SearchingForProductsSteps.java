package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageFactory.*;

public class SearchingForProductsSteps {
    HeaderPage headerPage;
    TShirtsPage menuTShirtPage;

    public WebDriver driver;

    public SearchingForProductsSteps() {
        driver = Hooks.driver;
    }

    @Given("the customer is in the main page and wants to search for new t shirt")
    public void the_customer_is_in_the_main_page_and_wants_to_search_for_new_t_shirt() {
        headerPage = new HeaderPage(driver);
        headerPage.accessMainPage();
    }

    @When("the customer select T shirt category, size S, Cotton, In Stock and New")
    public void the_customer_select_t_shirt_category_size_s_cotton_in_stock_and_new() {
        headerPage.clickOnMenuTShirts();
        menuTShirtPage = new TShirtsPage(driver);
        menuTShirtPage.selectSizeS();
        menuTShirtPage.selectCompositionsCotton();
        menuTShirtPage.selectAvailabilityInStock();
        menuTShirtPage.selectConditionNews();
    }

    @Then("the website shows the Faded Short Sleeve T-shirts")
    public void the_website_shows_the_faded_short_sleeve_t_shirts() {
        driver.findElement(By.xpath("//*[@title='Faded Short Sleeve T-shirts']")).isDisplayed();
    }

}
