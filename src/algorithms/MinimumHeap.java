package algorithms;

public class MinimumHeap {
	private TreeNode root;
	
	public void insert(int data) {
		
		if(root == null) {
			TreeNode node = new TreeNode(data);
			root = node;
			//System.out.println(root.data);
		} else {
			insert(root, data);
		}
	}
	
	public void insert(TreeNode current, int data) {
		if(data > current.data) {
			if(current.left == null) {
				TreeNode node = new TreeNode(data);
				current.left = node;
			} else if(current.right == null) {
				TreeNode node = new TreeNode(data);
				current.right = node;
			} else {
				if(!nodeIsEmpty(current.left)) {
					if(nodeIsEmpty(current.right)) {
						insert(current.right, data);
					} else {
						insert(current.left, data);
					}
				} else {
					insert(current.left, data);
				}
			}
		} else {
			                                                 
		}
		
		//System.out.println(current.data);
	}
	
	public TreeNode swapMin(TreeNode current, TreeNode currentNext) {
		if(currentNext.data < current.data) {
			TreeNode temp = current;
			current = currentNext;
			currentNext = temp;
		}
		return currentNext;
	}
	public boolean nodeIsEmpty(TreeNode current) {
		if(current.left == null || current.right ==null) {
			return true;
		} else {
			return false;
		}
		
	}
	public void traverse() {
		traverse(root);
	}
	
	public void traverse(TreeNode current) {
		if(current != null) {
			System.out.println(current.data);
			traverse(current.left);
			traverse(current.right);
		}
		
	}
	
	public static void main(String args[]) {
		MinimumHeap heap = new MinimumHeap();
		heap.insert(5);
		heap.insert(4);
		heap.insert(3);
		heap.insert(2);
		heap.insert(6);
		heap.insert(7);
		heap.insert(1);
		heap.insert(8);
		
		heap.traverse();

	}
}
