package javaBeginner;

public interface Calculator {
	// 자바입문 파트8 인터페이스 default method
	// 관련 파일: MyCal, MyCalTest
	
	// default 키워드를 이용하여 메서드 구현 가능.
	// 구현한 클래스에서는 메서드 오버라이딩 가능.
	
	// static 메서드도 구현 가능.
	// static 메서드는 인터페이스명.메서드명 으로 호출해야 함
	
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	default int exec(int i, int j) {
		return i + j;
	}
	
	public static int exec2(int i, int j) {
		return i * j;
	}
}
