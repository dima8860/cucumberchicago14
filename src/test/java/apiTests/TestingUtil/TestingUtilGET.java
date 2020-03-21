package apiTests.TestingUtil;

import API_Models.Student.Student;
import API_Models.Teacher.Teacher;
import org.junit.Assert;
import org.junit.Test;
import utilities.APIUtil;

public class TestingUtilGET {
    @Test
    public void teacherTesting(){
        String resource = "/teacher/all";
        APIUtil.hitGET(resource);
        System.out.println(APIUtil.getResponseBody().getTeachers());
    }

    @Test
    public void allTeacherTest(){
        APIUtil.hitGET("/teacher/all");

        for(Teacher t: APIUtil.getResponseBody().getTeachers()) {
            if(t.getGender().equalsIgnoreCase("female")) {
                System.out.println(t.getFirstName());
            }
        }
    }

    @Test
    public void studentBatch(){
        APIUtil.hitGET("/student/all");
        int  index = 0;

        for(Student student: APIUtil.getResponseBody().getStudents()) {

            if(student.getBatch() >= 7 && student.getBatch() <= 14) {
                index++;
                continue;
            }
            Assert.fail("Student batch failed at:  " + index);
        }
    }


}
