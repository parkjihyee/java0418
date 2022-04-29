package com.yedam.java.ch16_01;

public class MyFuntionalInterfaceExample2 {
	
	public static void main(String[] args) {
		//매개변수가 있고 리턴값이 없는 람다식
		
		MyFuntionalInterface2 fi;
		
		fi = (x) -> { //매개변수의 수 만큼 ()안 선언?
			int result = x * 5;
			System.out.println(result);
		}; 
		
		fi.method(5);
		
		//11,12행을 한 줄로 줄이면
		fi = (x) -> { System.out.println(x * 5);};
		fi.method(4);
		
		fi = x -> System.out.println(x*5);
		fi.method(3);
	}
}
