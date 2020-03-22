package apiTests.TestingUtil;

import org.junit.Assert;
import org.junit.Test;
import utilities.APIUtil;
import utilities.Log;

public class TestingUtilDelete {
    @Test
    public void deleteAPI() {
        String recourse = "/teacher/delete/2721";
        APIUtil.hitDELETE(recourse);
    }

    @Test
    public void deleteTeacherPositive(){
        String resource = "/teacher/delete/2727";
        APIUtil.hitDELETE(resource);
        String resource2 = "/teacher/2727";
        APIUtil.hitGET(resource2);
        String actualMessage = APIUtil.getResponseBody().getMessage();
        String expectedMessage = "Teacher with id = 2727 NOT FOUND!";
        System.out.println(actualMessage);
        Assert.assertEquals(actualMessage,expectedMessage);
        Log.info("passed");
    }

    @Test
    public void deleteTeacherNegative(){
        // PASSING TEACHER ID THAT DOES NOT EXIST
        String resource = "/teacher/delete/2727";
        APIUtil.hitDELETE(resource);
        String actualMessage = APIUtil.getResponseBody().getMessage();
        String expectedMessage = "Teacher with id = 2727 NOT FOUND!";
        System.out.println(actualMessage);
        Assert.assertEquals(actualMessage,expectedMessage);
        Assert.assertTrue(APIUtil.getResponseBody().getStatus()>= 400 &&APIUtil.getResponseBody().getStatus() < 500);
        System.out.println(APIUtil.getResponseBody().getStatus());
        Log.info("passed");
    }
}
