package apiTests.ApiModels_POJO.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test {

    @org.junit.Test
    public void studentGet() throws Exception {
        Response response = RestAssured.get("http://api.cybertektraining.com/student/7157");
        String student = response.asString();
        System.out.println(student);

        ObjectMapper objectMapper = new ObjectMapper();  // json to java OR java to json

        // converting json to object
        ResponseBody rb = objectMapper.readValue(response.asString(), ResponseBody.class);
        String firstName = rb.getStudents().get(0).getFirstName();
        // @JsonIgnoreProperties(ignoreUnknown = true) ==>
        // ignore unknown properties(attributes) when comparing
        // response json file and our Model classes (in case we did not declared all attributes from json file)
        System.out.println(firstName);
    }
}
