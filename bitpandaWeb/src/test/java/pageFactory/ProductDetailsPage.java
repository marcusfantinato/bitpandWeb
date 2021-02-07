package pageFactory;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

    @FindBy(name = "Submit")
    WebElement btnAddToCart;

    WebDriver driver;

    public ProductDetailsPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //----Page Actions

    public void clickOnAddToCart(){
        btnAddToCart.click();
    }

    public void clickOnTheProduct(String product){
        driver.findElement(By.xpath("//*[@itemprop='name']//*[@title=" + '"' + product +'"'+"]")).click();;
    }






}
