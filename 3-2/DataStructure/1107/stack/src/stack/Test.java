package stack;

import java.util.Stack;


public class Test {
	public static void main(String[] args) {
		System.out.println("hello java");
		
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		String found = "";
		
		stack1.push("Kim");
		stack1.push("Lee");
		stack1.push("Park");
		stack1.push("Yoo");
		System.out.println(stack1);
		while(!stack1.isEmpty()) {
			found = stack1.pop();
			if(found.equals("Park")) {
				System.out.println("found");
				System.out.println(found);
				break;
			} else {
				stack2.push(found);
			}
		}
		System.out.println(stack1);
		System.out.println(stack2);
	}
}
