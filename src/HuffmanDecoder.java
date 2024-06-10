public class HuffmanDecoder {

    public static String decompress(String compressedData, HuffmanBaseNode root){
        StringBuilder decompressedData = new StringBuilder();
        HuffmanBaseNode current = root;
        for(int i=0; i<compressedData.length(); i++){
            current = compressedData.charAt(i) == '0' ? ((HuffmanInternalNode) current).leftNode : ((HuffmanInternalNode) current).rightNode;

            if(current instanceof HuffmanLeafNode){
                HuffmanLeafNode leaf = (HuffmanLeafNode) current;
                decompressedData.append(leaf.character);
                current = root;
            }
        }
        return decompressedData.toString();
    }
}
