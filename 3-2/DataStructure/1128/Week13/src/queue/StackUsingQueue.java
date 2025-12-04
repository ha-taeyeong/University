package queue;

import java.util.Stack;

class MyQueue{
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	public void enqueue(int x) {
		s1.push(x);
	}
	public int dequeue() {
		if (s1.isEmpty()) { return -1; }
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int x=s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return x;
	}
}

public class StackUsingQueue {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		MyQueue q1 = new MyQueue();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		System.out.println(q1.dequeue());
	}
}
