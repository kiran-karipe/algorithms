
public class SingleLinkedList {

	Node head;
	Node tail;
	Node next;
	public SingleLinkedList() {
		
	}
	
	public SingleLinkedList(int item) {
		head = new Node(item, null);
	}
	
	public void addFirst(int item) {
		if(head == null) {
			head = new Node(item, null);
			tail = head;
		}
		else {
			Node temp = head;
			head = new Node(item,next);
			temp = temp.getNext();
		}
	}
	
	public void addLast(int item) {
		if(head == null) {
			addFirst(item);
		}
		else {
			Node temp = head;
			while (temp.getNext() == null) {
				temp = new Node(item, null);
			}
		}
	}
	
	public void reverse() {
		
	}
}
