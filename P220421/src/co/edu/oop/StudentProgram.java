package co.edu.oop;

public class StudentProgram {
	// 필드
	int studentNo;
	String name;
	int kor;
	int math;
	int eng;

	// 생성자
	public StudentProgram() {

	}

	// 메소드
	void info() {
		System.out.println("학번: " + studentNo  + " | 이름: " + name + " | 국어: " + kor + " | 수학: " + math + " | 영어: " + eng);
	}

	void avg() {
		int result = (kor + math + eng) / 3;
		System.out.println("평균점수: " + result);
	}
}
