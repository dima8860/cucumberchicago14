package apiTests.TestingUtil;

import API_Models.RequestBody;
import org.junit.Test;
import utilities.APIUtil;

public class Testing_Util_PUT_UPDATE {
    @Test
    public void updateTeacher(){
        String resource = "/teacher/update";
        RequestBody requestBody = new RequestBody();
        requestBody.setEmailAddress("jb2020@gmail.com");
        requestBody.setFirstName("Taras Shevchenko");
        requestBody.setJoinDate("11/11/18");
        requestBody.setLastName("Bandera");
        requestBody.setGender("Male");
        requestBody.setPhone("857-111-2345");
        requestBody.setPassword("324555");
        requestBody.setPremanentAddress("23 Wolf rd, Des Plaines, il ");
        requestBody.setSubject("qwer");
        requestBody.setDepartment("Sports");
        requestBody.setSection("tree");
        requestBody.setSalary(20000);
        requestBody.setBirthDate("11/11/80");
        requestBody.setBatch(11);
        requestBody.setTeacherId(2899);
        APIUtil.hitPUT(resource,requestBody);
    }
}
