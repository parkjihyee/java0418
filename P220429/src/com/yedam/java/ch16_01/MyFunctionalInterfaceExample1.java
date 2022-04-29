package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExample1 {

	public static void main(String[] args) {
		//매개변수도 리턴값도 존재하지 않는 람다식
		//메소드는 무언가에 포함되어있어야함. 
		MyFunctionalInterfaceExample1 fi; //fi라는 변수 선언

		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2");}
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
	}
}

