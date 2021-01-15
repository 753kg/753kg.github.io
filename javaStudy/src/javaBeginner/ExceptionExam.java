package javaBeginner;

public class ExceptionExam {

	public static void main(String[] args) {
		// 자바입문 파트9 Exception
		
		// Exception 예외 : 프로그램 실행 중 예기치 못한 사건
		// Exception이 발생한 지점부터 프로그램은 종료됨.
		// 예외처리문법 try-catch-finally
		// try : 수행할 코드
		// catch : try에서 예외가 발생했을 때 실행할 코드, 여러 개 사용 가능
		// finally : 예외 발생 여부에 상관없이 반드시 실행되는 블록, 생략 가능
		
		int i = 10;
		int j = 5;
		
		try {
			int k = i/j;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다." + e.toString());
			// to.String() : 예외 정보를 알려주는 메서드
			// 어떤 Exception이 발생할지 모를 때는 catch(Exception e)
		}finally {
			System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행!!");
		}
		System.out.println("main end!!");

	}

}
