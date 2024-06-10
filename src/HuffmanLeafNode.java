public class HuffmanLeafNode extends HuffmanBaseNode{
    private Character character;
    public HuffmanLeafNode(Character character, int frequency) {
        super(frequency);
        this.character = character;
    }
}
