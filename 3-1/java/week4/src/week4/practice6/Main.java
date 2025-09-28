package week4.practice6;

public class Main {

	public static void main(String[] args) {
		
		Melon m1 = new Melon(1200, 2500, 21, "Hallym_farm");
		Melon m2 = new Melon(1000, 2000, 10, "Software_farm");
		
		System.out.println("m1 객체정보 [ " + m1 + "]");
		System.out.println("m2 객체정보 [ " + m2 + "]\n");
		System.out.println(">> m2 객체의 cost와 경작농원 정보 변경 후");
		m2.setCost(3000);
		m2.setInfo("java_farm");
		System.out.println(m2 + "\n");
		
		System.out.println("m1: 중량 >> " + m1.getKg());
		System.out.println("프로그램 종료");

	}

}
