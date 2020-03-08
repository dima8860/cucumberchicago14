package mentoring.DataTesting;

import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) throws SQLException {
        DBUtility.createConnection(); // opened connection
        List<Map<Object, Object>> my_data = DBUtility.executeQuery("select * from employees where employee_id = 175"); // send query
        DBUtility.close();
        System.out.println(my_data.size());
        System.out.println(my_data.get(0));

//        for(Map<Object, Object> map: my_data) {
//            System.out.println(map);
//        }

//        for(Map<Object, Object> map: my_data) {
//            if(map.get("EMPLOYEE_ID").toString().equals("175")) {
//                System.out.println("smt");
//                // will put Assert.assert();
//                if(map.get("SALARY").toString().equals("8800")) {
//                    System.out.println("ID: " + map.get("EMPLOYEE_ID") + " SALARY: " + map.get("SALARY") + " IS VERIFIED!");
//                }
//            }
//        }
    }
}
