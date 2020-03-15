package apiTests.JASONpack;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class MyApi {

    @Test
    public void getTeacher() {
        //Step 1. Hit API
        // HTTP method, endpoint, body, header.
        // Can print it asString to see result but can not manipulate data, so read next:
        // Will return us 1 object or many objects with mandatory and optional attributes
        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/1629");

        System.out.println(response.statusCode());
        System.out.println(response.asString());
        // CREATING / (CONVERTING RESPONSE) to object of JSON file
        // so we will be able to get any ATTRIBUTE or field from object by using JSON-PATH-WEBSITE
        //and compare it with expected result
        JsonPath jp = response.jsonPath();
        String firstName = jp.get("teachers[0].firstName");
        System.out.println(firstName);
        Assert.assertTrue(firstName != null);

    }

    @Test
    public void getAllTeachersAttributeVerification() {
        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/all");
        Assert.assertEquals("API server down", 200, response.statusCode());
        System.out.println(response.asString());
        JsonPath jp = response.jsonPath();
        int size = jp.getList("teachers").size();
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            String pathName = "teachers[" + i + "].firstName";
            String pathEmail = "teachers[" + i + "].emailAddress";
            String name = jp.get(pathName);
            String email = jp.get(pathEmail);
            Assert.assertTrue(name != null);
            Assert.assertTrue(email != null);

        }
    }

    @Test
    public void checkDepartmentName() {
        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/department/Computer");
        Assert.assertEquals("API server down", 200, response.statusCode());
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        JsonPath jp = response.jsonPath();
        int size = jp.getList("teachers").size();
        System.out.println(size);
        for(int i = 0; i < size; i++){
            String path = "teachers[" + i + "].department";
            String department = jp.get(path);
            System.out.println(department);
            Assert.assertEquals("Department failed at: " + i, "Computer", department);

        }


    }
}




