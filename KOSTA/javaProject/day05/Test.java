package com.kosta.day05;

public class Test {

	public static void main(String[] args) {
		method2();
	}
	private static void method2() {
		Book[] booklist = new Book[5];
		booklist[0] = new Book("�ڹ�", 25000);
		booklist[1] = new Book("SQL", 20000);
		booklist[2] = new Book("Web", 35000);
		booklist[3] = new Book("Spring", 45000);
		booklist[4] = new Book("ORM", 55000);
		
		printBookInfo(booklist); //�ּ����� 
		printBookInfo2(booklist); //�ּ����� 
		
		//å���� 2�� �λ��Ѵ�.
		upPrice(booklist);
		printBookPrice(booklist);
	}

	private static void printBookPrice(Book[] booklist) {
		for(Book b:booklist) {
			System.out.println(b.getTitle() + "-->" + b.getPrice()); 
		}
		
	}
	private static void upPrice(Book[] booklist) {
		for(Book b:booklist) {
			b.setPrice( b.getPrice() * 2 );
		}
		
	}
	private static void printBookInfo2(Book[] booklist3) {
		System.out.println("*****************");
		for(Book b:booklist3) {
			System.out.println(b.getTitle());
		}
		
	}
	private static void printBookInfo(Book[] booklist2) {
		booklist2[0].setTitle("�ڹ����α׷���");
		for(Book b:booklist2) {
			System.out.println(b.getTitle());
		}
		
	}
	private static void method1() {
		String title1 = "����";
		String title2 = "����";
		
		//String title1 = new String("����");
		//String title2 = new String("����");
		
		System.out.println(System.identityHashCode(title1));
		System.out.println(System.identityHashCode(title2));
		
		title1 = title1 + "��";
		title2 = title2 + "��";
		
		System.out.println(System.identityHashCode(title1));
		System.out.println(System.identityHashCode(title2));
		
		System.out.println(title1 == title2);//�ּҺ�
		System.out.println(title1.equals(title2));//����
		
		
	}

}
