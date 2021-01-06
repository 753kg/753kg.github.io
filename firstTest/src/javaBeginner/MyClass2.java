package javaBeginner;

public class MyClass2 {
	// 자바입문 파트6 메소드 오버로딩
	// 동일한 이름으로 메소드 여러개 정의. 매개변수 수,타입이 다름
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	public String plus(String x, String y) {
		return x + y;
	}
	
}
