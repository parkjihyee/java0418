package com.yedam.java.ch09_01;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		A tempA = new A();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		A.B tempB = tempA.new B();
		
		A.C.field2 = 0;
		
		//로컬 클래스 객체 생성
		a.method();
	}

}
