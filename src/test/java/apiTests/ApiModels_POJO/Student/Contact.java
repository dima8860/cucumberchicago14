package apiTests.ApiModels_POJO.Student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact {
    String phone;
    String email;

}
