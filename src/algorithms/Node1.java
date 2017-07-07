package algorithms;

public class Node1 {
	private Node1 left;
	private Node1 right;
	private int key;
	
	Node1(int key) {
		this.key = key;
		right = null;
		left = null;
	}
	
	public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setLeft(Node1 left) {
        this.left = left;
    }

    public Node1 getLeft() {
        return left;
    }

    public void setRight(Node1 right ) {
        this.right = right;
    }

    public Node1 getRight() {
        return right;
    }
}
