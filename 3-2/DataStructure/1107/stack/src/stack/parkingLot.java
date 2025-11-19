package stack;

import java.util.Stack;
import java.util.Scanner;

public class parkingLot {
	public static void main(String[] args) {
		Stack<String> parkingA = new Stack<>();
		Stack<String> parkingB = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int optNum = 0;
		String carNum = "";
		String carFound = "";
		int count = 0;
		
		while(true) {
			System.out.println("==================================================");
			System.out.println("		  한림대 주차 서비스		");
			System.out.println("==================================================");
			System.out.println("종료(0) | 입고(1) | 출고(2) | 주차공간확인(3) | 전체조회(4)");
			System.out.print("옵션 번호: ");
			optNum = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기 위함
			
			if(optNum!=0 && optNum!=1 && optNum!=2 && optNum!=3 && optNum!=4) {
				System.out.println("옵션 번호를 확인해주세요.");
				System.out.println("종료(0) | 입고(1) | 출고(2) | 주차공간확인(3) | 전체조회(4)");
				System.out.print("옵션 번호: ");
				optNum = sc.nextInt();
				sc.nextLine(); // 버퍼 비우기 위함
			}
			
			switch(optNum) {
				// 종
				case 0:
					System.out.println("서비스 종료");
					break;
				// 입고
				case 1:
					System.out.print("입고할 차량번호를 입력해주세요(4자리): ");
					carNum = sc.next();
					if(carNum.length() != 4) {
						System.out.println("차량번호를 확인해주세요.");
						
					} else {
						if(parkingA.size() == 10) {
							System.out.println("parkingA 공간은 만차입니다.");
						} else {
							parkingA.push(carNum);
							System.out.println("차량 번호 [" + carNum + "]이 주차되었습니다.");
						}
					}
					break;
				// 출고
				case 2:
					System.out.print("출고할 차량번호를 입력해주세요(4자리): ");
					carNum = sc.next();
					if(carNum.length() != 4) {
						System.out.println("차량번호를 확인해주세요.");
						
					} else {
						while(!parkingA.isEmpty()) {
							carFound = parkingA.pop();
							if(carFound.equals(carNum)) {
								System.out.println(carFound);
								System.out.println("차량 번호 [" + carNum + "]이 출고되었습니다.");
							} else {
								parkingB.push(carFound);
							}
						}
						while(!parkingB.isEmpty()) {
							parkingA.push(parkingB.pop());
						}
					}
					break;
					
				case 3: // 차량 갯수 확인
					int currentCnt = parkingA.size();
					int availableCnt = 10 - currentCnt;
					System.out.println("현재 주차된 차량은 " + currentCnt + "대 입니다.");
					System.out.println("남은 주차공간은 " + availableCnt + "대 입니다.");
					break;
					
				case 4:
					System.out.println(parkingA);
					break;
			}
			if(optNum == 0) {
				return;
			}
		}
		
	}
}
