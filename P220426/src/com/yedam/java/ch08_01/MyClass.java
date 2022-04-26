package com.yedam.java.ch08_01;

public class MyClass {
	//필드
	RemotControl rc = new SmartTelevision();
	
	//생성자
	MyClass() {
	}
	
	MyClass(RemotControl rc) {
		this.rc = rc;
		this.rc.turnOn();
		this.rc.turnOff();
	}
	
	//메소드
	void methodA() {
		RemotControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);

}

	public void methodB(RemotControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}