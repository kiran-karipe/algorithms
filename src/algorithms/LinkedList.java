package algorithms;

public class LinkedList {
	Node head = null;
	Node tail = null;
	
	public void addToTail(int data) {
		Node n = new Node(data);
		if(head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
	}
	
	public void traverse() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void addToHead(int data) {
		Node n0 = new Node(data);
		if(head == null) {
			head = n0;
			tail = n0;
		} else {
			n0.next = head;
			head = n0;
		}
	}
	
	public void deleteNode(int data) {
		Node n = head;
		
		while(n.next != null) {
			if(n.data == data) {
				n = n.next;
				head = n;
				break;
				//System.out.print(head.data);
			} else if(n.next.data == data){
				n.next = n.next.next;
				break;
			}
			n = n.next;
		}
	}
	
	public boolean hasCycle() { 
        if(head == null) {
            return false;
        }
        
        //head = head.next.next;
        Node current1 = head;
        Node current2 = head;
        
        while(current1.next != null && current2.next != null && current2.next.next != null) {
            current1 = current1.next;
            current2 = current2.next.next;
            if(current1 == current2) {
                return true;
            }
        }
        return false;
    }
	
	public Node detectCycle() {
        if(head == null) {
            return null;
        }
        Node current1 = head;
        Node current2 = head;
        Node node = null;
        while(current1 != null) {
            if(current1.next == null) {
            	node = current1;
            }
            current1 = current1.next;
        }
        current1 = head;
        while(current1.next != null && current2.next != null && current2.next.next != null) {
            current1 = current1.next;
            current2 = current2.next.next;
            if(current1 == current2) {
                break;
            } else {
                return null;
            }
        }
        return node;
    }
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.addToHead(3);
		list.addToTail(0);
		list.addToTail(1);
		list.addToTail(2);
		list.addToHead(4);
		list.addToTail(5);
		list.tail.next = list.head.next.next;
		//list.deleteNode(5);
		//list.traverse();
		System.out.println(list.detectCycle());
	}
}
