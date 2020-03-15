package apiTests.ApiModels_POJO.Response;

import apiTests.ApiModels_POJO.Student.Student;
import lombok.Data;

import java.util.List;
@Data
public class ResponseBody {
    // names must matches json attributes
    // must have getters and setters or simply use Lombok
    List<Student> students;

}
