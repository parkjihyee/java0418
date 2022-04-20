package co.edu.array;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		boolean run = true; //반복문을 돌리기위해
		int studentNum = 0;
		int[] scores = null; //배열에 데이터를 담기위해
		Scanner scanner = new Scanner(System.in); //데이터 입력 받기 위해
		
	while(run) {
	 //1.학생 수: 배열 크기 설정, 2.점수 입력: 배열 데이터 입력, 3.점수 리스트: 배열 데이터 출력
	 //4.분석: 최대값, 평균 구하기, 5.종료: 반복문 종료
	 System.out.println("-------------------------------------------");
	 System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 |5.종료");
	 System.out.println("-------------------------------------------");
	 System.out.println("선택> ");
	 
	 //sc.nextLine:문자열을 받을 수 있는 스캐너 기능 / integer~ :문자열을 정수로 변환
	 int selectNo = Integer.parseInt(scanner.nextLine());
	 
	 if(selectNo == 1) {
		System.out.println("학생수> ");
		studentNum = Integer.parseInt(scanner.nextLine());
		scores = new int[studentNum];
	 } else if(selectNo == 2) {
	    for(int i=0; i<scores.length; i++) {
	    System.out.println("scores["+i+"]>");
	    scores[i] = scanner.nextInt();
	    }
	 } else if(selectNo == 3) {
		//
	 } else if(selectNo == 4) {
		 int sum = 0;
		 int max = 0;
		
	 } else if(selectNo == 5) {
	   run = false;
	 }
	}
	System.out.println("프로그램 종료");
	}

}
