package stack;

import java.util.Stack;

public class BracketCheck {
	
	static boolean isValid(String s1) {
		Stack<Character> stack1 = new Stack<>();
		char ch;
		for(int i=0;i<s1.length();i++) {
			ch=(s1.charAt(i));
			if(ch=='(') {
				stack1.push(ch);
			} else if (ch==')' ) {
				if (stack1.isEmpty()) { return false; }
				else {
					stack1.pop();
				}
			}
		}
		if(!stack1.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		String s1="(((())))";
		System.out.println(isValid(s1));
	}
}
