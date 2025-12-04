package deque;

import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {
	Deque<Integer> deque1 = new ArrayDeque<>();
	public void push(int x) {
		deque1.addLast(x);
	}
	public int pop() {
		if (deque1.isEmpty()) { return -1; }
		int x=deque1.removeLast();
		return x;
	}
}

class MyQueue {
	Deque<Integer> deque1 = new ArrayDeque<>();
	
	public void enqueue(int x) {
		deque1.addLast(x);
	}
	
	public int dequeue() {
		if (deque1.isEmpty()) { return -1; }
		int x=deque1.removeFirst();
		return x;
	}
}

public class DequeAsStackQueue {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		//stack
		MyStack stack1 = new MyStack();
		stack1.push(10);
		stack1.push(20);
		System.out.println("poped number="+stack1.pop());
		//queue
		MyQueue q1 = new MyQueue();
		q1.enqueue(10);
		q1.enqueue(20);
		System.out.println("dequed number="+q1.dequeue());
	}
}
