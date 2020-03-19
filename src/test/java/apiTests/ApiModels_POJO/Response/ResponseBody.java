package apiTests.ApiModels_POJO.Response;

import apiTests.ApiModels_POJO.Student.Student;
import apiTests.ApiModels_POJO.Teacher.Teacher;
import lombok.Data;

import java.util.List;
@Data
public class ResponseBody {
    // names must matches json attributes
    // must have getters and setters or simply use Lombok
    List<Student> students;
    List<Teacher> teachers;


}
