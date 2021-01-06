
public class TruckExam {

	public static void main(String[] args) {
		// 자바입문 파트7 super와 부모생성자
		// 객체가 생성될 때, 반드시 생성자를 실행하고 생성됨
		// 기본생성자에 출력되도록 정의했기 때문에 글자가 출력됨.
		// truck 객체가 생성될 때 부모객체 car객체가 생기고 truck 객체가 생김
		// 따라서 car 생성자 호출 -> truck 생성자 호출.
		// super: 부모 객체를 나타내는 키워드
		// this: 나를 나타내는 키워드
		
		Truck t = new Truck();
		//Car3 c = new Car3();
		

	}

}
