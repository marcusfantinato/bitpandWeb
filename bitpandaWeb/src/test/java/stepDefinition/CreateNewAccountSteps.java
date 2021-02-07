package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageFactory.AuthenticationPage;
import pageFactory.CreateAnAccountPage;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;


public class CreateNewAccountSteps {
    AuthenticationPage authenticationPage;
    CreateAnAccountPage createAnAccountPage;

    public WebDriver driver;

    DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
    Date date = new Date();

    public CreateNewAccountSteps() {
        driver = Hooks.driver;
    }

    @Given("the user is on Authentication page")
    public void the_user_is_on_authentication_page() {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.accessAuthenticationPage();
    }

    @When("fills in the e-mail address")
    public void fills_in_the_e_mail_address() {
        authenticationPage.fillEmailAddress("automation@"+dateFormat.format(date)+".com");
    }

    @And("clicks on Create")
    public void clicks_on_create() {
        authenticationPage.clickOnCreateAnAccount();
    }

    @And("fills all the mandatory fields")
    public void fills_all_the_mandatory_fields() {
        createAnAccountPage = new CreateAnAccountPage(driver);
        createAnAccountPage.setFirstName("Automation");
        createAnAccountPage.setLastName("BitPanda");
        createAnAccountPage.setPassword("DefaultPass123");
        createAnAccountPage.setAddress("Ocean avenue");
        createAnAccountPage.setAddressLine2("123");
        createAnAccountPage.setCity("New York");
        createAnAccountPage.selectState("New York");
        createAnAccountPage.setPostcode("00012");
        createAnAccountPage.setMobilePhone("0664845987");
    }

    @And("clicks on Register")
    public void clicksOnRegister() {
        createAnAccountPage.clickOnRegister();
    }

    @Then("the system create new account")
    public void the_system_create_new_account() {
        assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", createAnAccountPage.checkWelcomeMessage());

    }


}
