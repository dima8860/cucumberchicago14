package API_Models.Student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    String street;
    String city;
    String state;
    int zipCode;
}
