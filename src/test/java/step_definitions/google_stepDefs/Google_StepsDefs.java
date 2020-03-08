package step_definitions.google_stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.google_pages.GoogleLandingPage;
import utilities.Driver;

import java.util.Map;

public class Google_StepsDefs {

    GoogleLandingPage googleLandingPage = new GoogleLandingPage();

    @When("User is on google page")
    public void user_is_on_google_page() {
        //1 get the google page
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("User should see title contains Google")
    public void user_should_see_title_contains_Google() {
        // 2 - compare the actual title vs expected title
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertTrue("Title does not contain expected value!",actualTitle.contains(expectedTitle));
    }

    @When("User types wooden spoon into th search box")
    public void user_types_wooden_spoon_into_th_search_box() {
        googleLandingPage.SearchBox.sendKeys("wooden spoon" + Keys.ESCAPE);

    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() {
       googleLandingPage.searchButton.click();
    }

    @Then("User should see wooden spoon in the title")
    public void user_should_see_wooden_spoon_in_the_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "wooden spoon";
        Assert.assertTrue("Title doesn't match", actualTitle.contains(expectedTitle));
    }

    @Given("teacher value")
    public void teacher_value(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        System.out.println(data.get("first_name"));
        System.out.println(data.get("last_name"));
    }

}
