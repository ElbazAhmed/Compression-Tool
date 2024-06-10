import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

    public static String readFileContent(File file) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(file)) {
            int character;
            while ((character = reader.read()) != -1) {
                contentBuilder.append((char) character);
            }
        }
        return contentBuilder.toString();
    }


}
