package com.yedam.java.homework;

public class QuestionPlus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method(true);
		method(false);

	}
	
	public static void method(boolean value){
		try { //true일때는 1,3,5 / false일때는 1,2,5,6
		System.out.println(1);
		
		if(value){
			throw new RuntimeException();
		}
			System.out.println(2);
		}catch(RuntimeException e) {
			System.out.println(3);
			return; //코드가 정상적으로 실행되다가 리턴을 만나면 거기서 종료됨 리턴의 값이 있든없든 상관없이. 원래는 메소드를 강제로 종료할 때 사용
			//3을 만나고 메소드가 종료되어야하는데 왜 실행되었는지? -> finally문은 무조건 실행되기 때문!
		}catch(Exception e) {
			System.out.println(4); //RuntimeException이 실행되든 안 되는 4는 출력 안되게
		}finally {
			System.out.println(5);
		}
			System.out.println(6);
	}
}
/*
2) 출력결과
1
3
5
1
2
5
6

3) 조건 : 다중 catch문 사용
*/
