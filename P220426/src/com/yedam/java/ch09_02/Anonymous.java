package com.yedam.java.ch09_02;

public class Anonymous {
	//필드 초기값으로 대입
	Person field = new Person() {//익명객체라 내부에 있는걸 새롭게 정의해둬야함.
		void work() {
			System.out.println("출근합니다.");
		}
		//work를 외부에서도 알 수 있게 오버라이딩을 통해 호출
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	//로컬 변수값으로 대입
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			public void wake() {
				super.wake();
				walk();
			}
		};
		
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
