package javaBeginner;

public class MyCal implements Calculator {
	// 자바입문 파트8 인터페이스 default method
	// 관련 파일: Calculator, MyCalTest

	@Override
	public int plus(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	@Override
	public int multiple(int i, int j) {
		// TODO Auto-generated method stub
		return i * j;
	}

}
