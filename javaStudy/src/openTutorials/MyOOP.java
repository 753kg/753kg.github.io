package openTutorials;

// 파일의 이름과 똑같은 class 앞에는 public을 붙인다.
public class MyOOP {
	
	public static void main(String[] args) {
		// 생활코딩 JAVA 객체 지향 프로그래밍
		// 변수와 메소드 , 클래스, 인스턴스, 생성자(Constructor)
		// 관련 파일 : Print
		// 생성자 : 인스턴스 생성시에 꼭 지정해야 하는 값이 있을 때  만든다.
		
		// new Print() : Print 클래스 복제
		Print p1 = new Print("----");
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print("****");
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
	}

}
