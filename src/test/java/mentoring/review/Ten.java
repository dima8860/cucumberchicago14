package mentoring.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ten {

    public static void main(String[] args) {

        Map<String, String> passwords = new HashMap<>();
        //put
        passwords.put("eniiazov", "Cybertek123");
        passwords.put("eniiazov", "test123");
        System.out.println(passwords.size());

        //get
        System.out.println(passwords.get("test"));  // ==> returns null
        System.out.println(passwords.get("eniiazov"));

        //remove
        passwords.remove("eniiazov");
        System.out.println(passwords.get("eniiazov"));
        passwords.put("eniiazov1", "Cybertek123");
        passwords.put("eniiazov2", "test123");

        //contains
        System.out.println("Contains key eniiazov: " + passwords.containsKey("eniiazov"));
        System.out.println("Contains value test123: " + passwords.containsValue("test123"));

        //keySet
        Set<String> keys = passwords.keySet();
        // getting all keys
        for(String key : keys) {
            System.out.println("Key: " + key);
        }
        // getting all values
        for(String key : keys) {
            System.out.println("Value: " + passwords.get(key));
        }



    }
}
