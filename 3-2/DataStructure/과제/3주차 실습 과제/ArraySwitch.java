import java.util.Arrays;

public class ArraySwitch {

	public static void main(String[] args) {
		// 1
		int x=3;
		int y=5;
		int temp = 0;
		System.out.println("before x = " + x + ", y = " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("after x = " + x + ", y = " + y);
		
		// 2
		int[]a = {1,2,3,4};
		int[]b = {5,6,7,8,9};
		int[]empty =a;
		
		System.out.println("before a = " + Arrays.toString(a) + ", b = " + Arrays.toString(b));
		a = b;
		b = empty;
		System.out.println("after a = " + Arrays.toString(a) + ", b = " + Arrays.toString(b));
		
	}

}
