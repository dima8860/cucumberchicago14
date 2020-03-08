package pages.smartBearPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartBearLoginPage {
    public SmartBearLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameField;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordField;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='login_info']")
    public WebElement welcomeText;

}
