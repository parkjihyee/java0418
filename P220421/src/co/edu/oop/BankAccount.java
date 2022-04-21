package co.edu.oop;

public class BankAccount {
	//필드
	// 계좌번호, 예금주, 잔액
	String account;
	String name;
	int balance;
	
	//생성자
	// 매개변수 3개(계좌번호, 예금주, 잔액)를 가지는 생성자
	public BankAccount(String account, String name, int blance) {
	super();
	this.account = account;
	this.name = name;
	this.balance = balance;
	}
	
	//메소드
	// 1.예금을 할 수 있는 메소드
	// 2.출금을 할 수 있는 메소드
	// 3.현재 잔액을 확인할 수 있는 메소드
	void deposit(int money) {
		this.balance += money;
		System.out.println("계좌번호>" + this.account);
		System.out.println("예금주" + this.name);
		System.out.println("예금 후 잔액>" + this.balance);
	}
	void withDraw(int money) {
		this.balance += money;
		System.out.println("계좌번호>" + this.account);
		System.out.println("예금주" + this.name);
		System.out.println("예금 후 잔액>" + this.balance);
	}
	int nowMoney(int money) {
		return balance;
		
	}
	//Main Class
	// 인스턴스는 1개, 인자 3개를 가지도록 생성.
	// Scanner 이용해서 예금,출금,잔액 확인
	// 반복문 이용해서 1.예금, 2.출금, 3.잔액 확인, 4.종료
}
