package com.yedam.java.ch02_04;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner); //부모클래스의 생성자 호출. 이것이 무조건 1순위. 그렇지 않으면 자식클래스도 생성 불가능.
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
