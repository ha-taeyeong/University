package week2.task.java3;

public class MemberTest {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		System.out.println("==== 디폴트 값으로 초기화 된 필드 값 ====");
		member.show();
		
		// 5. 4번의 생성자를 사용하여 객체를 생성하는 문장을 작성해 보세요
		member.resetMember("java", "program", "javagram", 10);
		
		// 6. 5번에서 생성된 객체의 필드값을 출력하는 문장을 작성해 보세요. 
		System.out.println("==== 변경된 필드 값 ====");
		member.show();
		
		
		System.out.println("==== 오버로딩한 생성자로 초기화된 필드 값 ====");
		member.resetMember("hallym", "software", "bigai", 30);
		member.show();
	}

}
