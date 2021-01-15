package javaBeginner;

public class ExceptionExam3 {

	public static void main(String[] args) {
		// 자바입문 파트9 Exception 발생시키기
		// throw는 오류를 떠넘기는 throws와 보통 같이 사용됨.
		
		int i = 10;
		int j = 0;
		
		try {
			int k = divide(i, j);
			System.out.println(k);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public static int divide(int i, int j) throws IllegalArgumentException{
		if(j == 0) {
			// 직접 예외를 발생시킴
			throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
		}
		int k = i / j;
		return k;
	}

}