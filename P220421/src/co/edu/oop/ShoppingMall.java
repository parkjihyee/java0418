package co.edu.oop;

public class ShoppingMall {
	//필드
	int orderNo;
	String ID;
	String name;
	int itemNo;
	String addr;
	
	//생성자
	public ShoppingMall(int orderNo, String iD, String name, int itemnumber, String addr) {
		super();
		this.orderNo = orderNo;
		ID = iD;
		this.name = name;
		this.itemNo = itemnumber;
		this.addr = addr;
	}
	//메소드
	void info() {
		System.out.println("주문번호: " + orderNo);
		System.out.println("주문자 아이디: " + ID);
		System.out.println("주문자 이름: " + name);
		System.out.println("주문 상품 번호: " + itemNo);
		System.out.println("배송 주소: " + addr);
	
	}
	}
