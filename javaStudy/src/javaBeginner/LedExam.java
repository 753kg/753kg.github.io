package javaBeginner;

public class LedExam {

	public static void main(String[] args) {
		// 자바입문 파트8 인터페이스 사용
		// 관련파일 : TV, LedTV
		
		// 만약 TV인터페이스를 구현하는 LcdTV를 만들었다면 
		// 위의 코드에서 new LedTV부분만 new LcdTV로 변경해도 똑같이 프로그램이 동작할 것다. 
		// 동일한 인터페이스를 구현한다는 것은 클래스 사용법이 같다는 것을 의미한다.
		// 클래스는 이러한 인터페이스를 여러개 구현할 수 있다.
		
		// 인터페이스도 타입이 될 수 있다.
		// 이 때는 인터페이스가 가진 메서드만 사용할 수 있다.
		TV tv = new LedTV();
		tv.turnOn();
		tv.changeChannel(7);
		tv.changeVolume(50);
		tv.turnOff();
		
	}

}
