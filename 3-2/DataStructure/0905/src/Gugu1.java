import java.util.Scanner;

public class Gugu1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("구구단 숫자 입력 : ");
		int t = input.nextInt();
		
		for(int a=1; a<=9; a++) {
			int result = a*t;
			System.out.println(result);
		}
	}
}
