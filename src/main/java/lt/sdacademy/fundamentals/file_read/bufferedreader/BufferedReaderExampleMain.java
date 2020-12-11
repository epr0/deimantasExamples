package lt.sdacademy.fundamentals.file_read.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static lt.sdacademy.fundamentals.file_read.Util.FILE_LOCATION;


public class BufferedReaderExampleMain {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                stringBuilder.append(line);
            }

           /* do {
                line = br.readLine();
                stringBuilder.append(line);
            } while (line != null);*/

            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
