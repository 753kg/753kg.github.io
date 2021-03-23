package view;

import java.util.List;

import model.BookVO;
import model.BorrowVO;

public class LibraryView {

	public static void printBooks(List<BookVO> booklist) {
		int count = 0;
		for(BookVO book : booklist) {
			System.out.println(book);
			count ++;
		}
		if(count != 0) System.out.println("총 " + count + "건");
		else print("검색 결과가 없습니다.");
	}
	
	public static void printBorrows(List<BorrowVO> borrlist) {
		int count = 0;
		for(BorrowVO borr : borrlist) {
			System.out.println(borr);
			count ++;
		}
		if(count != 0) System.out.println("총 " + count + "건");
		else print("대출 이력이 없습니다.");
	}
	
	
	public static void print(String message) {
		System.out.println("-------- 알림 -------");
		System.out.println(message);
		System.out.println("-------------------");
	}
}
