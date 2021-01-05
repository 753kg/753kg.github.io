
public class OperatorExam2 {

	public static void main(String[] args) {
		// 자바입문 파트2 비교연산자
		// = : 단순대입연산자
		// += : 복합대입연산자
		
		int i = 10;
		int j = 10;
		
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i < j);
		System.out.println(i <= j);
		System.out.println(i > j);
		System.out.println(i >= j);
		
		i += 10;		//i = i + 10;
		
		System.out.println(i);
		
		System.out.println(i -= 5);
		System.out.println(i);

	}

}
