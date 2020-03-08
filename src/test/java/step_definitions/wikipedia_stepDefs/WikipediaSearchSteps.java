package step_definitions.wikipedia_stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.wikipedia_pages.WikipediaHomePage;
import pages.wikipedia_pages.WikipediaResultsPage;
import utilities.Driver;


public class WikipediaSearchSteps {
    WikipediaHomePage wikipediaHomePage = new WikipediaHomePage();
    WikipediaResultsPage wikipediaResultsPage = new WikipediaResultsPage();

    @When("User is onWikipedia home page")
    public void user_is_onWikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @Then("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        wikipediaHomePage.searchBox.sendKeys(string);
    }

    @Then("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
       wikipediaHomePage.searchButton.click();
    }

    @Then("User sees {string} is in thewikititle")
    public void user_sees_is_in_thewikititle(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = string + " - Wikipedia";
        System.out.println("1 Expected " + string + " , actual " + actualTitle);
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));

    }

    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String string) {
        String expectedHeader = string;
        String actualHeader = wikipediaResultsPage.headerText.getText().trim();
        System.out.println("2 Expected " + string + " , actual " + actualHeader);
        Assert.assertTrue(actualHeader.equals(expectedHeader));

    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String string) {
        String expectedText = string;
        String actualText = wikipediaResultsPage.imageText.getText().trim();
        System.out.println("3 Expected " + string + " , actual " + actualText);
        Assert.assertTrue(actualText.equals(expectedText));

    }

}
