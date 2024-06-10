public class HuffmanLeafNode extends HuffmanBaseNode{
    public Character character;
    public HuffmanLeafNode(Character character, int frequency) {
        super(frequency);
        this.character = character;
    }
}
