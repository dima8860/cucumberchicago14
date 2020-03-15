package apiTests.ApiModels_POJO.Teacher;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
public class Subject {
    String name;
    int year;
    int batch;


}
