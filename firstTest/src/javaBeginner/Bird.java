package javaBeginner;

public abstract class Bird {
	// 자바입문 파트7 추상클래스
	// 추상클래스: 새, 가구, 포유류, 음식 처럼 모호한 클래스
	// 모호하다 : 사람마다 딱 떠올리는 게 다름
	// 추상클래스는 부모는 될 수 있지만 객체는 될 수 없다.
	// 구체적인 클래스만 객체가 될 수 있다.
	
	// 새가 짹짹 울건지, 구구, 비둘비둘 .. 어떻게 구현해야할 지 모를 때
	// 구현하지 않고 = {} 쓰지 않음
	// 메소드 리턴타입 앞에 abstract 붙임
	// 메소드가 하나라도 abstract가 되면 해당 클래스는 추상클래스가 됨.
	// 따라서 클래스에도 abstract 붙어야 함.
	
	public abstract void sing();
	
	public void fly() {
		System.out.println("날다");
	}
}
