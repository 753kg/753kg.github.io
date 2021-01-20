package javaIntermediate;

public class JoinExam {

	public static void main(String[] args) {
		// 자바중급 파트7 쓰레드와 상태제어(join)
		// 관련파일 : MyThread3
		
		MyThread3 thread = new MyThread3();
		thread.start();
		
		// 메인도 하나의 스레드이다.
		System.out.println("시작");
		
		try {
			// 해당 쓰레드가 멈출 때까지 기다림.
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("종료");

	}

}
