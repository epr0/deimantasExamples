package lt.sdacademy.advancedfeatures.nestedclasses.folderexercise;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;

/*
 * Log errors using log4j
 * */
public class FileReadMain implements FileRead<String> {

    private static final String FILE_NAME = "TestFile.txt";
    private static final Logger logger = Logger.getLogger(FileReadMain.class);

    public static void main(String[] args) {
        logger.info("Application up and running");
        FileReadMain fileReadMain = new FileReadMain();

        String text = fileReadMain.readFile();
        if (text != null) {
            logger.info("File successfully read");
            logger.debug("File content: '" + text + "'");
        } else {
            logger.fatal("File is empty!");
        }
    }

    @Override
    public String readFile() {
        Folder.File file = new Folder.File(FILE_NAME);

        String line = null;
        try (BufferedReader br = file.getBufferedReader(new Folder())) {
            line = br.readLine();
        } catch (IOException e) {
            logger.error("Something went wrong reading file!");
        }
        return line;
    }
}
