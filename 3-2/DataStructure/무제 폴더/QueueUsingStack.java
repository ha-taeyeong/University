package queue;

import java.util.Queue;
import java.util.LinkedList;

class Stack {
	
	Queue<Integer> q1 = new LinkedList<Integer>();
	
	public void push(int x) {
		int size = q1.size();
		q1.add(x);
		for(int i=0; i<size; i++) {
			q1.add(q1.remove());
		}
	}
	
	public int pop() {
		return q1.remove();
	}
	
	public int peek() {
		return q1.peek();
	}
	
	public boolean isEmpty() {
		return q1.isEmpty();
	}
}

public class QueueUsingStack {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Java");
		
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.isEmpty());
	}
}
