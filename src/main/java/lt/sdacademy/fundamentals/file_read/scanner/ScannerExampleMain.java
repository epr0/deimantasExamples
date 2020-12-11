package lt.sdacademy.fundamentals.file_read.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static lt.sdacademy.fundamentals.file_read.Util.FILE_LOCATION;

public class ScannerExampleMain {

    public static final String FILE_LOCATION_LOCAL = "/Users/epro/Downloads/Courses SDA/SdaAcademy Deimantas/src/main/java/lt/sdacademy/fundamentals/file_read/TextFileResource.txt";

    public static void main(String[] args) {
        // Need to close
        try {
            Scanner fileScanner = new Scanner(new File(FILE_LOCATION_LOCAL));
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }

    }
}
