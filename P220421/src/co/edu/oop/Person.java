package co.edu.oop;

public class Person {
		//필드
		// 1. 주민번호 2.이름 3.주소 4.나이
		String ssn;
		String name;
		String addr;
		int age;
		
		//생성자
		// 1. 기본 생성자 (필드 초기화 X)
		// 2. 주민번호, 이름, 주소, 나이를 매개변수로 필드 초기화
		public Person() { //기본 생성자
		}
		
		public Person(String ssn, String name, String addr, int age) { //매개변수 사용
			super();
			this.ssn = ssn; // 인스턴스 필드 = 데이터 => 초기화
			this.name = name;
			this.addr = addr;
			this.age = age;
		}
		//메소드
		// 1. introduce ->"Person[name : John, age : 20]"
		void introduce() {
			System.out.println("[이름 : " + this.name + " | 나이 : " + this.age + " | 주민등록번호 :" + this.ssn + " | 거주지 : " + this.addr + " ]");
		
		
		}
}		
		
		
	

