package API_Models;

import API_Models.Student.Company;
import API_Models.Student.Contact;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data // CREATES FOR US SETTER AND GETTER METHODS
@JsonInclude(JsonInclude.Include.NON_DEFAULT) // please exclude variables that are has default values(NULL, 0...)
@JsonIgnoreProperties(ignoreUnknown = true) // IGNORING ASSIGNING VARIABLES THAT ARE NOT LISTED HERE BUT ARE PRESENT IN JSON FILE
public class RequestBody {
    // for posting API

    String premanentAddress;
    String section;
    String subject;
    int batch;
    String birthDate;
    String department;
    String gender;
    String password;
    String phone;
    String firstName;
    String lastName;
    String emailAddress;
    String joinDate;
    int salary;
    int teacherId;
    String major;
    String admissionNo;
    Contact contact;
    Company company;
}
