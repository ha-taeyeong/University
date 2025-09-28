import java.util.Random;

public class HallymCafe {
	public static void main(String[] args) {
		// 1분마다 손님 입장
		// 주문메뉴 : 1.카페라테, 2.아메리카노, 3.오렌주스, 4.콜라
		// 랜덤으로 1개 주문
		// 60분동안 주문한 각가의 음료수의 개수의 합을 계산하는 프로그램
		// 카페라테 40%, 아메리카노 30%, 오렌지주스 20%, 콜라 10%
		// 랜덤함수사용
		
		int totalMinutes = 60;

        int countLatte = 0;
        int countAmericano = 0;
        int countOrangeJuice = 0;
        int countCola = 0;
        
		Random random = new Random();
		
		for(int i=1; i<=totalMinutes; i++) {
			
			int rand = random.nextInt(100);

            if (rand < 40) { 		// 카페라테 40%
                countLatte++;
            } else if (rand < 70) { // 아메리카노 30%
                countAmericano++;
            } else if (rand < 90) { // 오렌지주스 20%
                countOrangeJuice++;
            } else {				// 콜라 10%
                countCola++;
            }
		}
		System.out.println("60분간 주문 집계");
        System.out.println("카페라테: " + countLatte);
        System.out.println("아메리카노: " + countAmericano);
        System.out.println("오렌지주스: " + countOrangeJuice);
        System.out.println("콜라: " + countCola);
	}
}
