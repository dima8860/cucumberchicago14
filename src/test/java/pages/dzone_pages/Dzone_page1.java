package pages.dzone_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Dzone_page1 {

    public Dzone_page1(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1")
    public WebElement header1;
}
