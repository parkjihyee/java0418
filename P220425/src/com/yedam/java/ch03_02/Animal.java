package com.yedam.java.ch03_02;

public abstract class Animal { //추상클래스내에 추상메소드가 없을수는 있다. but 추상 메소드가 있는 클래스는 반드시 추상 클래슫 지정해야함. ??
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();

}
