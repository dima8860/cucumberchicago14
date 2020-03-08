package test;

import org.apache.poi.hpsf.GUID;

import java.sql.Timestamp;
import java.util.UUID;

public class UniqueId {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(123L);
        System.out.println("String + " + timestamp);
        System.out.println("String + " + timestamp);
        System.out.println("String + " + timestamp);
        System.out.println("String + " + timestamp);
        System.out.println("String + " + timestamp);
        System.out.println("String + " + timestamp);
        GUID guid = new GUID();
        System.out.println(guid);
        String uuid = UUID.randomUUID().toString();
        String uuidStr = uuid.toString();
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());




    }
}
