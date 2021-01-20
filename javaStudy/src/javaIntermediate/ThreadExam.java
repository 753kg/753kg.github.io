package javaIntermediate;

public class ThreadExam {

	public static void main(String[] args) {
		// 자바중급 파트7 쓰레드 만들기
		// 관련파일 : MyThread1
		// 쓰레드 : 수행 흐름을 여러 개 만들어서 수행할 수 있음.
		
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		// Thread 동작 시엔 start() 호출
		t1.start();		// main 수행 흐름과 쓰레드 수행 흐름 두 개가 생김
		t2.start();		// 수행흐름이 3개가 됨.
		
		System.out.println("main end !!!");

	}

}
