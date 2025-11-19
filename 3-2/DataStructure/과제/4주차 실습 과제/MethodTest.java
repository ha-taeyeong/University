
class Method{
	// 클래스
	static int sum(int i, int j) {
		int sum = 0;
		for(int x=i; x<=j; x++) {
			sum=sum+x;
		}
		return sum;
	}
	
	int sum2(int i, int j) {
		int sum = 0;
		for(int x=i; x<=j; x++) {
			sum=sum+x;
		}
		return sum;
	}
}

public class MethodTest {
	// 정적 메서드
	static int sum(int i, int j) {
		int sum = 0;
		for(int x=i; x<=j; x++) {
			sum=sum+x;
		}
		return sum;
	}
	// 인스턴스 메서드
	int sum2(int i, int j) {
		int sum = 0;
		for(int x=i; x<=j; x++) {
			sum=sum+x;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1, 100));
		
		System.out.println(Method.sum(1, 10));
		
		MethodTest obj1 = new MethodTest();
		System.out.println(obj1.sum2(1, 20));
		
		Method obj2 = new Method();
		System.out.println(obj2.sum2(1, 30));
	}
}
