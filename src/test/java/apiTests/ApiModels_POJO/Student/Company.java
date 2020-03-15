package apiTests.ApiModels_POJO.Student;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
public class Company {
    String companyName;
    String title;
    Address address;
}
