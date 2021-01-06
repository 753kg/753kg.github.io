package javaBeginner;

public class CarExam {

	public static void main(String[] args) {
		// 자바입문 파트5 클래스 선언
		// new : new 뒤의 생성자를 이용하여 메모리에 객체를 만들라는 명령.
		// 이렇게 만들어진 객체를 참조하는 변수가 c1, c2.
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		// 자바입문 파트5 필드 선언
		
		c1.name = "소방차";
		c1.number = 1234;
		
		c2.name = "구급차";
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		
		System.out.println(c2.name);
		System.out.println(c2.number);

	}

}
