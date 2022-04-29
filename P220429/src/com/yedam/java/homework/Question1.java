package com.yedam.java.homework;

public class Question1 {
//	Question1] 다음과 같이 실행코드가 있는 경우 발생할 수 있는 예외가 무엇인지 채워넣으세요.


	public static void main(String[] args){
		String[] strArray = { "10" , "2a" };
		int value = 0;
		for(int i = 0; i <= 2; i++ ){
    	try{
        	value = Integer.parseInt(strArray[i]);
        } catch(NumberFormatException e){
        	System.out.println("숫자로 변환될 수 없는 문자가 포함되어 리턴할 수 없습니다");
        } catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("인덱스 범위를 벗어났습니다.");
        } finally {
        	System.out.println(value);
        }
    }
}
}