package apiTests.TestingUtil;

import API_Models.RequestBody;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import utilities.APIUtil;

public class TestingUtilPOST {

    @Test
    public void postTesting(){
        RequestBody requestBody = new RequestBody();
        requestBody.setEmailAddress("jb2020@gmail.com");
        requestBody.setFirstName("Qa Analyst");
        requestBody.setJoinDate("11/11/18");
        requestBody.setLastName("Bandera");
        requestBody.setGender("Male");
        requestBody.setPhone("857-111-2345");
        requestBody.setPassword("324555");
        requestBody.setPremanentAddress("23 Wolf rd, Des Plaines, il ");
        requestBody.setSubject("qwer");
        requestBody.setDepartment("Sports");
        requestBody.setSection("tree");
        requestBody.setSalary(20000);
        requestBody.setBirthDate("11/11/80");
        requestBody.setBatch(11);

        APIUtil.hitPOST("/teacher/create", requestBody);
        System.out.println(APIUtil.getResponseBody().getTeachers().size());
    }

    @Test
    public void authentication() {
        Response response = RestAssured.given().header("username", "password").get("http://api.cybertektraining.com/teacher/all");
        System.out.println(response.statusCode());
        String str = response.asString();
        System.out.println(str);





    }
}
