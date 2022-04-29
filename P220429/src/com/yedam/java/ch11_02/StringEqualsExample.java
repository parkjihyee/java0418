package com.yedam.java.ch11_02;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동"; 
		// => 메모리상에 있는 객체의 갯수는 2개
		//각각의 변수로 선언되어있지만 메모리상으로는 하나의 객체를 공유하고 있음
		//같은 내용이라도 다른 객체를 만들고 싶으면 new연산자를 반드시 사용해야함
		String str3 = new String("홍길동");
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 객체를 참조합니다.");
		}else {
			System.out.println("str1과 str2는 다른 객체를 참조합니다.");
		}
				
		if(str1 == str3) {
			System.out.println("str1과 str3는 같은 객체를 참조합니다.");
		}else {
			System.out.println("str1과 str3는 다른 객체를 참조합니다.");
		}
		System.out.println();
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열을 가집니다.");
		}else {
			System.out.println("str1과 str2는 다른 문자열을 가집니다.");
		}
		if(str1.equals(str3)) {
			System.out.println("str1과 str3는 같은 문자열을 가집니다.");
		}else {
			System.out.println("str1과 str3는 다른 문자열을 가집니다.");
		}
	}

}
