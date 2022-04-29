package com.yedam.java.ch10_02;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}

	public static void findClass() throws ClassNotFoundException { //어떤 예외가 발생할 수 있는지 선언
		Class clazz = Class.forName("java.lang.String");
		
	}
}
