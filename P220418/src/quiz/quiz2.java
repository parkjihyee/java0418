package quiz;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0), 바위(1) 보(2) 입력 :");
		int a = scan.nextInt();
		
		if (a==0) {
				System.out.println("Player : 0");
				}
		if (a==1) {
				System.out.println("Player : 1");
				}
		if (a==2) {
				System.out.println("Player : 2");
				}
		//컴퓨터
		int com=(int)(Math.random()*3);
		if(com==0)
		{
			System.out.println("컴퓨터 : 0");
		}
		if(com==1)
		{
			System.out.println("컴퓨터 : 1");
		}
		if(com==2)
		{
			System.out.println("컴퓨터 : 2");
		}
	}
}
		
	


