package com.kosta.day05;

//Book�� �̿��ؼ� �������� 
public class BookMgr {
	Book[] booklist;
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	void printBookList(){
		System.out.println("=== å ��� ==="); 
		for(Book book :booklist) {
			System.out.println(book.getTitle());
		}			 
	}
	void printTotalPrice(){
		System.out.println("=== å ������ ���� ===");
		int total = 0;
		for(Book book :booklist) {
			total += book.getPrice();
		}	
		System.out.println("��ü å ������ �� :" + total);

	}
}
