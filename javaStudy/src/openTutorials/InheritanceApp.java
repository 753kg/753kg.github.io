package openTutorials;

class Cal {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	// 오버로딩(Overloading) : 같은 이름의 메소드를 여러개 정의할 수 있음.이 때 매개변수의 타입과 개수는 달라야 함.
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2) + v3;	// this : 자기 자신
	}
}

class Cal3 extends Cal {
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	
	// 오버라이딩(Overriding) : 부모클래스가 가진 기능을 재정의.
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!");
		return super.sum(v1, v2);		// 부모클래스 Cal의 sum을 가리킴
	}
}

public class InheritanceApp {

	public static void main(String[] args) {
		// 생활코딩 JAVA 상속
		
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2, 1, 1));
		
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2, 1));
		System.out.println(c3.minus(2, 1));
		
		

	}

}
