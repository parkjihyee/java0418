package co.library.P220517.book;

import java.util.List;

public interface Book {
	public void printBestSeller();		//베스트셀러 목록 출력
	public boolean bookFileExists();	//도서파일 존재 확인
	public List<BookDTO> getBookInfoList;	//전체 도서 정보 가져오기
	public BookDTO getBookInfo(int bookIndex);	//하나의 도서 정보 가져오기
	public void bookInfoPrint(int bookIndex);	//도서 정보 출력
	public void selectBookListPrint(String keyword); //도서 검색
}
