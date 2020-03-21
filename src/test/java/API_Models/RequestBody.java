package API_Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data // CREATES FOR US SETTER AND GETTER METHODS
@JsonInclude(JsonInclude.Include.NON_DEFAULT) // please exclude variables that are has default values(NULL, 0...)
@JsonIgnoreProperties(ignoreUnknown = true) // IGNORING ASSIGNING VARIABLES THAT ARE NOT LISTED HERE BUT ARE PRESENT IN JSON FILE
public class RequestBody {
    // for posting API

    String firstName;
    String lastName;
    String joinDate;
    String emailAddress;
    int salary;
    String subject;
    int batch;
    String birthDate;
    String department;
    String gender;
    String password;
    String phone;
    String premanentAddress;
    String section;
    int teacherId;
}
