package com.yedam.java.ch10_01;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {   //(String[] args) :매개변수
		if(args.length == 2) {
		
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]" + data1); //여기서 비정상적으로 종료되어서
		System.out.println("args[1]" + data2); //이건 실행되지 않음
	}else {
		System.out.println("매개변수를 2개 입력 해주세요.");
	}
  }
}
