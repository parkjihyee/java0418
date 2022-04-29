package com.yedam.java.ch11_01;

public class Main {

	public static void main(String[] args) {
		//String str1 = new String("홍길동");
		//String str2 = new String("홍길동"); 
		//값은 같지만 hashCode는 다름. new연산자를 썼기 때문에 java는 다르게 인식함.
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if (i==5) {
				//return;  //main에서 사용할때만 System.exit와 같은 의미로 사용됨.
				//break; //강제종료가 아니라 for문을 종료하는거라 실행하면 마지막행의 마무리코드가 출력됨
				//System.exit(0); 메인뿐만아니라 어느 위치에 있든 강제 종료시킴
			}
		}
		System.out.println("마무리 코드");
	}

}
