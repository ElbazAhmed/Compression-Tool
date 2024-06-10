import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

    public static String readFileContent(File file) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        FileReader reader = new FileReader(file);
        char character;
        while((character = (char) reader.read()) != -1){
            contentBuilder.append(character);
        }
        reader.close();
        return contentBuilder.toString();
    }


}
