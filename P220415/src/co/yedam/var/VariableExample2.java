package co.yedam.var;

public class VariableExample2 {

	public static void main(String[] args) {

//		byte a = 10;
//		int b = a;
//		long c = b;
//		
//		byte d = 10;
//		char f = d;
//		
		//강제 타입 변환
		int intValue = 44032;
		char charValue = (char)intValue;
		
		int intValue1 = 10; //1byte 127까지 표현 가능
		byte byteValue = (byte)intValue1;
		
		System.out.println(byteValue);
		
	}

}
