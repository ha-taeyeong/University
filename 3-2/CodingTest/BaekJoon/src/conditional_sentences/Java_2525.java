package conditional_sentences;

import java.util.Scanner;

public class Java_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = b+c;
		String result = "";
		
		if(d >= 60) {
			int r = d / 60;
			d = d % 60;
			a += r;
		}
		
		if (a >= 24) {
			a -= 24;
		}
		result = a + " " + d;
		System.out.println(result);
		
	}
}
