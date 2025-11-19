
public class ArrayTest10 {
	
	static void change(int[] num) {
		num[1]=50;
	}
	
	public static void main(String[] args) {
		int[] num = new int[] {10, 20, 30};
		System.out.println("1번방값="+num[1]);
		change(num);
		System.out.println("1번방값="+num[1]);
	}
}
