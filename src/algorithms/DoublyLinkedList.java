package algorithms;

//import java.util.Hashtable;

public class DoublyLinkedList {

	Node head = null;
	Node tail = null;
	
	
	public void addToTail(int data) {
		Node n = new Node(data);
		
		if(head == null) {
			head = n;
			tail = n;
		} else {
			n.prev = tail;
			tail.next = n;
			tail = n;
		}
	}
	
	public void addToHead(int data) {
		Node n = new Node(data);
		if(head == null) {
			head = n;
			tail = n;
		} else {
			head.prev = n;
			n.next = head;
			head = n;
		}
	}
	
	public void traverse() {
		Node current = head;
		
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void traverseBackwords() {
		Node current = tail;
		
		while(current != null) {
			System.out.println(current.data);
			current = current.prev;
		}
	}
	public void deleteNode(int data) {
		if(head == null) {
			return;
		}
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				if (current.next != null) {
					current.next.prev = current;
				} else {
					tail = current;
				}
				break;
			}
			current = current.next;
		}
	}
	
	public void removeDuplicates() {
		Node current = head;
		
		while(current != null) {
			Node newCurrent = current;
			while(newCurrent.next != null) {
				if(current.data == newCurrent.next.data) {
					newCurrent.next = newCurrent.next.next;
					if (newCurrent.next != null) {
						newCurrent.next.prev = newCurrent;
					} else {
						tail = newCurrent;
					}
				} else {
					newCurrent = newCurrent.next;
				}
			}
			current = current.next;
		}
	}

	/*public void removeDuplicatesUsingHashtable() {
		Hashtable h = new Hashtable();
		Node current = head;
		
		while(current != null) {
			if(h.contains(current.data)) {
				current = current.next;
			} else {
				h.put(current, current.data);
				current = current.next;
			}
		}
		
		System.out.println(h);
	}*/
	public static void main(String args[]) {
		DoublyLinkedList dlList = new DoublyLinkedList();
		dlList.addToTail(2);
		dlList.addToTail(3);
		dlList.addToTail(4);
		dlList.addToHead(0);
		dlList.addToHead(1);
		dlList.addToHead(5);
		dlList.addToHead(5);
		dlList.addToTail(4);
		dlList.addToHead(5);
		//dlList.removeDuplicatesUsingHashtable();
		dlList.removeDuplicates();
		//dlList.deleteNode(4);
		dlList.traverse();
		//dlList.traverseBackwords();
	}
 }
