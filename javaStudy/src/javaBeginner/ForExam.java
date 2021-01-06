package javaBeginner;

public class ForExam {

	public static void main(String[] args) {
		// 자바입문 파트3 for문
		// 변수초기화, 조건식, 증감식
		
//		int total = 0;		
//		for(int i = 1; i <= 100; i++) {
//			total = total + i;
//		}
//		
//		System.out.println(total);
		
//		int total = 0;		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 != 0) {
//				continue;	//continue 아래 부분 실행X, 처음으로 돌아감.
//			}
//			total = total + i;
//		}
//		
//		System.out.println(total);	//짝수의 합
		
		int total = 0;		
		for(int i = 1; i <= 100; i++) {
			
			total = total + i;
			
			if(i == 50) {
				break;		//반복문 빠져나감
			}
		}
		
		System.out.println(total);	//50까지의 합

	}

}
