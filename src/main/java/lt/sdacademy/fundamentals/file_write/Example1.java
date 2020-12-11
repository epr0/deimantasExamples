package lt.sdacademy.fundamentals.file_write;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// FileNotFoundEx
// Order of exceptions
public class Example1 {

    private static final String OUTPUT_FILE_LOCATION = "/Users/deimantas/IdeaProjects/SDA/SdaAcademy/src/main/java/lt/sdacademy/fundamentals/file_write/result.txt";

    public static void main(String[] args) {
        String text = "Good morning!";

        writeDataToFile(text);
    }

    private static void writeDataToFile(String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            bw.write(data);
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i faila!");
        }
    }
}
