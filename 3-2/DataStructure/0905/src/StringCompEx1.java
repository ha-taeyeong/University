
public class StringCompEx1 {
	public static void main(String[] args) {
		String s1 = "Hallym";
		String s2 = "Hallym";
		String s3 = new String("Hallym");
		String s4 = "Hanlim";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		if(s1.equals(s4)) {
			System.out.println("s1 and s4 are same strings");
		} else {
			System.out.println("s1 and s4 are not same strings");
		}
		if(s1.compareTo(s2) == 0) {
			System.out.println("s1 and s2 are same strings");
		} else {
			System.out.println("s1 and s2 are not same strings");
		}
	}
}
