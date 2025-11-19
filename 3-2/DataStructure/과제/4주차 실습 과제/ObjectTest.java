
class Student {
	int id;
	String name;
	int score;
}

public class ObjectTest {
	static void objTest(Student ob1) { // 객체 주소 전달
		
		System.out.println(" "+ob1.id+" "+ob1.name+ " "+ob1.score);
		if (ob1.score > 70) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Java");
		Student ob1 = new Student();
		ob1.id=99;
		ob1.name="HaTaeyeong";
		ob1.score=90;
		objTest(ob1);
	}
}
