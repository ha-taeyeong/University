package week4.practice4;
/*
 * (4)	Person 클래스를 설계합니다. Person 클래스는 이름, 주소, 전화번호를 필드로 가집니다.
 * 		하나 이상의 생성자를 정의하고 각 필드에 대하여 접근자/설정자 메소드를 작성하세요.
 * 		Person 클래스를 상속 받아 Customer 클래스를 작성합니다.
 * 		Customer는 고객 번호와 마일리지를 필드로 가집니다.
 * 		한 개 이상의 생성자를 작성하고  접근자/설정자 메소드를 작성하세요.
 * 		두개의 클래스 모두 객체 정보를 문자열로 반환하는 toString() 메소드를 정의합니다.
 * 		테스트 클래스를 작성하여 위 클래스 타입의 객체를 만들고 각 객체의 모든 정보를 출력하세요
 */
public class PersonTest {
	
	public static void main(String[] args) {
		//이름, 주소, 고객 번호, 마일리지
		Customer customer1=new Customer("hallym", "춘천시", null, "cn120", 1000);
		
		//이름, 주소, 전화번호,고객 번호, 마일리지
		Customer customer2=new Customer("software", "화천군", "248-2328", "cn845", 3000);	
		
		//이름, 주소, 전화번호
		Person person= new Person("computer", "횡성군", "240-5000");  
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(person);
	}
}

