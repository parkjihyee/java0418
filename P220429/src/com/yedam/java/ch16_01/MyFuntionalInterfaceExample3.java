package com.yedam.java.ch16_01;

public class MyFuntionalInterfaceExample3 {

	public static void main(String[] args) {
		// 두 개의 매개변수가 있고 리턴값이 있는 람다식
		MyFuntionalInterface3 fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;			
		};
		System.out.println(fi.method(2, 5));
		
		//위의 내용을 줄여쓰면
		fi = (x, y) -> { return x+y; };
		System.out.println(fi.method(4, 7));
		
		fi = (x, y) -> x+y;
		System.out.println(fi.method(10, 20));
		
		fi = (x, y) -> Math.subtractExact(x, y);
		System.out.println(fi.method(10, 20));
	}

}
