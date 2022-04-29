package com.yedam.java.ch15_01;

public class BoxExample {

	public static void main(String[] args) {		
		/*
		Box box = new Box();
		
		box.setObject("홍길동"); //box에 홍길동을 담음. 캐스팅변환이 자동으로 일어나 문제가 없음 
		String name = (String)box.getObject(); //String으로 강제 타입변환
		
		box.setObject(new Apple());
		Apple apple = (Apple) box.getObject(); //box에 담은 apple를 다시 꺼냄
		*/
		//이 방법은 값은 하나의 변수에 여러개를 담을 수 있지만 다른 타입이 들어올때마다 타입변환을 해야함
		
		Box<String> stringBox = new Box<String>();
		
		stringBox.set("홍길동");
		String name = stringBox.get();
		
		Box<Apple> appleBox = new Box<Apple>();
		
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		//변수는 두개를 사용하지만 성능상 더 훌륭
		
		/*
		stringBox.set(new Apple());
		Apple apple = stringBox.get();
		*/
		//Box<String> String은 <T>. T가 적힌곳이 다 string으로 바뀜
		//한 번 Box<>안을 string으로 지정해두면 다 바뀜 -> new Apple은 타입 불일치가 나서 오류뜸
		//apple을 받고 싶다면 다른 박스를 준비해야함 (22~25행)
	}

}
