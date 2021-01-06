package javaBeginner;

public class Duck extends Bird {
	// 자바입문 파트7 추상클래스
	// 추상클래스 Bird를 상속받은 Duck 클래스
	// 추상 메서드를 구현해야 한다.

	@Override
	public void sing() {
		System.out.println("꽥꽥!!");
	}

}
