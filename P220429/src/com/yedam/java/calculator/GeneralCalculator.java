package com.yedam.java.calculator;

public class GeneralCalculator extends Calculator {

	@Override
	public void init() {
		 numList = new double[2];
		 numCount = -1;
	}

	@Override
	public void setInputNum(double num) {
		
	}

	@Override
	public void print() {
		System.out.print("현재까지 입력된 숫자 : ");
	}

	@Override
	public void plus() {
		if(check()) {
			System.out.printf("+ : %.1f\n", numList[0] + numList[1]); }
	}

	private boolean check() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void subtract() {
		if(check()) {
			System.out.printf("- : %.1f\n", numList[0] - numList[1]); }
	}

	@Override
	public void multiply() {
		if(check()) {
			System.out.printf("* : %.1f\n", numList[0] * numList[1]); }
	}

	@Override
	public void division() {
		if(check()) {
			System.out.printf("/ : %.1f\n", numList[0] / numList[1]); }
	}

	@Override
	public void remain() {
		
	}

	@Override
	public void delete() {
		
	}

}
