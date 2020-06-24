package utilities;

import API_Models.RequestBody;
import API_Models.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APIUtil {

    // CRUD OPERATIONS. One method for each operation.
    // One method should handle any APIs we are hitting.

    private static ResponseBody responseBody;


    public static void hitGET(String resource) {
        // * Base URL + resource = URI(full url in order to hit API properly)
        String uri = Config.getProperty("baseURL") + resource;
        Response response = RestAssured.get(uri);  // ==
      //  Response response = RestAssured.given().header("secretKey", "123CyberPassword").get(uri); ==> with authentication code
        System.out.println("INFORMATION RECEIVED: " + response.asString());
        System.out.println("STATUS CODE: " + response.statusCode());
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


    public static ResponseBody getResponseBody() {
        return responseBody;
    }

    // CREATE DATA
    public static void hitPOST(String resource, RequestBody body) {
        String uri = Config.getProperty("baseURL") + resource;
        ObjectMapper objectMapper = new ObjectMapper();
        String bodyJSON = "";
        try {
            bodyJSON = objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Response response = RestAssured.given().contentType(ContentType.JSON).body(bodyJSON).when().post(uri);
        // if u use authentication
      //  Response response = RestAssured.given().header("secretKey", "123Password").contentType(ContentType.JSON).body(bodyJSON).when().post(uri);

        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("INFORMATION CREATED: " + response.asString());
        System.out.println("STATUS CODE: " + response.statusCode());

    }

        // DELETE DATA
    public static void hitDELETE(String resource) {
        String uri = Config.getProperty("baseURL") + resource;
        Response response = RestAssured.delete(uri);
        System.out.println("INFORMATION DELETED: " + response.asString());
        System.out.println("STATUS CODE: " + response.statusCode());
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (JsonProcessingException e) {
            System.err.println("WARNING!:\n Response could not map properly with Jackson library");
        }
    }


    // UPDATE DATA
    public static void hitPUT(String resource, RequestBody body){
        String uri = Config.getProperty("baseURL") + resource;
        ObjectMapper objectMapper = new ObjectMapper();
        String bodyJson = "";
        // CONVERTING OBJECT TO JSON
        try{
            bodyJson = objectMapper.writeValueAsString(body);
        }catch (Exception e) {
            e.printStackTrace();
        }
        // GOT ABOVE JSON FORMAT READY TO SEND FOR UPDATE
        Response response = RestAssured.given().contentType(ContentType.JSON).body(bodyJson).when().put(uri);
        //SENT JSON WITH PUT METHOD
        System.out.println("INFORMATION UPDATED: " + response.asString());
        System.out.println("STATUS CODE: " + response.statusCode());
        // CONVERTING JSON TO OBJECT (RESPONSE BODY)
        try{
           // responseBody = objectMapper.readValues(response.asString(), ResponseBody.class);
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        }catch (Exception e) {
            e.printStackTrace();
        }


    }

}
