package com.yedam.java.ch02_03;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		parent.field2 = "data2"
		parent.method3();
		*/
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
		
		//타입이 무엇으로 정의되어있는지에 따라 호출되는 값이 달라짐..?
	}

}
