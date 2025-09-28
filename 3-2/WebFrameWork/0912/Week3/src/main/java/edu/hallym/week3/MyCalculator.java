package edu.hallym.week3;

public class MyCalculator {
	
	void calculate(int fNum, int sNum, Icalculator cal) {
		int value = cal.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}

}


/*
package edu.hallym.week3;

public class MyCalculator {
	
	public void calAdd(int i, int j, CalAdd add) { // DI : 주입
//		ICalculator cal = new CalAdd(); // 생성자는 무조건 클래스임
		int value = add.doOperation(i, j);
		System.out.println("result : " + value);
	}
	public void calSub(int i, int j, CalSub sub) {
//		ICalculator cal = new CalSub();
		int value = sub.doOperation(i, j);
		System.out.println("result : " + value);
	}
	public void calMul(int i, int j, CalMul mul) {
//		ICalculator cal = new CalMul();
		int value = mul.doOperation(i, j);
		System.out.println("result : " + value);
	}
	public void calDiv(int i, int j, CalDiv div) {
//		ICalculator cal = new CalDiv();
		int value = div.doOperation(i, j);
		System.out.println("result : " + value);
	}

}
*/