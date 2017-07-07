import java.util.*;
public class LinkedListQueue  {
	private Node head;
	private Node tail;
	private Node next;
	
	
	public void enQueue(int item) {
			
			if(head == null) {
				head = new Node(item,null);
				tail = head;
			}
			else {
				Node temp = tail;
				tail = (new Node(item,null)) ;
				temp.setNext(tail);
			}
			//tail = new Node(item, null);
			System.out.println(tail.getData());
	}
	
	public void deQueue(int item) {
		if(head == null) {
			throw new NoSuchElementException("Queue underflow");
		}
		else if(tail == head) {
			head = null;
			throw new NullPointerException("Queue is empty");
		}
		else {
			Node temp = head;
			head = head.getNext();
			temp = null;
			System.out.println("new head" + head.getData());
		}
	}
	
	public void getNewTail() {
		System.out.println("new tail " + tail.getData());
	}
	
	public static void main(String[] args) {
		LinkedListQueue llq = new LinkedListQueue();	
		
		llq.enQueue(23);
		llq.enQueue(33);
		llq.enQueue(43);
		llq.enQueue(53);
		llq.getNewTail();

		llq.deQueue(23);
		
	}
	
}

	
	
	
	
	
	
	