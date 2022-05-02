package com.yedam.java.ch11_02;

public class StringValueOfExample {

	public static void main(String[] args) {
		int intValue = 10;
		double doubleValue = 10.5;
		boolean booleanValue = true;
		
		//정석 방법
		String intStr = String.valueOf(intValue);
		String doubleStr = String.valueOf(doubleValue);
		String booleanStr = String.valueOf(booleanValue);
		
		
		System.out.println(intStr);
		System.out.println(doubleStr);
		System.out.println(booleanStr);
		
		
		System.out.println(""+intValue);
		System.out.println(""+doubleValue);
		System.out.println(""+booleanValue);
	}

}
