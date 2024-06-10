import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FrequencyTable {

    public static HashMap<Character,Integer> getFrequencyTable(String FileContent){
        HashMap<Character,Integer> freuencyMap = new HashMap<>();
        for(char c : FileContent.toCharArray()){
            freuencyMap.put(c,freuencyMap.getOrDefault(c,0)+1);
        }
        return freuencyMap;
    }
}
