package com.yedam.java.Homework;

public class EmpDept extends Employee{
	
	//필드
	public String dept;

	//생성자
	public EmpDept(String name, int salary, String dept) {
		super(name, salary);
		this.dept = dept;
	}
	
	//메소드
	@Override
	public void getInformation() {
		System.out.println("이름: " + this.name + "연봉: " + this.salary + "부서: " + this.dept);
		
	}
}
