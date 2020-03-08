package pages.gasMilageCalculator_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GasMileageCalculator_page {

    public GasMileageCalculator_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "#uscodreading")
    public WebElement currentOdometer ;

    @FindBy (css = "#uspodreading")
    public WebElement previousOdometer ;

    @FindBy (css = "#usgasputin")
    public WebElement gasAdded ;

    @FindBy (xpath = "(//input[@value='Calculate'])[1]")
    public WebElement calculateButton ;

    @FindBy (xpath = "//b[contains(text(), 'mpg')]")
    public WebElement resultInGas;
}
