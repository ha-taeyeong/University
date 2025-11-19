package project2;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[10];
		
		System.out.print("정수 10개를 입력하세요:");
		for (int i = 0; i < 10; i++) {
			data[i] = sc.nextInt();
		}
		
		System.out.println("정렬 전: " + Arrays.toString(data));
		
		// 의존성 객체 생성
		Sort bubbleSorter = new BubbleSort();
		
		// 의존성 주입: SortService에 생성한 BubbleSort 객체를 주
		SortService sortService = new SortService(bubbleSorter);
		
		// 서비스 실
		sortService.runSort(data);
		
		System.out.println("정렬 후: " + Arrays.toString(data));
		
		sc.close();
		
	}
}
