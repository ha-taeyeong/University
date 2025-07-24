package week3.practice3;

public class Main {

	public static void main(String[] args) {
		Shoes shoes1=new Shoes(255, 3, "샌들" );
		Shoes shoes2=new Shoes(235, 5, "운동화" );
							
		System.out.printf("shoes1 : %s\n",shoes1); // toString
		System.out.printf("shoes2 : %s\n\n",shoes2);
			
		System.out.println("샌들 다섯개를 판매합니다");
		if(shoes1.sell(5))
			System.out.println("현재 샌들의 개수는 " + shoes1.getCnt() + " 입니다");
		else
			System.out.println("수량부족입니다");
			
		System.out.println("운동화 2개를 추가합니다");
		shoes2.add(2);
		System.out.println("현재 운동화 개수는 " + shoes2.getCnt() + " 입니다");
	}

}
