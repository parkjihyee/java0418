package com.yedam.java.ch08_02;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}

}
