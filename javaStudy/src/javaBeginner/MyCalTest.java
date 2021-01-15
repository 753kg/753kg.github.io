package javaBeginner;

public class MyCalTest {

	public static void main(String[] args) {
		// 자바입문 파트8 인터페이스 default method
		// 관련 파일: Calculator, MyCal
		
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		// static 메서드는 인터페이스명.메서드명 으로 호출해야 함
		Calculator.exec2(3, 4);
		

	}

}
