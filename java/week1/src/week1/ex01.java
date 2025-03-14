package week1;

import java.util.Scanner;

public class ex01 {
	/*
		차량의 종류(일반 승용차는 ‘c’, 버스는 ‘b’, 트럭은 ‘t’ : 대소문자 구분 없음)와 주차장에서 차량이 있던 시간을 입력 받은 뒤,
		다음과 같은 주차 요금에 따라서 요금을 계산하는 프로그램을 작성하세요.
		일반 승용차 : 시간당 2000원, 버스:시간당 3000원, 트럭: 시간당 4000원
	*/
	public static void main(String[] args) {
		// 변수 선언
		int time, price; // time:주차시간, price:주차요금
		String type; // type:차량종류
		
		Scanner input = new Scanner(System.in); // 입력 받기 위한 함수
		
		System.out.print("차랑종류를 입력해주세요 : ");
		type = input.next(); // next():문자열 입력
		
		
		// 위와 같은 경우는 if보다 switch문이 가독성이 더 좋다.
		switch (type.toLowerCase()) { // toLowerCase():소문자 변환
		
			case "c": {
				System.out.print("주차시간을 입력해주세요 : ");
				time = input.nextInt(); // nextInt():숫자 입력
				
				type = "승용차";
				price = time * 2000;
				System.out.printf("차량종류:%s, 주차시간:%d, 주차요금:%d", type, time, price);
				
				break;
			}
			
			case "b": {
				System.out.print("주차시간을 입력해주세요 : ");
				time = input.nextInt();
				
				type = "버스";
				price = time * 3000;
				System.out.printf("차량종류:%s, 주차시간:%d, 주차요금:%d", type, time, price);
				
				break;
			}
			
			case "t": {
				System.out.print("주차시간을 입력해주세요 : ");
				time = input.nextInt();
				
				type = "트럭";
				price = time * 4000;
				System.out.printf("차량종류:%s, 주차시간:%d, 주차요금:%d", type, time, price);
				
				break;
			}
			
			default:
				System.out.println("차량종류를 확인해주세요.");
		}
	}
}
