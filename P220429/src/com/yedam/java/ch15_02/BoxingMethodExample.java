package com.yedam.java.ch15_02;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box = Utill.<Integer>boxing(100);
		int intValue = box.getT();
		
		Box<String> strBox = Utill.<String>boxing("홍길동");
		String strValue = strBox.getT();
	}

}
