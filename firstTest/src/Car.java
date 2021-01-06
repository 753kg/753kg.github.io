// 자바입문 파트5 클래스   선언
// 자바입문 파트5 필드 선언
// 필드 = 객체가 가지는 속성. ex)이름, 번호

public class Car {
	//필드 선언
	//타입 필드명
	String name;
	int number;
	
	//자바입문 파트6 생성자
	//반드시 이름을 갖고 만들게 하고 싶다.
//	public Car(String n) {
//		name = n;
//	}
	
	//자바입문 파트6 this
	//this 내 필드, 객체 자신을 참조하는 키워드.
	//변수는 직관적으로 선언하는 게 좋다.
	public Car(String name) {
		this.name = name;
	}
	
	// 자바입문 파트6 생성자 오버로딩과 this
	// 기본생성자를 직접 정의해줌.
	public Car() {
//		this.name = "이름 없음";
//		this.number = 0;
		this("이름없음", 0);	
		//String과 int를 가지는 생성자가 호출이 됨.
		// 자기 자신의 생성자를 호출 -> 코드 중복 방지
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
}
