package com.yedam.java.ch09_01;

public class E {
	//필드
	//인스턴스 필드 - 인스턴스 멤버 클래스와 같이 감, 정적 멤버 클래스도 사용 가능
	F f = new F();
	G g = new G();

	//정적 필드
	static F f1 = new F();
	static g g1 = new G();
	
	//생성자
	
	//메소드
	//인스턴스 메소드
	void method1() {
		F f = new F();
		G g = new G();
	}
	
	//정적 메소드 : 인스턴스 멤버 클래스 사용 불가
	static void method2() {
      //F f = new F();
		G g = new G();
	}
	
	//인스턴스 멤버 클래스
	class F {}
	
	//정적 멤버 클래스
	static class G {}
	
	//16, 19 둘 다 각각 클래스의 인스턴스 필드로 사용 가능
}
