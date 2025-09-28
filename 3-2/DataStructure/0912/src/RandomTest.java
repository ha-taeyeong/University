import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		int n;
		n=100;
		System.out.println("Number :" + n);
		int[] myNumber = new int[n];
		Random random = new Random();
		for (int i = 0; i < myNumber.length; i++) {
			myNumber[i] = random.nextInt(n);
			System.out.println(" " + myNumber[i]);
		}
	}
}
