package co.edu.extend;

public class Main2 {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		//부모 클래스의 takeOff 메소드 호출
		sa.takeOff();
		//자식 클래스의 오버라이드한 fly 메소드
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		//자식 클래스의 오버라이드한 fly 메소드 
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		//자식 클래스의 오버라이드한 fly 메소드 
		sa.fly();
		//부모 클래스의 land 메소드 호출 
		sa.land();
	}
}
