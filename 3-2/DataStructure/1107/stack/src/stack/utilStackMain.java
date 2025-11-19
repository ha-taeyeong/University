package stack;

import java.util.Stack;

class MyNode {
	int id;
	String name;
	public MyNode(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
public class utilStackMain {
	public static void main(String[] args) {
		System.out.println("hello java");
		Stack<String> stack1 = new Stack<>(); // 스택 생성
		stack1.push("Kim");
		stack1.push("Lee");
		stack1.push("Park");
		System.out.println(stack1.pop());
	
		Stack<Integer> stack2 = new Stack<>(); // 스택 생성
		stack2.push(10);
		stack2.push(20);
		stack2.push(30);
		System.out.println(stack2.pop());
		
		Stack<MyNode> stack3 = new Stack<>(); // 스택 생성
		MyNode node1 = new MyNode(1, "Kim");
		stack3.push(node1);
		MyNode node2 = stack3.pop();
		System.out.println(node2.id+" "+node2.name);
	}
}
