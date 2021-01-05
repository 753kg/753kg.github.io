
public class OperatorExam3 {

	public static void main(String[] args) {
		// 자바입문 파트2 연산자 우선순위
		// && 연산자가 || 연산자보다 우선순위 높음.
		
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println((a - b) * c);
		
		System.out.println(a > 5 && b > 5);
		System.out.println(a > 5 || b > 5);
		
//		System.out.println(++a - 5);	//전위
		System.out.println(a++ - 5);	//후위
		System.out.println(a);

	}

}
