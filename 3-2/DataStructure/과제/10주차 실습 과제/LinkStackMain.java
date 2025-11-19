package stack;

interface Stack2 {
	boolean isEmpty();
	public abstract void push(Object x);
	Object pop();
//	void remove();
	Object peek();
}

class Node {
	Object data;
	Node link;
	public Node(Object data) {
		this.data = data;
	}
}

class LinkStack implements Stack2{
	public Node top;
	
	public boolean isEmpty() {
		if (top==null) { return true; }
		else { return false; }
	}
	
	public void push(Object x) {
		Node newNode = new Node(x);
		newNode.link=top;
		top=newNode;
	}
	
	public Object pop() { //deleteFirst
		if(isEmpty()) { return null; }
		else {
			Object item = top.data;
			top=top.link;
			return item;
		}
		
	}
	
	//void remove();
	
	public Object peek() {
		if(isEmpty()) { return null; }
		else {
			return top.data;
		}
	}
	
}


public class LinkStackMain {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		LinkStack stack1 = new LinkStack();
		stack1.push(10);
		stack1.push(20);
		stack1.push("Kim");
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
	}
}
