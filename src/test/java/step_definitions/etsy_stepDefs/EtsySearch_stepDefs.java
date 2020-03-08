package step_definitions.etsy_stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.etsy_pages.EtsyHomePage;
import utilities.Config;
import utilities.Driver;

public class EtsySearch_stepDefs {
    EtsyHomePage etsyHomePage = new EtsyHomePage();

    @Given("User is on Etsy home page")
    public void user_is_on_Etsy_home_page() {
        Driver.getDriver().get(Config.getProperty("etsyURL"));

    }

    @When("User searches for wooden spoon")
    public void user_searches_for_wooden_spoon() {
        etsyHomePage.searcBox.sendKeys("wooden spoon" + Keys.ENTER);

    }

    @Then("User should see wooden spoon in Etsy title")
    public void user_should_see_wooden_spoon_in_Etsy_title() throws InterruptedException {
        String expected = "wooden spoon";
        String actual = Driver.getDriver().getTitle().toLowerCase();
        System.out.println(actual);
       // Thread.sleep(2000);
        Assert.assertTrue(actual.contains(expected));

    }

    @When("User searches for {string}")
    public void user_searches_for(String searchValue) {
        etsyHomePage.searcBox.sendKeys(searchValue + Keys.ENTER);
    }

    @Then("User should see {string} in Etsy title")
    public void user_should_see_in_Etsy_title(String searchValue) {
        String expected = searchValue;
        String actual = Driver.getDriver().getTitle().toLowerCase();
        System.out.println(actual);
        // Thread.sleep(2000);
        Assert.assertTrue(actual.contains(expected));

    }

}
