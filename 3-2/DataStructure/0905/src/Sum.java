
public class Sum {
	public static void main(String[] args) {
		
		int sum = 0;
		
//		1.sum = n(n+1)/2
//		for(int i = 1; i < 101; i++) {
//			sum = i*(i+1)/2;
//		}
		
//		2. sum = 1+2+3...+n
//		for(int i = 1; i < 101; i++) {
//			sum += i;
//		}
		
//		3.sum = 0+(1)+(1+1)+(1+1+1)+....
		for(int i=1; i<101; i++) {
			for(int j=1; j<=i; j++) {
				sum += 1;
			}
		}
		
		System.out.println(sum);
	}
}
