package apiTests.ApiModels_POJO.Student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Student {
    int studentId;
    String firstName;
    String lastName;
    Contact contact;
    Company company;

}
