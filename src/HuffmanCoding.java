import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class HuffmanCoding {

    public static void main(String[] args) throws IOException{

        //Take a file as input
        if(args.length != 1){
            System.out.println("Usage : java HuffmanCoding <File Path> ");
            return;
        }

        File inputFile = new File(args[0]);

        try{
            String FileContent = FileUtil.readFileContent(inputFile);
            HashMap<Character,Integer> frequencyTable = FrequencyTable.getFrequencyTable(FileContent);
            HuffmanBaseNode root = HuffmanTree.buildHuffmanTree(frequencyTable);
            HashMap<Character,String> HuffmanCodes = HuffmanTree.generateCodes(root);
            String compressedData = HuffmanEncoder.compress(FileContent,HuffmanCodes);
            System.out.println("compressed Data : " + compressedData);
            String decompressedData = HuffmanDecoder.decompress(compressedData,root);
            System.out.println("decompressed Data : " + decompressedData);

            // Save compressed data to a file
            FileWriter writer = new FileWriter("src/Ressources/compressed.txt");
            writer.write(compressedData);
            writer.close();

            // Save decompressed data to a file
            FileWriter decompressedWriter = new FileWriter("src/Ressources/decompressed.txt");
            decompressedWriter.write(decompressedData);
            decompressedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}