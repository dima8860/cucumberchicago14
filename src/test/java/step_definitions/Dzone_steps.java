package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.dzone_pages.Dzone_page1;
import pages.dzone_pages.Dzone_page2;
import utilities.Driver;
import utilities.Log;
import utilities.TempStorage;

public class Dzone_steps {
    Dzone_page1 dzone_page1 = new Dzone_page1();
    Dzone_page2 dzone_page2 = new Dzone_page2();
    String head1;
    String head2;
    int test_again_count;
    @When("user is on first page we get header")
    public void user_is_on_first_page_we_get_header() {
        Driver.getDriver().get("https://dzone.com/articles/gradle-vs-maven");
        Log.info("user is on: https://dzone.com/articles/gradle-vs-maven " );
        head1 = dzone_page1.header1.getText();
        TempStorage.addData("test1", head1);
        Log.info("header 1 is taken: " + head1);

    }

    @When("user is on secod page we get header")
    public void user_is_on_secod_page_we_get_header() {
        Driver.getDriver().get("https://dzone.com/articles/api-security-weekly-issue-71");
        Log.info("user is on: https://dzone.com/articles/api-security-weekly-issue-71" );
        head2 = dzone_page2.header2.getText();
        TempStorage.addData("test2", head2);
        Log.info("header 2 is taken: " + head2);
    }

    @Then("we compare headers")
    public void we_compare_headers() {
        Log.warn("comparing data");
        System.out.println(TempStorage.getData("test1") + ",  " + TempStorage.getData("test2"));
        test_again();
        Assert.assertEquals(TempStorage.getData("test1"),TempStorage.getData("test2"));
    }
    @Then("test again")
    public void test_again() {
        if(test_again_count == 1) return;
        if(!TempStorage.getData("test1").equals(TempStorage.getData("test2"))){
            test_again_count++;
            user_is_on_first_page_we_get_header();
            user_is_on_secod_page_we_get_header();
            we_compare_headers();
        }

    }

}
