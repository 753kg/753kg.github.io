package javaBeginner;
import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// 자바입문 파트3 do while문
		// 무조건 한 번은 수행 된다.
		// 1. do를 한번 실행
		// 2. while문이 만족할 때 do로 가서 실행
		
		int value = 0;
		Scanner scan = new Scanner(System.in);	//키보드로부터 값을 입력받는 클래스
		
		do {
			//반복할 문장
			value = scan.nextInt();	//정수값을 입력받아 value에 넣음
			System.out.println("입력받은 값: "+value);
			
		}while(value != 10);	//10이 아닌 숫자가 들어오면 계속 반복, 10이 들어오면 반복 종료
		
		System.out.println("반복 종료!!");
		

	}

}
