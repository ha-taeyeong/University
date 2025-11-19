package conditional_sentences;

import java.util.Scanner;

public class Java_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		M = M - 45;
		
		if (M < 0) {
			H = H - 1;
			if(H < 0) {
				H = H + 24;
			}
			M = M + 60;
		}
		System.out.print(H);
		System.out.println(" " + M);
	}
}
