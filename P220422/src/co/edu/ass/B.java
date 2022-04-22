package co.edu.ass;

public class B {
	
	public static void main(String[] args) {
		A a = new A();
		int temp;
		//1) default
		temp = a.a;
		
		//2. public
		temp = a.b;
		
		//3.protected
		temp = a.c;
		
		//4.private
		//temp = a.d; A클래스에서만 쓸 수 있게 해둔거라 B클래스에서 사용하면 오류 뜸
	}

}
