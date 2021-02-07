package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

    @FindBy(className = "login")
    WebElement btnSignIn;

    @FindBy(css= "#block_top_menu > ul > li:nth-child(1) > a")
    WebElement menuWomen;

    @FindBy(css= "#block_top_menu > ul > li:nth-child(2) > a")
    WebElement menuDresses;

    @FindBy(css= "#block_top_menu > ul > li:nth-child(3) > a")
    WebElement menuTShirts;

    @FindBy(id= "search_query_top")
    WebElement search;

    @FindBy(name= "submit_search")
    WebElement btnSearch;

    @FindBy(css= "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")
    WebElement menuCart;


    WebDriver driver;

    public HeaderPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//----Page Actions
    public void accessMainPage () {

        driver.navigate().to("http://automationpractice.com/index.php");
        menuWomen.isDisplayed();
        menuDresses.isDisplayed();
        btnSignIn.isDisplayed();
    }

    public void clickOnMenuTShirts(){
        menuTShirts.click();
    }

    public void setSearch(String search){
        this.search.clear();
        this.search.sendKeys(search);
    }

    public void clickOnBtnSearch(){
        btnSearch.click();
    }

    public void clickOnCart(){
        menuCart.click();
    }

}
