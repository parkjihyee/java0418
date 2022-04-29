package com.yedam.java.ch15_02;

public class Utill {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		return box; //리턴되는 타입 앞에 꺽쇠를 넣어서 선언..? <> 
		
		//메서드에서 제네릭타입을 쓸 때는 리턴되는 타입 앞에 선언.
		//
	}
}
