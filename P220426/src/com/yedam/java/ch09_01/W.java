package com.yedam.java.ch09_01;

public class W {
	//필드
	int field1;
	static int field2;
	
	//메소드
	void method1() {}
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class Y{
		void method() {
			field1 = 10;
			field2 = 20;
			
			method1();
			method2();
		}
	}
	
	//정적 멤버 클래스 바깥클래스의 인스턴스없이 접근 가능. 바깥 클래스의 정적 메소드, 필드만 사용가능
	static class Z{
		void method() {
			field1 = 10;
			field2 = 20;
			
			method1();
			method2();
	}
}
}