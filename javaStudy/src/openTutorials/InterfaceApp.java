package openTutorials;

interface Calculable{
	// 변수 정의할 땐 값을 적음.
	// 메소드는 구현 X
	double PI = 3.14;
	int sum(int v1, int v2);
}

interface Printable{
	void print();
}

class RealCal implements Calculable, Printable{

	@Override
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	@Override
	public void print() {
		System.out.println("This is RealCal!!");
		
	}
	
}



public class InterfaceApp {

	public static void main(String[] args) {
		// 생활코딩 JAVA Interface
		// 인터페이스 : 클래스의 형태를 규정
		// 하나의 클래스는 여러개의 인터페이스를 구현할 수 있다.
		// 자바는 단 하나의 클래스만 상속받을 수 있다.
		// 자바는 여러개의 인스턴스를 구현할 수 있다.
		
		Printable c = new RealCal();		// Printable의 기능만 이용하겠다.
		//System.out.println(c.sum(2, 1));
		c.print();
		//System.out.println(c.PI);

	}

}
// 다형성 : 하나의 클래스가 여러가지의 얼굴을 갖게하는 것.
// 인터페이스도 타입이 될 수 있음.
// Calculable에는 PI와 sum이 있지만, print는 없으므로 사용할 수 없다.
