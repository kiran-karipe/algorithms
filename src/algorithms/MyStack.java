package algorithms;

import java.util.EmptyStackException;

public class MyStack {
	Node top = null;
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		Node current = top;
		top = top.next;
		//System.out.println("Element Popped: "+ current.data);
		if(top != null) {
			//System.out.println("Next Element: "+ top.data);
			//pop();
		}
		return current.data;
	}
	
	public Node popNode() {
		if(top == null) {
			throw new EmptyStackException();
		}
		Node current = top;
		top = top.next;
		//System.out.println("Element Popped: "+ current.data);
		if(top != null) {
			//System.out.println("Next Element: "+ top.data);
			//pop();
		}
		return current;
	}
	public void push(int data) {
		Node n = new Node(data);
		n.next = top;
		top = n;
	}

	public void push(Node node) {
		node.next = top;
		top = node;
	}

	/*public void findMinimum() {
		if(top == null) {
			throw new EmptyStackException();
		} else if(top.next == null) {
			System.out.println(top.data);
		} else {
			if(top.data > top.next.data) {
				pop();
			} else {
				top.next = top.next.next;
				findMinimum();
			}
			System.out.println("Minimum Element: " + top.data);
		}
	}*/
	public void findMaximum() {
		if(top == null) {
			throw new EmptyStackException();
		} else {
			while(top.next != null) {
				if(top.data < top.next.data) {
					top = top.next;
				} else {
					top.next = top.next.next;
				}
			}

		}
		System.out.println(top.data);
	}
	
	public static void main(String args[]) {
		MyStack stack = new MyStack();
		stack.push(0);
		stack.push(6);
		stack.push(2);
		stack.push(7);
		stack.push(4);
		stack.push(5);
		//stack.findMaximum();
		stack.pop();
		stack.findMaximum();
		//stack.findMinimum();
		stack.isEmpty();
	}
}
