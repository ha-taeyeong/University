package edu.hallym.week3;

public class CalAssembler { // 조립기
	MyCalculator calculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;
	
	public CalAssembler() {
		calculator = new MyCalculator();
		calAdd = new CalAdd();
		calSub = new CalSub();
		calMul = new CalMul();
		calDiv = new CalDiv();
		
		assemble();

	}
	
	public void assemble() {
		calculator.calculate(10, 5, new CalAdd());
		calculator.calculate(10, 5, new CalSub());
		calculator.calculate(10, 5, new CalMul());
		calculator.calculate(10, 5, new CalDiv());
	}
}
