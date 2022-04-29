package com.yedam.java.ch11_01;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");
		
		//equals를 오버라이딩 하고 나면 결과가 달라짐
		//if(m1 == m2) { 
		if(m1.equals(m2)) {
			System.out.println("m1과 m2는 동등합니다.");
		}else {
			System.out.println("m1과 m2는 동등하지 않습니다.");
		}
		if(m1.equals(m3)) {
			System.out.println("m1과 m3은 동등합니다.");
		}else {
			System.out.println("m1과 m3은 동등하지 않습니다.");
		}
	}

}
