package openTutorials;

class Cal2 {
	int v1, v2;
	
	// 생성자
	Cal2(int v1, int v2) {
		System.out.println("Cal2 init!!");
		this.v1 = v1;
		this.v2 = v2;
	}
	
	public int sum() {return this.v1+v2;}
}

class Cal23 extends Cal2 {
	
	// 생성자가 있는 클래스를 상속받았다면, 생성자를 만들어서 부모클래스를 반드시 호출해야함.
	Cal23(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal23 init!!");
	}
	
	public int minus() {return this.v1-v2;}
	
}

public class InheritanceApp2 {

	public static void main(String[] args) {
		// 생활코딩 JAVA 상속 - 상속과 생성자
		
		Cal2 c = new Cal2(2, 1);
		Cal23 c3 = new Cal23(3, 4);
		System.out.println(c3.sum());	//3
		System.out.println(c3.minus());	//1
		
		System.out.println(c.v1);
		System.out.println(c3.v1);
	}
	
	
}
