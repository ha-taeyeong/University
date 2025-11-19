package stack;

import java.util.Stack;

public class InfixToPostfix {
	
	static int prec(char ch) {
		
		if ((ch=='-') || (ch=='+')) { return 1; }
		if ((ch=='*') || (ch=='/')) { return 2; }
		if ((ch=='^')) { return 3; }
		return 0;
	}
	
	static String infixToPostfix(String exp1) {
		String result="";
		char ch;
		Stack<Character> stack1 = new Stack<>();
		for(int i=0; i<exp1.length(); i++) {
			ch=exp1.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				result = result+ch;
			} else if (ch=='(') {
				stack1.push(ch);
			} else if (ch==')') {
				while((!stack1.isEmpty())&&(stack1.peek()!=('('))) {
					result=result+stack1.pop();
				}
				stack1.pop();
 			} else {
 				while((!stack1.isEmpty())&&(prec(ch)<=prec(stack1.peek()))) {
 					result=result+stack1.pop();
 				}
 				stack1.push(ch);
 			}
		}
		while(!stack1.isEmpty()) {
			result=result+stack1.pop();
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Java");
		String exp1="a+b*(c^d-3)^(f+g*h)-i";
		System.out.println(infixToPostfix(exp1));
		exp1="a+b*c-d";
		System.out.println(infixToPostfix(exp1));
	}
}
