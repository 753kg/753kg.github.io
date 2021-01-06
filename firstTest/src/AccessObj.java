
public class AccessObj {
	// 자바입문 파트7 접근제한자
	// public : 어떤 클래스든 접근할 수 있다.
	// protected : 같은 패키지면 접근 가능, 다른패키지라도 상속 받은 경우 가능.
	// private : 자기 자신만 접근 가능.
	// default 접근지정자 : 같은 패키지 내에서 접근 허용
	// public > protected > default > private
	// 필드, 메서드, 클래스 앞에 붙여 사용 가능.
	
	public int p = 3;
	protected int p2 = 4;
	private int i = 1;
	
	int k = 2;	// default 접근지정자
}
