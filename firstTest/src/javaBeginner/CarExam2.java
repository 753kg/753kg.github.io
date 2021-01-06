package javaBeginner;

public class CarExam2 {

	public static void main(String[] args) {
		// 자바입문 파트6 생성자
		// new 다음에 오는 게 생성자.
		// 기본 생성자 : 리턴타입이 없다. 선언 안해도 자동으로 기본 생성자 생김.
		// 생성자 선언 => public 클래스명(매개변수들){구현}
		// 메소드 선언 => public 리턴타입 메소드명(매개변수들){구현}
		// 생성자를 하나라도 만들면 기본 생성자는 만들어지지 않음.
		
		//Car c1 = new Car();	//기본 생성자
		Car c2 = new Car("소방차");
		Car c3 = new Car("구급차");
		
		System.out.println(c2.name);

	}

}
