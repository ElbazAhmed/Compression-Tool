public class HuffmanInternalNode extends HuffmanBaseNode {
    HuffmanBaseNode leftNode, rightNode;

    public HuffmanInternalNode(int frequency, HuffmanBaseNode leftNode, HuffmanBaseNode rightNode) {
        super(frequency);
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}
