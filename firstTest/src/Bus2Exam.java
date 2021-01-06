
public class Bus2Exam {

	public static void main(String[] args) {
		// 자바입문 파트7 오버라이딩
		// 관련파일: Car4, Bus2
		
//		Bus2 bus = new Bus2();
//		bus.run();
		
		// 자바입문 파트7 클래스 형변환
		// 관련파일: Car4, Bus2
		// 부모타입으로 자식객체를 참조하게 되면 부모가 가지고 있는 메소드만 사용할 수 있다. 
		// 자식객체가 가지고 있는 메소드나 속성을 사용하고 싶다면 형변환 해야 한다.
		// 부모가 큰 그릇
		
		Car4 c = new Bus2();	//Car 타입에 Bus 타입을 담음
		c.run();
//		c.ppangppang();
		
		Bus2 bus = (Bus2) c;	//Car 타입은 Bus타입보다 크므로 형변환 해야함.
								//생성을 Bus로 했기 때문에 Bus로 형변환이 가능함.
		bus.run();
		bus.ppangppang();

	}

}
