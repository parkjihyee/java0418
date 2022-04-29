package com.yedam.java.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
			int answer = (int) (Math.random() * 100) + 1;
					
		// 사용자입력을 저장할 공간
			int input = 0; //input이 변수로 지정된 것 

		// 시도횟수를 세기 위한 변수
			int count = 0; 
				
			do{ //출력결과를 실행하는 코드부분
				
				
				//시도 횟수를 증가시키기 (순서 상관x)
				count++;
				
				//사용자가 숫자를 입력 (순서 상관x)
				//->숫자 이외의 값을 입력할 경우 예외처리하기
				try {
					System.out.println("1과 100사이의 값을 입력하세요: ");
					input = new Scanner(System.in).nextInt(); 
				}catch(InputMismatchException e) {
					System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
					continue;
				}
				
								
				//컴퓨터가 가지고 있는 숫자 < 사용자가 입력한 숫자
				//->"더 작은 수를 입력하세요."
				else if(answer < input) {
					System.out.println("더 작은 수를 입력하세요.");
				}
				//컴퓨터가 가지고 있는 숫자 = 사용자가 입력한 숫자
				//->"맞혔습니다."
				//->"시도횟수를 출력
				else {
					System.out.println("맞혔습니다.");
					System.out.println("시도횟수: " + count + "번 입니다.");
					break;
				}
			}while(true);
		}
	
	}
//do while문 쓴 이유: 프로그램 돌렸을때 사용자가 값을 입력하는것을 유도하기위해. 조건이 성립되지않더라도 반드시 한 번은 실행된다는것을 보장
//