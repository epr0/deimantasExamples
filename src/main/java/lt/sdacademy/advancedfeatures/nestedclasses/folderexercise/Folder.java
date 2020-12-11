package lt.sdacademy.advancedfeatures.nestedclasses.folderexercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Folder {

    private String directory;

    public Folder(String directory) {
        this.directory = directory;
    }

    public Folder() {
        this.directory = "/Users/deimantas/IdeaProjects/SDA/SdaAcademy/src/main/java/lt/sdacademy/advancedfeatures/nestedclasses/folderexercise";
    }

    public static class File {

        private String fileName;

        public File(String fileName) {
            this.fileName = fileName;
        }

        public BufferedReader getBufferedReader(Folder folder) throws IOException {
            return new BufferedReader(new FileReader(String.format("%s/%s", folder.directory, fileName)));
        }
    }
}
