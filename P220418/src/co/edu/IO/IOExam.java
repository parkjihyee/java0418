package co.edu.IO;

import java.io.IOException;
import java.util.Scanner;

public class IOExam {

	public static void main(String[] args) {
		
        //데이터 입력을 받기 위해 scanner 선언
		Scanner sc = new Scanner(System.in);
		
	while(true) {
		System.out.println("스캐너 값을 입력하세요.");
		String str = sc.nextLine();
		//int value = sc.nextInt();
		System.out.println("입력값 : " + str);
		if(str.equals("q:")){
	        break;
		}
	}
 
		// 괄호 안 내용 출력
		//System.out.print(false);
		// 괄호 안 내용 출력 후 엔터
		//System.out.println();
		// 괄호 안의 내용 커스텀해서 출력
		//System.out.printf(null, args);
		
		//printf 정수
		int value = 100;
		System.out.printf("%d\n", value);
		System.out.printf("%5d\n", value);
		System.out.printf("%-5d\n", value);
		System.out.printf("%05d\n", value);
		
		//printf 실수
		double value2 = 12.123;
		System.out.printf("%.2f\n", value2); //소수점 아래 2자리까지만 표현
		System.out.printf("%9.4f\n", value2); //총 9자리 표현.소수점 아래 4자리까지 표현.
		System.out.printf("%-9.0f\n", value2); //총 9자리 표현.
		
		try {
			System.out.println("값을 입력하세요.");
			int keyCode = System.in.read();
			System.out.println("입력값 : " + keyCode);			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
