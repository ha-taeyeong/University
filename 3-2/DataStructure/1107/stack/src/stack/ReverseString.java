package stack;

import java.util.Stack;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("hello java");
		
		String myString = "Java";
		char myChar = 'A';
		String result = myString + myChar;
		System.out.println(result);
		
		Stack<Character> stack1 = new Stack<>();
		String s1 = "Hello Java";
		char ch;
		
		for(int i=0; i<s1.length(); i++) {
			ch=(s1.charAt(i));
			stack1.push(ch);
		}
		
		Stack<Character> stack2 = new Stack<>();
		String s2 = "";
		while(!stack1.isEmpty()) {
			s2+=stack1.pop();
		}
		System.out.println(s2);
	}
}
