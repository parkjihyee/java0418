package com.yedam.java.ch09_01;

public class OutterExample {

	public static void main(String[] args) {
		//네스트클래스 불러오기. 아우터를 이용해서 인스턴스 하나 만들고
		Outter outter = new Outter();
		
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
