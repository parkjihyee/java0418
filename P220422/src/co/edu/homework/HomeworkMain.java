package co.edu.homework;

import java.util.Scanner;

public class HomeworkMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		HomeworkMain hm = new HomeworkMain ();
		
		System.out.println("<학생 관리 프로그램>");
		
		while (true) {
			System.out.println("===================================================");
			System.out.println("1.학생수 | 2.학생 정보 입력 | 3.학생 정보 출력 | 4.순위 | 5.종료");
			System.out.println("===================================================");
			
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu==1) {
				System.out.println("학생수>");
				money = Integer.parseInt(sc.nextLine());
			}else if(menu==2) {
				System.out.println("학생 정보 입력>");
				money = Integer.parseInt(sc.nextLine());
			}else if(menu==3) {
				System.out.println("학생 정보 출력>");
			}else if(menu==4) {
				System.out.println("순위");
			}else if(menu==5) {
				System.out.println("종료");				
				break;
			
		}
	}

}
