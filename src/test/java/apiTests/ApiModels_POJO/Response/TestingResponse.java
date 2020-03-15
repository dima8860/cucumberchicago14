package apiTests.ApiModels_POJO.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class TestingResponse {

    @Test
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

    @Test
    public void studentJoinAfter2020() throws JsonProcessingException {
        Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        String student = response.asString();
       // System.out.println(student);

        ObjectMapper objectMapper = new ObjectMapper();
        ResponseBody rb = objectMapper.readValue(response.asString(), ResponseBody.class);
        int count = 0;
        for(int i = 0; i < rb.getStudents().size(); i++) {
            String joined = rb.getStudents().get(i).getCompany().getStartDate();
            if(joined.endsWith("2020")) count++;
        }
        System.out.println(count);
    }
}
