package pages.dzone_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Dzone_page2 {
    public Dzone_page2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1")
    public WebElement header2;
}
