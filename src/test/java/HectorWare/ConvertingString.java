package HectorWare;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ConvertingString {
    public static void main(String[] args) {
        //encode
        String str = "Hello Word";
        byte[] message = "hello world".getBytes(StandardCharsets.UTF_8);
        String encoded = Base64.getEncoder().encodeToString(message);
        System.out.println(encoded);

        //encode1
        String str1 = "Hello Word1";
        byte[] message1 = "hello world1".getBytes(StandardCharsets.UTF_8);
        String encoded1 = Base64.getEncoder().encodeToString(message1);
        System.out.println(encoded1);

        //decode
        byte[] decoded = Base64.getDecoder().decode(encoded);
        System.out.println(new String(decoded, StandardCharsets.UTF_8));

        //decode1
        byte[] decoded1 = Base64.getDecoder().decode(encoded1);
        System.out.println(new String(decoded1, StandardCharsets.UTF_8));

    }
}
