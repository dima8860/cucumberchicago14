package HectorWare;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class ConvertingPdfFile {
    public static void main(String[] args) throws IOException {



        Path pdfPath = Paths.get("/Users/dmytrochernetskyi/Desktop/ApplicationFiles/linux commans.pdf");
        Path pdfPath2 = Paths.get("/Users/dmytrochernetskyi/Desktop/ApplicationFiles/VYTrack Description.pdf");
        byte[] pdf = Files.readAllBytes(pdfPath);
        byte [] pdf2 = Files.readAllBytes(pdfPath2);



        String encoded1  = Base64.getEncoder().encodeToString(pdf);
        System.out.println(encoded1);

        String encoded2 = Base64.getEncoder().encodeToString(pdf2);
        System.out.println(encoded2);

        if(encoded1.equals(encoded2)) {
            System.out.printf("Pass");
        }
        else {
            System.out.println("Failed");
        }



    }
}
