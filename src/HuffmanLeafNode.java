public class HuffmanLeafNode extends HuffmanBaseNode{
    private Character character;
    public HuffmanLeafNode(int frequency, Character character) {
        super(frequency);
        this.character = character;
    }
}
