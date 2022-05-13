package co.library.P220517.book;

import java.io.Serializable;

public class BookDTO implements Serializable {
	private int bookIndex;		//도서 관리 번호
	private String bookName;	//도서 제목
	private String author;		//저자
	private String publisher;	//출판사
	private String category;	//분류
	private int reservationCheck;	//대여 상태(대여 가능:0, 대여 불가능:1)
	private String registerDate;	//도서 등록 날짜
	private int bookQuantity;		//도서 수량
	
	
	public int getBookIndex() {
		return bookIndex;
	}
	public void setBookIndex(int bookIndex) {
		this.bookIndex = bookIndex;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReservationCheck() {
		return reservationCheck;
	}
	public void setReservationCheck(int reservationCheck) {
		this.reservationCheck = reservationCheck;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public int getBookQuantity() {
		return bookQuantity;
	}
	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	
	@Override
	public String toString() {
		return "Book DTO [bookIndex = " + bookIndex +", bookName = " + bookName + ", author = " + author + 
				", publisher = " + publisher + ", categoty = " + category + ", reservationCheck = " + reservationCheck +
				", registerDate = " + registerDate + "]";
	}
	
}
