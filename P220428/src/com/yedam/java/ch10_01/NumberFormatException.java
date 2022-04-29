package com.yedam.java.ch10_01;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); //모든 문자열을 숫자로 바꾸는건 안됨. 숫자 양식이 맞지 않기 때문에 난 오류.
		
		int result = value1 + value2;
		
		System.out.println(data1 + "+" + data2 + "=" + result);
	}

}
