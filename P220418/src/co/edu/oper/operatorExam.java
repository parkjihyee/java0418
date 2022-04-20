package co.edu.oper;

public class operatorExam {

	public static void main(String[] args) {
       
		
		//+, -, *, /, %
		//         /: 몫, %: 몫을 제외한 나머지를 출력
		// 10000초 -> 10000/(60*60) => 시간
		//        -> 10000/60 =>분
		//        -> 10000%60 =>초
		int hour = 10000/(60*60); // 시간으로 변환
		int min = 10000/60; // 분으로 변환
		int sec = 10000%60; // 남는 초 계산
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		
		int i = 0;
		int j =0;
		//i = i + 1;
		//대입 연산자
		//i += 1;
		//증감 연산자
		// i = i +1;
		//i = i + j++;
		//i = i + ++j;
		
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		
		
	}

}
