package API_Models.Teacher;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class JacksonTest {

    @Test
    public void jackson() throws JsonProcessingException {
        Teacher teacher = new Teacher();
        teacher.setEmailAddress("gson@gmail.com");
        teacher.setFirstName("Jennifer");
        teacher.setLastName("Lawrence");
        teacher.setSalary(500);
        teacher.setJoinDate("03/15/2020");

        // converting teacher from java object format to json format by using dependency Jackson Core
        /*
         <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.10.0</version>
        </dependency>
         */
        // teacher class must have getters and setters
        // to make it cleaner we can use LOMBOK (both dependency and plugin for Intellij)
        /*
         <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.10</version>
            <scope>provided</scope>
        </dependency>
         */
        // to generate automatically getters and setters
        // to implement it just add @Data before class
        // creating objectMapper which will handle conversion from object to json
        // IF ATTRIBUTE WONT HAVE A FIELD (VALUE) THAN WE DO NEED TO PRINT IT'S DEFAULT VALUE AS NULL OR 0
        // SO, WE ADD TO OBJECT CLASS (TEACHER CLASS) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
        // ADDED RIGHT ABOVE THE CLASS NAME
        //-------------------------------------------
        //1. Create Model class with getter/setter or Lombok for each nested object
        // - @Data --> from Lombok
        // - @JsonInclude(JsonInclude.Include.NON_DEFAULT)  --->> to exclude NULL or 0 when printing
        //2. In TestClass
        //2.1 ObjectMapper objectMapper = new ObjectMapper();
        // ==> Jakson library to convert our Student object to Json format
        //2.2 String studentJson = objectMapper.writeValueAsString(student);
        // ===> converted to Json and stored it as String.


        //
        ObjectMapper objectMapper = new ObjectMapper();
        // storing json file as string
        String teacherJson = objectMapper.writeValueAsString(teacher);
        System.out.println(teacherJson);




    }
}
