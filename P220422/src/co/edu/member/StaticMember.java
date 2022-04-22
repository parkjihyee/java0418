package co.edu.member;

public class StaticMember {
	
	int a ; //인스턴스화 해야 사용할 수 있음
	
	static double PI = 3.14159;
	
	static int plus(int x, int y) {
		StaticMember sm = new StaticMember(); // 이게 인스턴스화 과정
		return x+y+sm.a; //인스턴스화 후 a 사용한 것
	}
	static int minus(int x, int y) {
		return x-y;
	}
}	
