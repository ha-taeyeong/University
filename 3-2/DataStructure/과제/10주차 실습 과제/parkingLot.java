package stack;

import java.util.Stack;
import java.util.Scanner;

public class parkingLot {
	public static void main(String[] args) {
		System.out.println("hello java");
		Stack<Integer> parkingA = new Stack<>();
		Stack<Integer> parkingB = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String carNum = "";
		
		while(true) {
			System.out.println("");
			System.out.println("차량번호를 입력해주세요(4자리). 입력을 마치려면 'end'를 입력세요.");
			carNum = sc.next();
			if (carNum.equals("end")){
				System.out.println("주차등록이 종료되었습니다.");
				break;
				
			} else if(carNum.length() != 4) {
				System.out.println("차량번호를 확인해주세요.");
				
			} else {
				System.out.println("차량 번호 [" + carNum + "]이 주차되었습니다.");
			}
		}
		
		
 		
//		if(parkingA.size() == 10) {
//			System.out.println("parkingA 공간은 만차입니다.");
//		}
//		if(parkingB.size() == 10) {
//			System.out.println("parkingA 공간은 만차입니다.");
//		}
		
		
		
	}
}
