package apiTests.ApiModels_POJO.Response;

import API_Models.ResponseBody;
import API_Models.Teacher.Teacher;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import utilities.Config;

public class TestingResponse {

    @Test
    public void testingApiPUT() throws JsonProcessingException {
        // 1.GETTING INFO FROM DATABASE
        ObjectMapper objectMapper = new ObjectMapper();
        Response responseGet = RestAssured.get(Config.getProperty("baseURL") + "/teacher/2908");
        System.out.println(responseGet.asString());
        ResponseBody responseBody = objectMapper.readValue(responseGet.asString(),ResponseBody.class);
        Teacher teacher = responseBody.getTeachers().get(0);
        System.out.println(teacher);
        // 2. EDITING DATA IN OBJECT
        teacher.setEmailAddress("cyberLIONEL@yahoo.com");
        teacher.setFirstName("Lionel the best");
        // 3. CONVERTING OBJECT TO JSON
        String teacherJson = objectMapper.writeValueAsString(teacher);
        // 4. SENDING JSON TO DATABASE
        responseGet = RestAssured.given().contentType(ContentType.JSON).body(teacherJson).when().put(Config.getProperty("baseURL") + "/teacher/update");
        System.out.println(responseGet.asString());
        System.out.println(responseGet.statusCode());


    }

    @Test
    //PUT API
    public void updateTeacherUPDATED() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Response response = RestAssured.get(Config.getProperty("baseURL") + "/teacher/2445");
        ResponseBody rb = mapper.readValue(response.asString(), ResponseBody.class);
        Teacher teacher = rb.getTeachers().get(0);
        teacher.setFirstName("QWERTY");
        teacher.setLastName("POST");
        teacher.setTeacherId(2445);


        String teacherJson = mapper.writeValueAsString(teacher);
        System.out.println(teacherJson);
        response = RestAssured.given().contentType(ContentType.JSON).body(teacherJson).when().put(Config.getProperty("baseURL")+"/teacher/update");
        System.out.println(response.getStatusCode());
        System.out.println(response.asString());
    }

    @Test
    // PUT API
    public void updateTeacher() throws JsonProcessingException {
        Teacher teacher = new Teacher();
        teacher.setEmailAddress("jb2020@gmail.com");
        teacher.setFirstName("PostmanNew");
        teacher.setJoinDate("11/11/18");
        teacher.setLastName("DukhNew");
        teacher.setGender("Male");
        teacher.setPhone("857-111-2345");
        teacher.setPassword("324555");
        teacher.setPremanentAddress("23 Wolf rd, Des Plaines,  il ");
        teacher.setSubject("qwer");
        teacher.setDepartment("Sports");
        teacher.setSection("tree");
        teacher.setSalary(20000);
        teacher.setBirthDate("11/11/80");
        teacher.setBatch(11);
        teacher.setTeacherId(2445);

        ObjectMapper objectMapper = new ObjectMapper();
        String teacherJson = objectMapper.writeValueAsString(teacher);
        System.out.println(teacherJson);

        Response response = RestAssured.given().contentType(ContentType.JSON).body(teacherJson).put("http://api.cybertektraining.com/teacher/update");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
    }

    @Test
    // POST API  *******************
    public void createTeacherTest() throws JsonProcessingException {
        Teacher teacher = new Teacher();
        teacher.setEmailAddress("jb2020@gmail.com");
        teacher.setFirstName("Last Bird");
        teacher.setJoinDate("11/11/18");
        teacher.setLastName("Dukh");
        teacher.setGender("Male");
        teacher.setPhone("857-111-2345");
        teacher.setPassword("324555");
        teacher.setPremanentAddress("23 Wolf rd, Des Plaines,  il ");
        teacher.setSubject("qwer");
        teacher.setDepartment("Sports");
        teacher.setSection("tree");
        teacher.setSalary(20000);
        teacher.setBirthDate("11/11/80");
        teacher.setBatch(11);

        ObjectMapper objectMapper = new ObjectMapper();
        String teacherJson = objectMapper.writeValueAsString(teacher);
        System.out.println(teacherJson);

        Response response = RestAssured.given().contentType(ContentType.JSON).body(teacherJson).when().post("http://api.cybertektraining.com/teacher/create");

        System.out.println(response.statusCode());
        System.out.println(response.asString());
    }

    @Test
    public void verifyTeacherEmail() throws JsonProcessingException {
        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/all");
        String teachers = response.asString();
        System.out.println(teachers);
        Assert.assertEquals("List of teachers api failed", 200, response.statusCode());
        // JSON == ResponseBody
        ObjectMapper objectMapper = new ObjectMapper();
        ResponseBody rb = objectMapper.readValue(response.asString(), ResponseBody.class);
        // System.out.println(rb.getTeachers().get(0).getEmailAddress());
        int count = 0;
        for (int i = 0; i < rb.getTeachers().size(); i++) {
            String email = rb.getTeachers().get(i).getEmailAddress();
            //  System.out.println(email);
            if (!rb.getTeachers().get(i).getEmailAddress().contains(".") || !rb.getTeachers().get(i).getEmailAddress().contains("@")) {
                System.out.println(rb.getTeachers().get(i).getEmailAddress());
                count++;
            }

        }
        System.out.println("Total wrong emails: " + count);
    }

    @Test
    public void studentGet() throws Exception {
        Response response = RestAssured.get("http://api.cybertektraining.com/student/7157");
        String student = response.asString();
        System.out.println(student);


        ObjectMapper objectMapper = new ObjectMapper();  // json to java OR java to json

        // assigning values for instance variables to object from json file
        // 2 parameters: response.asString, and to which class ResponseBody.class
        ResponseBody rb = objectMapper.readValue(response.asString(), ResponseBody.class);
        // accessing variable from object
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
        for (int i = 0; i < rb.getStudents().size(); i++) {
            String joined = rb.getStudents().get(i).getCompany().getStartDate();
            if (joined.endsWith("2020")) count++;
        }
        System.out.println(count);
    }
}
