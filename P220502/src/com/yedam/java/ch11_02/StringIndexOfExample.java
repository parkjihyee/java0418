package com.yedam.java.ch11_02;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		String subject1 = "JAVA PROGRAMING"; //대소문자 구분함
		
		int location = subject.indexOf("프로그래밍");  //프로그래밍이 시작되는 위치인 3을 정수로 알려줌
		System.out.println(location);
		
		//내가 찾고자하는 글자가 내부에 있는지 확인. 값이 있으면 0이상의 값. 없으면 -1 반환.
		//개발자는 보통 이런식으로 사용함
		if(subject.indexOf("java") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		 }else {
			 System.out.println("자바와 관련이 없는 책이군요.");
	}
	}
}
