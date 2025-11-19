
public class ArrayList1 {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		String[] list1 = new String[4];
		list1[0] = "Kim";
		list1[1] = "Lee";
		list1[2] = "Park";
		list1[3] = "Choi";
		System.out.println("원소의 개수="+list1.length);
		System.out.println("마지막원소="+list1[list1.length-1]);
		System.out.println("첫번째원소="+list1[0]);
	}
}
