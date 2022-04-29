package com.yedam.java.ch10_02;

public class CatchByExceptionExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];  //여기서 오류가 발생. 그래서 13행까지 실행하지않고 14행이 실행됨.->18행 실행됨
			String data2 = args[1];						
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(value1 + "+" + value2 + "=" + result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("항상 실행!");
	}
	}
}
