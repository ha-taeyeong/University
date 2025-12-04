package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringQ {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		
		Scanner sc = new Scanner(System.in);
		Queue<Character> q1 = new LinkedList<>();
		Queue<Character> q2 = new LinkedList<>();
		
		System.out.print("첫번째 줄 입력: ");
		String str1 = sc.nextLine();
		for(int i=0; i<str1.length(); i++) {
			if(i%2 != 0) {
				char c1 = str1.charAt(i);
				q1.offer(c1);
			}
		}
		System.out.println(q1);
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
		
		System.out.print("두번째 줄 입력: ");
		String str2 = sc.nextLine();
		for(int i=0; i<str2.length(); i++) {
			if(i%2 == 0) {
				char c2 = str2.charAt(i);
				q2.offer(c2);
			}
		}
		
		System.out.println(q2);
		while(!q2.isEmpty()) {
			System.out.println(q2.poll());
		}
		sc.close();
	}
}
