package Reboot.JavaClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class AddingFileToHashSet {
    public static void main(String[] args) throws Exception, IOException {
        HashMap<String, Integer> map = new HashMap();

        BufferedReader reader2 = new BufferedReader(new FileReader("/Users/dmytrochernetskyi/Desktop/text 2.txt"));
        String str;
        String [] arr;
        int highestSalary = 0;
        while( (str=reader2.readLine() ) != null){
            arr = str.split(" ");
            String fullName = arr[0] + " " +  arr[1];
            int salary = 0;
            try {
                 salary = Integer.valueOf(arr[2]);
            }catch (Exception e) {
                System.out.println(e.getMessage() + " for: " + str);
            }
            if(salary >= highestSalary) highestSalary = salary;
            map.put(fullName, salary);

        }
        reader2.close();
        System.out.println(highestSalary);

//        for(String element : map) {
//            System.out.println(element);
//        }

    }
}
