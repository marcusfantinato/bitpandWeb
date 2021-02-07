package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TShirtsPage {

    @FindBy(id = "layered_id_attribute_group_1")
    WebElement sizeS;

    @FindBy(id= "layered_id_feature_5")
    WebElement compositionsCotton;

    @FindBy(id= "layered_quantity_1")
    WebElement availabilityInStock;

    @FindBy(id= "layered_condition_new")
    WebElement conditionNew;


    WebDriver driver;

    public TShirtsPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //----Page Actions

    public void selectSizeS(){
        sizeS.click();
    }

    public void selectCompositionsCotton(){
        compositionsCotton.click();
    }

    public void selectAvailabilityInStock(){
        availabilityInStock.click();
    }

    public void selectConditionNews(){
        conditionNew.click();
    }


}
