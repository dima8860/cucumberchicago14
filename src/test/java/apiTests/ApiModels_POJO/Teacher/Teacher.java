package apiTests.ApiModels_POJO.Teacher;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT) // please exclude variables that are has default values(NULL, 0...)
public class Teacher {
    // THIS IS MODEL CLASS
    // instance variables name must exactly match (Lower or Upper case too) api attributes
    // data type must match too
    // must have getters and setters
    // not methods or smt else in MODEL CLASS // BEAN CLASS

    String firstName;
    String lastName;
    String joinDate;
    String email;
    int salary;
    Subject subject;







}
