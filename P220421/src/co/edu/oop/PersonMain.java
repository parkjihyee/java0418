package co.edu.oop;

public class PersonMain {

	public static void main(String[] args) {
		//Main 클래스
		// 생성자에 데이터를 입력하여 객체 생성
		// 임의의 3명에 대한 객체를 만들고 메소드 introduce 호출하여 정보 출력
		
		Person p1 = new Person("980115-1234566", "가나다", "주소1", 25);
		Person p2 = new Person("970115-1234566", "나다라", "주소2", 26);
		Person p3 = new Person("960115-4554566", "다라마", "주소3", 27);
		
		p1.introduce();
		System.out.println();
		p2.introduce();
		System.out.println();
		p3.introduce();
	}

}
