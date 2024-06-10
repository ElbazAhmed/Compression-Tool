import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FrequencyTable {

    public static HashMap<Character,Integer> getFrequencyTable(File file) throws IOException {
        HashMap<Character,Integer> freuencyMap = new HashMap<>();
        FileReader reader = new FileReader(file);
        int character;
        while((character = reader.read()) != -1){
            char c = (char) character;
            freuencyMap.put(c,freuencyMap.getOrDefault(c,0)+1);
        }
        return freuencyMap;
    }
}
