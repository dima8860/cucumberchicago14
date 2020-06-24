package API_Models;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class SchemaTesting {
    @Test
    public void testJsonSchema() {
        //http://restservicestesting.blogspot.com/2016/10/validate-json-schema-using-rest-assured.html
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/comments?postId=1");
        RestAssured
                .get("https://jsonplaceholder.typicode.com/comments?postId=1")
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("JsonSchemaFile.json"));
        System.out.println(response.asString());
    }  @Test
    public void testJsonSchema2() {
        //http://restservicestesting.blogspot.com/2016/10/validate-json-schema-using-rest-assured.html
        RestAssured
                .get("https://restapi.demoqa.com/utilities/weather/city/all")
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("weather.json"));
    }

}
