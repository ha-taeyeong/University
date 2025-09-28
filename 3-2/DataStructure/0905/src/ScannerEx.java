import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x1 > ");
		int iX = sc.nextInt();
		System.out.print("x2 > ");
		int iY = sc.nextInt();
		System.out.println("" + iX + "" + iY);
	}
}
