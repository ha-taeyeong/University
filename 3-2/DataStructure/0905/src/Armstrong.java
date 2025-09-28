import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
	
		int abc = sc.nextInt();
		int a = (abc/100) % 10;
		int b = (abc/10) % 10;
		int c = abc % 10;
		
		int a_mul = 1;
		int b_mul = 1;
		int c_mul = 1;
		int result = 0;
		
		for(int i=0; i<3; i++) {
			a_mul *= a;
			b_mul *= b;
			c_mul *= c;
		}
//		System.out.println("a_mul = " + a_mul);
//		System.out.println("b_mul = " + b_mul);
//		System.out.println("c_mul = " + c_mul);
		
		result = a_mul + b_mul + c_mul;
//		System.out.println("result = " + result);
		if(abc == result) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}
	
}
