
public class MethodOverloadExam {

	public static void main(String[] args) {
		// 자바입문 파트6 메소드 오버로딩
		
		MyClass2 m = new MyClass2();
		
		System.out.println(m.plus(4, 5));
		System.out.println(m.plus(4, 6, 7));
		System.out.println(m.plus("hello", "world"));

	}

}
