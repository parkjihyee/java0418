package com.yedam.java.ch11_02;

public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = "    01";
		String tel2 = "02    ";
		String tel3 = "  03  ";
		
		System.out.println(tel1 + tel2 + tel3 );
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
		
	}

}