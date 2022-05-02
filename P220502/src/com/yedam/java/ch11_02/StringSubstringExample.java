package com.yedam.java.ch11_02;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "980115-1234567";
		
		String firstNum = ssn.substring(0, 6); //index0포함 ~ 6제외
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // index7부터 끝까지
		System.out.println(secondNum);
	}

}
