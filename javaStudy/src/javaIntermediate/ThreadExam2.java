package javaIntermediate;

public class ThreadExam2 {

	public static void main(String[] args) {
		// 자바중급 파트7 쓰레드 만들기
		// 관련파일 : MyThread2
		
		MyThread2 t1 = new MyThread2("*");
		MyThread2 t2 = new MyThread2("-");
		
		// 러너블 인터페이스는 start() 메서드가 없음
		// 쓰레드 객체를 만들어야 함
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("main end !!!");
		

	}

}
