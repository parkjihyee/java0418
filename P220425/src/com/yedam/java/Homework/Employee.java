package com.yedam.java.Homework;

public class Employee {
	
	//필드
	public String name;
	public int salary;
	
	//생성자
	public Employee() {		
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	//메소드
	public void getInformation() {
		System.out.println("이름: " + this.name + "연봉: " + this.salary);
	

	}
	
	
}
