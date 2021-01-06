package javaBeginner;

public class MyClassExam {

	public static void main(String[] args) {
		// 자바입문 파트5 메소드 사용해보기
		
		MyClass myclass = new MyClass();
		
		myclass.method1();
		
		myclass.method2(10);
		
		int value = myclass.method3();	//리턴값이 있을 때
		System.out.println("m3이 리턴한 값: " + value);
		
		myclass.method4(5, 10);
		
		int value2 = myclass.method5(55);
		System.out.println("m5가 리턴한 값: " + value2);

	}

}
