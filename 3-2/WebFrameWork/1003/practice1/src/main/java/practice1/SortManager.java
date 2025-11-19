package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class SortManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[10];
		
		System.out.print("정수 10개를 입력하세요:");
		for (int i = 0; i < 10; i++) {
			data[i] = sc.nextInt();
		}
		
		System.out.println("정렬 전: " + Arrays.toString(data));
		
		// SortManager가 BubbleSorter 객체를 직접 생성하고 의존 (강한 결합)
		BubbleSorter sorter = new BubbleSorter();
		sorter.sort(data);
		
		System.out.println("정렬 후: " + Arrays.toString(data));
		
		sc.close();
		
	}
}
