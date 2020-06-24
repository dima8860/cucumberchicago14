package HectorWare;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class ConvertingDocFile {

    public static void main(String[] args) throws IOException {


        Path docFile = Paths.get("/Users/dmytrochernetskyi/Desktop/ApplicationFiles/Dmytro_Chernetskyi_Resume_Updated.docx");
        Path pngFile = Paths.get("/Users/dmytrochernetskyi/Desktop/ApplicationFiles/office_background.png");
        byte[] pdf = Files.readAllBytes(docFile);
        byte[] pdf2 = Files.readAllBytes(pngFile);


        String encoded1 = Base64.getEncoder().encodeToString(pdf);
        System.out.println(encoded1);

        String encoded2 = Base64.getEncoder().encodeToString(pdf2);
        System.out.println(encoded2);

        if (encoded1.equals(encoded2)) {
            System.out.printf("Pass");
        } else {
            System.out.println("Failed " + encoded1.length() + " " + encoded2.length());

        }
    }
}
