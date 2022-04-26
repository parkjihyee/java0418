package com.yedam.java.ch08_02;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {    //강제타입 변환할때는 반드시 instance of 사용
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		vehicle.run();
		
		
		
		//부모, 인터페이스는 나를 구현하는 클래스를 선택x 정보가 없음
	}
	}
}
