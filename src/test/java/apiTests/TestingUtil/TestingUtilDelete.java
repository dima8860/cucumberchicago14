package apiTests.TestingUtil;

import org.junit.Test;
import utilities.APIUtil;

public class TestingUtilDelete {
    @Test
    public void deleteAPI(){
        String recourse = "/teacher/delete/2704";
        APIUtil.hitDELETE(recourse);
    }
}
