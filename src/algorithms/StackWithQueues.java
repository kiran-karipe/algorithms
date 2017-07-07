package algorithms;

import java.util.NoSuchElementException;

public class StackWithQueues {
	MyQueue addQueue = new MyQueue();
	MyQueue removeQueue = new MyQueue();

	public boolean isEmpty() {
		return addQueue.isEmpty() && removeQueue.isEmpty();
	}
	
	public void push(int data) {
		addQueue.add(data);
		//System.out.println(data);
	}
	
	public int pop() {
		if(this.isEmpty()){
			throw new NoSuchElementException();
		}
		
		return addToRemove();
	}
	
	public int addToRemove() {
		int popElement;
		
		while(true) {
			popElement = addQueue.remove();
			if(addQueue.isEmpty()) {
				break;
			}
			removeQueue.add(popElement);
		}
		MyQueue swapQueue = removeQueue;
		removeQueue = addQueue;
		addQueue = swapQueue;
		
		return popElement;
	}
	
	public static void main(String args[]) {
		StackWithQueues stack = new StackWithQueues();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.pop());
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		stack.push(5);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
  }
