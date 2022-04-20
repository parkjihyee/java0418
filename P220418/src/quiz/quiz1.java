package quiz;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("화씨온도를 입력하세요.");
		int		fahrenheit = scanner.nextInt();
		
		float celcius = (float)5/9 * (fahrenheit-32);
		System.out.printf("입력한 화씨온도를 섭씨온도로 변환한 값 : %.2f" , celcius);
		scanner.close();
	}

}
