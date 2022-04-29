package com.yedam.java.ch10_02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// 
		try {
			Class clazz = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다.");
		
	}

}
}