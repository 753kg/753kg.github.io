package javaBeginner;

public class ExceptionExam2 {

	public static void main(String[] args) {
		// 자바입문 파트9 Throws
		// 예외가 발생한 쪽에서 처리하지 않고 호출한 쪽에서 처리해라, 오류를 떠넘김
		
		int i = 10;
		int j = 0;
		try {
			int k = divide(i, j);
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public static int divide(int i, int j) throws ArithmeticException{
		int k = i / j;
		return k;
	}

}
