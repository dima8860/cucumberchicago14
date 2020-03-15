package apiTests.ApiModels_POJO.Student;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
public class Address {
    String street;
    String city;
    String state;
    int zipCode;
}
