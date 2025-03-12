package week2.test;

public class ContactTest {

	public static void main(String[] args) {
		
		Contact contact = new Contact("hallym", "248"); // 클래스 객체 생성, ():생성자 호출
		contact.setAge(40);
		if(contact.search(40)) {
//			contact.show();
			System.out.println("phoneNumber : " + contact.getPhoneNumber());
			
		}else {
			
			System.out.print("저장된 연락처가 존재하지 않습니다.");
		
		}
		
	}

}
