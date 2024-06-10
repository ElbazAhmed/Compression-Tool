import java.util.HashMap;

public class HuffmanEncoder {

    public static String compress(String content, HashMap<Character,String> codesMap){
        StringBuilder compressedData = new StringBuilder();
        for(char c : content.toCharArray()){
            compressedData.append(codesMap.get(c));
        }
        return compressedData.toString();
    }
}
