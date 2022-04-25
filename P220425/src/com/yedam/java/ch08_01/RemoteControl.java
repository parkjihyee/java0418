package com.yedam.java.ch08_01;

public interface RemoteControl {
	
	//상수 필드
	public static final int MAX_VOLUME = 10; //상수는 변수 이름을 대문자로 해야함
	int MIN_VOLUME = 0; // public static final int MIN_VOLUME = 0; 컴파일하면 이렇게 바뀜
	
	//추상 메서드
	public abstract void turnOn();
	void turnOff(); // public abstract void turnOff(); 컴파일하면 이렇게 바뀜 
}
