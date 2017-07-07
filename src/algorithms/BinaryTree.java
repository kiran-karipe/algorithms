package algorithms;

public class BinaryTree {
	private TreeNode root;
	
	public void insert(int data) {
		if(root == null) {
			TreeNode node = new TreeNode(data);
			root = node;
		} else {
			insert(root, data);
		}
	}

	public void insert(TreeNode currentRoot, int data) {
		if(data < currentRoot.data) {
			if(currentRoot.left == null) {
				TreeNode node = new TreeNode(data);
				currentRoot.left = node; 
			} else {
				insert(currentRoot.left, data);
			}
		} else {
			if(currentRoot.right == null) {
				TreeNode node = new TreeNode(data);
				currentRoot.right = node;
			} else {
				insert(currentRoot.right, data);
			}
		}
	}
	
	public void traverse() {
		traverse(root);
	}

	public void traverse(TreeNode current) {
		if(current != null) {
			visit(current);
			traverse(current.left);
			traverse(current.right);
		}
	}
	
	public void visit(TreeNode current) {
		System.out.println(current.data);
	}
	
	public int maxDepth() {
		return this.maxDepth(root);
	}

	private int maxDepth(TreeNode current) {
		if(current == null) {
			return 0;
		}

		return Math.max(maxDepth(current.left), maxDepth(current.right)) + 1;
	}
	
	public int minDepth() {
		return minDepth(root);
	} 
	
	private int minDepth(TreeNode current) {
		if(current == null) {
			return 0;
		}
		
		int leftDepth = minDepth(current.left);
		int rightDepth = minDepth(current.right);
		
		if(leftDepth != 0 && rightDepth == 0) {
			return leftDepth + 1;
		}
		else if (leftDepth == 0 && rightDepth != 0) {
			return rightDepth + 1;
		} 
		else {
			return Math.min(minDepth(current.left), minDepth(current.right)) + 1;
		}
	}
	
	public String treeToString() {
		StringBuilder str = new StringBuilder();
		treeToString(root, str);
		return str.toString();
	}
	
	public void treeToString(TreeNode current, StringBuilder str) {
		if(current != null) {
			str.append(current.data);
			if(current.right != null || current.left != null) {
				str.append("(");
				treeToString(current.left, str);
				str.append(")");
				if(current.right != null) {
					str.append("(");
					treeToString(current.right, str);
					str.append(")");					
				}
			}
		}
	}
	
	public void invert() {
		invert(root);
	} 
	
	public TreeNode invert(TreeNode current) {
		if(current != null) {
			TreeNode temp = current.left;
			current.left = current.right;
			current.right = temp;
			invert(current.left);
			invert(current.right);
		}
		return current;
	}
	
	public void sumOfLeftLeaves() {
		System.out.println(sumOfLeftLeaves(root, true));
	}
	
	public int sumOfLeftLeaves(TreeNode current, boolean isRightNode) {
		if(current == null) {
			return 0;
		}

		int sum = 0;
		if(current.left == null && current.right == null) {
			return !isRightNode ? current.data : 0;
		}

//		Traverse left node
		sum += sumOfLeftLeaves(current.left, false);
//		Traverse right node
		sum += sumOfLeftLeaves(current.right, true);

		return sum;
	}
	

	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		
//		tree.insert(6);
//		tree.insert(4);
//		tree.insert(5);
//		tree.insert(3);
//		tree.insert(12);
//		tree.insert(4);
//		tree.insert(12);
		
		tree.insert(4);
		tree.insert(2);
		tree.insert(6);
		tree.insert(5);
		tree.insert(8);
		tree.insert(7);
		tree.insert(3);
		tree.insert(1);
		
		//System.out.println(tree.minDepth());
		//System.out.println(tree.treeToString());
		//tree.invert();
//		tree.traverse();
		tree.sumOfLeftLeaves();


	}
}
