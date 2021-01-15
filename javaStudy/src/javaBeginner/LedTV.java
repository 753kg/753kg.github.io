package javaBeginner;

public class LedTV implements TV {
	// 자바입문 파트8 인터페이스 사용
	// 관련 파일 : TV, LedExam
	
	// TV라는 인터페이스를 구현하겠다.
	// TV가 가진 기능들을 LedTV도 모두 갖게 하겠다.
	// TV의 모든 기능을 구현해야 함.
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨 조정");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널 조정");

	}

}
