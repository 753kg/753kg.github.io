package javaBeginner;

public interface TV {
	// 자바 입문 파트8 인터페이스 정의
	// 관련 파일 : LedTV, LedExam
	
	// 객체를 선언하기 전에 그 객체가 어떤 기능을 갖고 있으면 좋을지
	// 그 기능들을 모아놓은 것.
	// 기능이니까 메서드로
	// 추상메서드와 비슷하다. 추상메서드는 abstract 붙임.
	// 인터페이스는 객체 생성 못함.
	
	// final 없어도 상수처럼 선언됨.
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
