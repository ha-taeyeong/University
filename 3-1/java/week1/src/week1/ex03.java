package week1;

import java.util.Arrays;

public class ex03 {
	/*
	 * 10~99사이의 난수 10개로 초기화된 배열에서 가장 작은 값을 출력하는 프로그램을 작성하세요
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		int rnd;
		
		for(int i=0; i < arr.length; i++) {
			rnd = (int)(Math.random()*90) + 10;
			arr[i] = rnd;
		}
		
		int min = arr[0];
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("배열" + Arrays.toString(arr) + "\t최소값" + min);
	}

}
