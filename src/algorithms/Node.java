public class Node {
		int data;
		Node next;
		public Node() {
			
		}
		public Node(int item,Node next) {
			this.data = item;
			this.next = next;
		}
		
		public int getData() {
			return data;
		}
		
		public  void setData(int item) {
			this.data = item;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
	}
