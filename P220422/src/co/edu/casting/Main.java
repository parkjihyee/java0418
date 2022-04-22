package co.edu.casting;

public class Main {
 public static void main(String[] args) {
	
	 Parent p1 = new Child();
	 
	 p1.method1();
	 p1.method2();
	 p1.method3();
	 //p1.method4(); //parent 클래스에 method4가 없기 때문에 오류뜸
 
	 
	 //클래스 타입 배열
	 Parent p2 = new Parent();
	 Parent p3 = new Parent();
	 Parent p4 = new Parent();
	 
	 Parent[] parent = {p2,p3,p4};
 
 }


}
