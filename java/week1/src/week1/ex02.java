package week1;

public class ex02 {
	/*
	 * 	두 개의 주사위 눈의 합이 6이면 반복을 종료하는 프로그램을 작성하시오 – do~while() 사용
	 */
	public static void main(String[] args) {
		
		int rnd1, rnd2, count = 0, sum = 0;
				
		do {
			rnd1 = (int)(Math.random()*6)+1;
			rnd2 = (int)(Math.random()*6)+1;
			
			count++;
			sum = rnd1 + rnd2;
			
		} while (sum != 6);
		
		System.out.printf("수행 횟수:%d, 주사위1:%d, 주사위2:%d, 합계:%d", count, rnd1, rnd2, sum);

	}

}
