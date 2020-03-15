package apiTests.ApiModels_POJO.Student;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class TestingStudent {

    // converting teacher from java object format to json format by using dependency Jackson Core
    // teacher class must have getters and setters
    // to make it cleaner we can use LOMBOK (both dependency and plugin for intellij)
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

    @Test
    public void testingStudent() throws JsonProcessingException {

        Address address = new Address();
        address.setStreet("123 Main st");
        address.setCity("Chicago");
        address.setState("IL");
        address.setZipCode(30010);

        Company company = new Company();
        company.setCompanyName("Tesla");
        company.setAddress(address);

        Contact contact = new Contact();
        contact.setEmail("bestemail@gmail.com");
        contact.setPhone("7738859124");

        Student student = new Student();
        student.setFirstName("Dmytro");
        student.setLastName("Cher");
        student.setCompany(company);
        student.setContact(contact);
        student.setStudentId(123);

        ObjectMapper objectMapper = new ObjectMapper();
        // storing json file as string
        String studentJson = objectMapper.writeValueAsString(student);
        System.out.println(studentJson);

    }
}
