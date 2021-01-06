package javaBeginner;

public class WhileExam {

	public static void main(String[] args) {
		// 자바입문 파트3 while문
		// 반복문: while, do while, for 문
		
//		int i = 0;
//		
//		while(i < 10) {
//			System.out.println(i);
//			i++;
//		}
		
		int total = 0;
		int i = 1;
		
		while(i <= 100) {
			total = total + i;
			i++;
		}
		
		System.out.println(total);
		
		//무한루프
		while(true) {
			System.out.println("hello");
		}
		
		

	}

}
