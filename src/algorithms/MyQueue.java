package algorithms;

import java.util.NoSuchElementException;

public class MyQueue {
	private Node first = null;
	private Node last = null;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void add(int data) {
		Node n = new Node(data);
		
		if(first == null) {
			first = n;
			last = n;
		} else {
			if(last != null) {
				last.next = n;
			}
			last = n;
		}
	}
	
	public int remove() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		Node current = first;
		first = first.next;
		if(first == null) {
			last = null;
		}
		//System.out.println("Element removed: " + current.data);
		return current.data;
	}
	
	public static void main(String args[]) {
		MyQueue queue = new MyQueue();
		queue.add(0);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.remove();
		queue.remove();
		queue.isEmpty();

	}
}
