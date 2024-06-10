import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class HuffmanCoding {

    public static void main(String[] args) throws IOException{

        //Take a file as input
        if(args.length != 1){
            System.out.println("Usgae : java HuffmanCoding <File Path> ");
            return;
        }

        File inputFile = new File(args[0]);

        try{
            HashMap<Character,Integer> frequencyTable = FrequencyTable.getFrequencyTable(inputFile);
            // test the frequencyTable
            for(char c : frequencyTable.keySet()){
                System.out.println("Character : "+ c +" Frequency : " + frequencyTable.get(c));
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}