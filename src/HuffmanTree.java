import java.util.HashMap;
import java.util.PriorityQueue;

public class HuffmanTree {

    public static HuffmanBaseNode buildHuffmanTree(HashMap<Character,Integer> frequencyTable){
        PriorityQueue<HuffmanBaseNode> pq = new PriorityQueue<>((a,b) -> a.frequency - b.frequency);

        for(Character c : frequencyTable.keySet()){
            pq.add(new HuffmanLeafNode(c,frequencyTable.get(c)));
        }

        while(pq.size() > 1){
            HuffmanBaseNode leftNode = pq.poll();
            HuffmanBaseNode rightNode = pq.poll();
            int totalFrequency = leftNode.frequency + rightNode.frequency;
            HuffmanBaseNode merged = new HuffmanInternalNode(totalFrequency,leftNode,rightNode);
            pq.add(merged);
        }

        return pq.poll();
    }


}
