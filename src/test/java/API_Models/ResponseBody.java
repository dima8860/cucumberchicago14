package API_Models;

import API_Models.Student.Student;
import API_Models.Teacher.Teacher;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
@Data // CREATES FOR US SETTER AND GETTER METHODS
@JsonInclude(JsonInclude.Include.NON_DEFAULT) // please exclude variables that are has default values(NULL, 0...)
@JsonIgnoreProperties(ignoreUnknown = true) // IGNORING ASSIGNING VARIABLES THAT ARE NOT LISTED HERE BUT ARE PRESENT IN JSON FILE
public class ResponseBody {
    // names must matches json attributes
    // must have getters and setters or simply use Lombok
    List<Student> students;
    List<Teacher> teachers;


}
