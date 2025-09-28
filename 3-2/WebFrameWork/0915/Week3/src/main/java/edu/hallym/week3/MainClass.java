package edu.hallym.week3;

public class MainClass {

	public static void main(String[] args) {
		new CalAssembler();
	}

}
/*

1안
package edu.hallym.week3;

public class MainClass {

	public static void main(String[] args) {
		
		MyCalculator calculator = new MyCalculator();
		
		calculator.calAdd(10, 5, new CalAdd());
		calculator.calSub(10, 5, new CalSub());
		calculator.calMul(10, 5, new CalMul());
		calculator.calDiv(10, 5, new CalDiv());

	}

}


2안
package edu.hallym.week3;

public class MainClass {

	public static void main(String[] args) {
		MyCalculator calculator = new MyCalculator();
		
		calculator.calculate(10, 5, new CalAdd());
		calculator.calculate(10, 5, new CalSub());
		calculator.calculate(10, 5, new CalMul());
		calculator.calculate(10, 5, new CalDiv());
	}

}

*/