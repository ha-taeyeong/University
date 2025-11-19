package stack;

import java.util.Stack;

public class PostfixEval {
	
	public static int calc(String exp) {
		Stack<Integer> stack1 = new Stack<>();
		for(int i=0; i<exp.length(); i++) {
			char ch = exp.charAt(i);
			if(Character.isDigit(ch)) {
				stack1.push(ch-'0');
			} else {
				int val1 = stack1.pop();
				int val2 = stack1.pop();
				switch(ch) {
					case '+' :  stack1.push(val2+val1); break;
					case '-' :  stack1.push(val2-val1); break;
					case '*' :  stack1.push(val2*val1); break;
					case '/' :  stack1.push(val2/val1); break;
				}
			}
		}
		return stack1.pop();
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Java");
		String str1 = "231*+9-";
		System.out.println(calc(str1));
		String str2 = "32+4-7*";
		System.out.println(calc(str2));
	}
	
}
