package pageFactory;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage {


    @FindBy(id = "customer_firstname")
    WebElement firstName;

    @FindBy(id = "customer_lastname")
    WebElement lastName;

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "address1")
    WebElement address;

    @FindBy(id = "address2")
    WebElement addressLine2;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "id_state")
    WebElement state;

    @FindBy(id = "postcode")
    WebElement postcode;

    @FindBy(id = "phone_mobile")
    WebElement mobilePhone;

    @FindBy(id = "submitAccount")
    WebElement btnRegister;

    @FindBy(css = "#center_column > p")
    WebElement welcomeMessage;

    WebDriver driver;

    public CreateAnAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //----Page Actions
    public void setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void setAddress(String address) {
        this.address.sendKeys(address);
    }

    public void setAddressLine2(String address) {
        this.addressLine2.sendKeys(address);
    }

    public void setCity(String city){
        this.city.sendKeys(city);
    }

    public void selectState(String state) {
        Select dropDown = new Select(this.state);
        dropDown.selectByVisibleText(state);
    }

    public void setPostcode(String postcode) {
        this.postcode.sendKeys(postcode);
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone.sendKeys(mobilePhone);
    }

    public void clickOnRegister() {
        btnRegister.click();
    }

    public String checkWelcomeMessage() {
       return welcomeMessage.getText();
    }

}