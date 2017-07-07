package algorithms;

import java.util.NoSuchElementException;

public class QueueWithStack {
	private MyStack pushStack = new MyStack();
	private MyStack popStack = new MyStack();

	public void add(int data) {
		pushStack.push(data);
	}
	
	public boolean isEmpty() {
		return pushStack.isEmpty() && popStack.isEmpty(); 
	}

	public int remove() {
		if(this.isEmpty()){
			throw new NoSuchElementException();
		}
		
		pushToPop();
			
		return popStack.pop();		
	}
	
	private void pushToPop() {
		if(popStack.isEmpty()) {		
			while(!pushStack.isEmpty()) {
				popStack.push(pushStack.pop());
			}
		}
	}

	public static void main(String args[]) {
		QueueWithStack q = new QueueWithStack();
		
		q.add(6);
		q.add(5);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.remove());
		System.out.println(q.remove());
	}
}
