package edu.hallym.week3;

public class CalDiv implements Icalculator {
	
	@Override
	public int doOperation(int firstNum, int secondNum) {
		return secondNum != 0 ? (firstNum / secondNum) : 0;
	}

}
