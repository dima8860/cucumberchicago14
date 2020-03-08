package pages.wikipedia_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikipediaResultsPage {
    public WikipediaResultsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[@class='firstHeading']")
    public WebElement headerText;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement imageText;
}
