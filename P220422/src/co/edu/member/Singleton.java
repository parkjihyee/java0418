package co.edu.member;

public class Singleton {

	//필드
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {
	//다른 클래스에서 싱글톤을 만들지 못하게 하기 위해 private 사용
	}
	
	//정적 메소드
	static Singleton getInstance( ) {
		if(singleton ==null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
}
