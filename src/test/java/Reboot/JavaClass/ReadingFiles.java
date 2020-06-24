package Reboot.JavaClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader("/Users/dmytrochernetskyi/Desktop/text 2.txt"));
        int i;
        while( (i=reader1.read() ) != -1){
            System.out.print((char)i);
        }
        reader1.close();
        System.out.println("\n");

        BufferedReader reader2 = new BufferedReader(new FileReader("/Users/dmytrochernetskyi/Desktop/text 2.txt"));
        String str;
        while( (str=reader2.readLine() ) != null){
            System.out.print(str + "\n");
        }
        reader2.close();

    }
}
