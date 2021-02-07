package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {

    @FindBy(id = "email_create")
    WebElement emailCreate;

    @FindBy(id = "SubmitCreate")
    WebElement btnCreateAnAccount;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "email")
    WebElement emailAddress;

    @FindBy(id = "SubmitLogin")
    WebElement btnSingIn;

    WebDriver driver;

    public AuthenticationPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //----Page Actions
    public void accessAuthenticationPage () {

        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        btnCreateAnAccount.isDisplayed();
    }

    public void fillEmailAddress(String emailCreate){
        this.emailCreate.sendKeys(emailCreate);
    }

    public void clickOnCreateAnAccount(){
        btnCreateAnAccount.click();
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress.sendKeys(emailAddress);
    }
    public void setPassword(String password){
        this.password.sendKeys(password);
    }
    public void clickOnSingIn (){
        this.btnSingIn.click();
    }


}
