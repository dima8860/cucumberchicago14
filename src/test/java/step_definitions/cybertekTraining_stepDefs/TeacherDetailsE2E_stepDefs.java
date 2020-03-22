package step_definitions.cybertekTraining_stepDefs;

import API_Models.Teacher.Teacher;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.cybertekTraining.CBTHomePage;
import utilities.APIUtil;
import utilities.Config;
import utilities.Driver;

import java.util.List;

public class TeacherDetailsE2E_stepDefs {
    CBTHomePage cbtHomePage = new CBTHomePage();
    @Given("user goes to cybertek training application")
    public void user_goes_to_cybertek_training_application() {
        Driver.getDriver().get(Config.getProperty("cybertekTrainingURL"));
    }

    @Then("user opens teacher profile details page {string}")
    public void user_opens_teacher_profile_details_page(String teacherID) throws InterruptedException {
            cbtHomePage.teachersDropdown.click();
            cbtHomePage.allTeachersLink.click();
            Thread.sleep(500);
            cbtHomePage.teacher_ID_search.sendKeys(teacherID);
            cbtHomePage.searchBtn.click();
            cbtHomePage.avatar.click();
    }

    @Then("user cross validates teacher details on API and on UI")
    public void user_cross_validates_teacher_details_on_API_and_on_UI() {
        String apiFulName = APIUtil.getResponseBody().getTeachers().get(0).getFirstName() + " "
                           + APIUtil.getResponseBody().getTeachers().get(0).getLastName();
        String uiFullName = cbtHomePage.fullName.getText();
        System.out.println(apiFulName);
        System.out.println(uiFullName);
        Assert.assertEquals("E2E full name verification failed", apiFulName, uiFullName);
        Assert.assertEquals("E2E phone verification failed", APIUtil.getResponseBody().getTeachers().get(0).getPhone().trim(), cbtHomePage.phoneNumber.getText().trim());
        Assert.assertEquals("E2E batch verification failed", (APIUtil.getResponseBody().getTeachers().get(0).getBatch()+ "").trim(), cbtHomePage.batch.getText().trim());
        Assert.assertEquals("E2E email verification failed", (APIUtil.getResponseBody().getTeachers().get(0).getEmailAddress()+ "").trim(), cbtHomePage.email.getText().trim());
        Assert.assertEquals("E2E birthday verification failed", (APIUtil.getResponseBody().getTeachers().get(0).getBirthDate()+ "").trim(), cbtHomePage.birthday.getText().trim());
        Assert.assertEquals("E2E join date verification failed", (APIUtil.getResponseBody().getTeachers().get(0).getJoinDate()+ "").trim(), cbtHomePage.joinDate.getText().trim());
        Assert.assertEquals("E2E permanent address verification failed", (APIUtil.getResponseBody().getTeachers().get(0).getPremanentAddress()+ "").trim(), cbtHomePage.address.getText().trim());
    }

    @Then("user searches for teachers with name {string}")
    public void user_searches_for_teachers_with_name(String teacherName) throws InterruptedException {
        cbtHomePage.teachersDropdown.click();
        cbtHomePage.allTeachersLink.click();
        Thread.sleep(500);
        cbtHomePage.teacherNameSearch.sendKeys(teacherName);
        cbtHomePage.searchBtn.click();
        Thread.sleep(500);

    }


    @Then("user cross validates teachers name result on API and on UI with {string}")
    public void user_cross_validates_teachers_name_result_on_API_and_on_UI_with(String teacherName) {
        // 1.Number of results API vs UI
        // 2. Data validation on UI
        // 3. Data validation on API

        int APIresult = APIUtil.getResponseBody().getTeachers().size();
        int UIresult = cbtHomePage.searchResultsName.size();
        System.out.println(APIresult);
        System.out.println(UIresult);
        Assert.assertEquals("Number of results failed", APIresult,UIresult);

        // 2. Data validation on UI
        List<WebElement> teachers = cbtHomePage.searchResultsName;
        for(WebElement teacher: teachers) {
             Assert.assertTrue("Teacher name failed on UI", teacher.getText().equals(teacherName));
        }

        // 3. Data validation on API

        List<Teacher> teachersAPI = APIUtil.getResponseBody().getTeachers();
        for(Teacher teacher: teachersAPI) {
            Assert.assertTrue("Teacher name failed on API", teacher.getFirstName().equals(teacherName));
        }
    }

}
