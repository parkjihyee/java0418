package com.yedam.java.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework_0502 {

	public static void main(String[] args) {
	//프로그램이 실행되면 문제는 Orange, Game, Phone, Smart 중 하나가 랜덤으로 선정되도록
		List<String> list = new ArrayList<String>();
		
		list.add("Orange");
		list.add("Game");
		list.add("Phone");
		list.add("Smart");
		
		
		Scanner sc = new Scanner(System.in);
		
		while (true) { 
		System.out.println("============================================");
		System.out.println("1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료");
		System.out.println("============================================");
		
		//random 
		int menu = Integer.parseInt(sc.nextLine());
		
		if (menu == 1) {
			
			
			System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
			System.out.println("입력값>> "  );
			
		}
	}

}
}