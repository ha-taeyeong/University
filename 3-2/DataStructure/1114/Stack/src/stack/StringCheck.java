package stack;

import java.util.Scanner;
import java.util.Stack;

public class StringCheck {
	
	static boolean isValid(String s1) {
		Stack<Character> stack1 = new Stack<>();
		char ch;
		for(int i=0;i<s1.length();i++) {
			ch=(s1.charAt(i));
			if(ch=='a') {
				stack1.push(ch);
			} else if (ch=='b' ) {
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
	
	static boolean checkAn2BnCn(String s1) {
        Stack<Character> stackA = new Stack<>(); // a와 c의 n을 검증
        Stack<Character> stackB = new Stack<>(); // b의 2n을 검증
        
        int state = 1; // 1: 'a', 2: 'b', 3: 'c' 단계

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            switch (state) {
                case 1: // 'a' 단계: stackA에 n개의 'a' PUSH
                    if (ch == 'a') {
                        stackA.push(ch);
                    } else if (ch == 'b') {
                        if (stackA.isEmpty()) return false; // a 없이 b 나옴
                        state = 2; i--; // 'b' 단계로 전환
                    } else {
                        return false;
                    }
                    break;
                    
                case 2: // 'b' 단계: stackB에 2n개의 'b' PUSH
                    if (ch == 'b') {
                        stackB.push(ch);
                    } else if (ch == 'c') {
                        if (stackB.isEmpty()) return false; // b 없이 c 나옴
                        state = 3; i--; // 'c' 단계로 전환
                    } else {
                        return false;
                    }
                    break;
                    
                case 3: // c' 단계: c 하나당 stackA 1개, stackB 2개 POP
                    if (ch == 'c') {
                        // 1. c 하나당 a 하나 pop (c=a 검증)
                        if (stackA.isEmpty()) return false; 
                        stackA.pop();
                        
                        // 2. c 하나당 b 두 개 pop (c=b/2 검증)
                        if (stackB.isEmpty()) return false; 
                        stackB.pop(); // 첫 번째 b pop
                        if (stackB.isEmpty()) return false; 
                        stackB.pop(); // 두 번째 b pop
                        
                    } else {
                        return false; // 'c' 외의 문자
                    }
                    break;
            }
        }
        return stackA.isEmpty() && stackB.isEmpty() && s1.length() >= 4;
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
		System.out.println(isValid(s1));
		System.out.println(checkAn2BnCn(s1));

		sc.close();
	}
}
