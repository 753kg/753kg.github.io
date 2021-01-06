package javaBeginner;

public class BusExam {

	public static void main(String[] args) {
		// 자바입문 파트7 상속
		
		Bus bus = new Bus();
		bus.run();			//부모클래스의 메서드는 자식클래스에서 사용 가능 = 상속받았다.
		bus.ppangppang();
		
		Car2 car = new Car2();
		car.run();
		//car.ppangppang();	//부모클래스는 자식의 메서드를 사용할 수 없다.

	}

}
