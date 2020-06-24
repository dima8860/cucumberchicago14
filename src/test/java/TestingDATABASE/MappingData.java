package TestingDATABASE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappingData {
    /**
     * |First_Name | Last_Name | Job_id |
     * |John       | Wick      | Fighter|
     * |Alica      | Smith     | Coder  |
     * |Nancy      | Johnson   | Teacher|
     */
    public static void main(String[] args) {


        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();

        map1.put("First_Name", "John");
        map1.put("Last_Name", "Wick");
        map1.put("Job_id", "Fighter");

        map2.put("First_Name", "Alica");
        map2.put("Last_Name", "Smith");
        map2.put("Job_id", "Coder");

        map3.put("First_Name", "Nancy");
        map3.put("Last_Name", "Johnson");
        map3.put("Job_id", "Teacher");

        List<Map<String, String>> data = new ArrayList<>();
        data.add(map1);
        data.add(map2);
        data.add(map3);

        data.get(1).get("Job_id");
        System.out.println(data.get(1).get("Job_id"));


    }
}
