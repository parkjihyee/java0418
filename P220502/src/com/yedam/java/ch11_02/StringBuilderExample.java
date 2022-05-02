package com.yedam.java.ch11_02;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		//문자열을 끝에 추가
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		//해당 인덱스 위치에 값을 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		//해당 인덱스 위치의 값을 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		//시작 인덱스부터 끝 지정한 인덱스 전까지 지정해서 대체
		sb.replace(5, 13, " Book");
		System.out.println(sb.toString());
		
		//시작 인덱스부터 지정한 인덱스 전까지 삭제
		sb.delete(4, 5); //index4부터 5전까지
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자 수 : " + length);
		
		
		String result = sb.toString();
		sb.delete(0, 4);
		System.out.println(result); 
		System.out.println(sb.toString());
		//스트링빌더가 값을 가지고 있으면 계속 연산이 일어나기때문에 값을 반환해줘야함..? 
	}

}
