
public class Truck extends Car3 {
	// 자바입문 파트7 super와 부모생성자
	// Car3을 상속받는 Truck 클래스
	
	public Truck() {
		//super();	//안써주면 부모의 기본생성자가 호출이 자동으로 됨.
		//부모의 생성자가 매개변수를 받는 경우 오류 발생
		super("소방차");
		System.out.println("Truck의 기본 생성자 입니다.");
	}

}
