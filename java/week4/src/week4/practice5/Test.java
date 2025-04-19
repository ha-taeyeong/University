package week4.practice5;

public class Test {
	public static void main(String[] args) {
		Magazine bookA = new Magazine("잡지A", 10, "기자A", "2010년 2월 25일");
		Magazine bookB = new Magazine("잡지B", 20, "기자B", "2010년 3월 8일");
		//bookB의 타입을 다음과 같이 Book으로 선언 하였을 때 발생하는 문제는? 
		//Book 타입에서 Magazine 클래스의 고유 속성이나 메서드에 접근할 수 없음
		//Book bookB = new Magazine("잡지B", 20, "기자B", "2010년 3월 8일"); 
        //제시된 결과처럼 출력될 수 있도록 완성 – 본인작성
		System.out.println(bookA);
		System.out.println("---bookA 객체 저자 변경 후---");
		bookA.setWriter("기자변경");
		System.out.println(bookA);
		System.out.println(bookB);
		System.out.println("---bookB 객체 페이지 변경 후---");
		bookB.setPages(50);
		System.out.println(bookB);
		System.out.println("---bookB 객체 발매일 변경 후---");
		bookB.setDate("2020년 8월 31일");
		System.out.println(bookB);
	}
}
