package co.edu.loop;

public class LoofExam {

	public static void main(String[] args) {
		int sum = 0;
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		
		System.out.println("1~5의 합 : " + sum);
		
		//1~5까지의 합을 만들어보는 프로그램
		for(int i= 1; i<=5; i++) {
			//첫번째 sum = 0
			// 1) i=1, 0 = 0 + 1; -> sum = 1;
			// 2) i=2, 1 = 1 + 2; -> sum = 3;
			// 3) i=3, 3 = 3 + 3; -> sum = 6;
			// 4) i=4, 6 = 6 + 4; -> sum = 10;
			// 5) i=5, 10 = 10 + 5; -> 최종적 sum = 15;
			sum = sum + i;
		}
		//구구단 2단 만들기
		for(int i = 1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * " + j +" = "+ i*j);
			}
		}
		
		for(int i = 1; i<=100; i++ ) {
			if(i%3==0) {
				System.out.println("3의 배수 : " + i);
			}
		for(int i1 = 1; i1<=100; i1++ ) {
			if(i1 % 2 == 1) {
			System.out.println("홀수 : " + i1);
			} else if (i1 % 2 ==0) {
			System.out.println("짝수 : " + i1);
			}
		}
		//*
		//**
		//***
		//****
		//*****
		//a<=5
		for(int a =1; a<6; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
        //*****
		//****
		//***
		//**
		//*
		for(int i =5; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		
	    //    *
	    //   **
	    //  ***
	    // ****
	    //*****
		for(int i =0; i<=5; i++) {
			for(int j=5; j>0; j--) {
				if(i<j) {
				System.out.print(" ");
			}
				else {
			System.out.print("*");
		}
			System.out.println();
	}
}
	}
}

