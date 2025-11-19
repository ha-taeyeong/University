import java.util.Arrays;

public class ArrayTest12 {
	
	public static void main(String[] args) {
		System.out.println("Hello Java");
		int intArr[] = {10, 30, 20, 70, 90, 5, 80, 100};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		int key=80;
		System.out.println(Arrays.binarySearch(intArr, key));
	}
}
