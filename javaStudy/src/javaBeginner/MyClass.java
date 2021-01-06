package javaBeginner;
//자바입문 파트5 메소드 선언
//메소드: 클래스가 가지고 있는 기능

public class MyClass {
//	public 리턴타입 메소드명(매개변수들){
//		기능구현
//	}
	
	//입력값(매개변수) 없음, 리턴값 없음.
	public void method1() {
		System.out.println("m1이 실행됨..");
	}
	
	//입력값 정수, 리턴 X
	public void method2(int x) {
		System.out.println(x + "를 이용한 m2 실행");
	}
	
	//입력값X, 정수 리턴
	public int method3() {
		System.out.println("m3 실행");
		return 10;
	}
	
	//입력값 정수 2개, 리턴 X
	public void method4(int x, int y) {
		System.out.println(x + y + " m4 실행");
	}
	
	//입력값 정수, 정수 리턴
	public int method5(int x) {
		System.out.println(x + "를 이용한 m5 실행");
		return x * 2;
	}
	
}
