package step_definitions.smartbear_StepsDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.smartBearPages.SmartBearLoginPage;
import utilities.Driver;

public class SmartBearLogin_StepsDefs {
    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();

    @When("User is on home page")
    public void user_is_on_home_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Then("User should be able to enter correct username")
    public void user_should_be_able_to_enter_correct_username() {
        smartBearLoginPage.usernameField.sendKeys("tester");
    }

    @Then("User should be able to enter correct password")
    public void user_should_be_able_to_enter_correct_password() {
        smartBearLoginPage.passwordField.sendKeys("test");
    }

    @Then("User should be able to click on login button")
    public void user_should_be_able_to_click_on_login_button() {
        smartBearLoginPage.loginButton.click();
    }

    @Then("User should see Welcome, Tester! displayed when logged in")
    public void userShouldSeeWelcomeTesterDisplayedWhenLoggedIn() {
        System.out.println(smartBearLoginPage.welcomeText.getText());
        Assert.assertTrue(smartBearLoginPage.welcomeText.getText().contains("tester"));
    }





    @When("User is on SmartBear login page")
    public void user_is_on_SmartBear_login_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @When("User enters correct username")
    public void user_enters_correct_username() {
        smartBearLoginPage.usernameField.sendKeys("tester");
    }

    @When("User enters incorrect password")
    public void user_enters_incorrect_password() {
        smartBearLoginPage.passwordField.sendKeys("testing");
    }

    @When("User clicks to login button")
    public void user_clicks_to_login_button() {
        smartBearLoginPage.loginButton.click();
    }

    @Then("User should see the error message displayed on the page")
    public void user_should_see_the_error_message_displayed_on_the_page() {

    }
}
