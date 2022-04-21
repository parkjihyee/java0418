package co.edu.oop;

public class StudentMain {

	public static void main(String[] args) {

		StudentProgram std = new StudentProgram();
		std.studentNo = 56789;
		std.name = "홍길동";
		std.kor = 95;
		std.math = 80;
		std.eng = 85;
		std.info();
		std.avg();

	}

}
