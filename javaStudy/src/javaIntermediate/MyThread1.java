package javaIntermediate;

public class MyThread1 extends Thread {
	// 자바중급 파트7 쓰레드 만들기
	// 관련파일 : ThreadExam
	// 1. Thread 클래스 상속받는 방법
	//	Thread 클래스를 상속받음
	//	Source -> Override/Implements Methods -> run 메소드 오버라이딩
	// 	쓰레드 안에서 하고싶은 일 구현하기
	
	String str;
	public MyThread1(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
