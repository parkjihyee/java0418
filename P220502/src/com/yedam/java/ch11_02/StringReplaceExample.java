package com.yedam.java.ch11_02;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//String은 수정을 많이 일으킬때 사용하는 객체는 아님
		//Stringbuilder
	}

}
