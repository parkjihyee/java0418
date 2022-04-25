package com.yedam.java.ch02_01;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); //부모 생성자인 tire를 불러온것
	}
	
	@Override // 오버라이드 한다는것은 메소드 시그니쳐가 동일하다는것..? 내 입맛에 맞게 수정하는것
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
	}
	
	

}
