package week3;

public class Calculator {
	int hap(int ...values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum +=values[i];
		}
		return sum;
	}
}
