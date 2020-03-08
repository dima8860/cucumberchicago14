package pages.wikipedia_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikipediaHomePage {
    public WikipediaHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@id='searchInput']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement searchButton;


}
