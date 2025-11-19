package stack;

interface Stack1 {
	boolean isEmpty();
	public abstract void push(Object x);
	Object pop();
//	void remove();
	Object peek();
}

class ArrayStack implements Stack1{
	
	int top; // 선두원소 방번호
	int stackSize;
	Object[] itemArray;
	public ArrayStack() {
		top=-1;
		stackSize=10;
		itemArray = new Object[stackSize];
	}
	
	public boolean isEmpty() {
		if (top<=-1) {return true;}
		else return false;
	}
	
	public void push(Object x) {
		if(top==stackSize-1) {
			System.out.println("stack full");
			return;
		}
		top=top+1;
		itemArray[top]=x;
	}
	
	public Object pop() {
		if (isEmpty()) {
			System.out.println("stack empty");
			return null;
		}
		return itemArray[top--];
	}
	
	//void remove();
	
	public Object peek() {
		if (isEmpty()) {return null;}
		return itemArray[top];
	}
	
}

public class ArrayStackMain {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		ArrayStack stack1 = new ArrayStack();
		stack1.push(10);
		stack1.push(20);
		stack1.push("Kim");
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
	}

}
