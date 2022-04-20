package co.edu.oop;

public class Student {

	//필드 : 정보를 받을 수 있는 변수를 넣는 곳
	String name;
	int age;
	int kor;
	int eng;
	int math;
	//생성자 (필수) 클래스이름과 동일하게 만들어야함. 객체를 만들기위해 필요한 구문
	public Student() {
		
	}
	//메소드(함수), 객체의 기능
	void getInfo() {
		System.out.println("학생의 이름 : " + name + "\n 나이 : " + age);
	}
}
