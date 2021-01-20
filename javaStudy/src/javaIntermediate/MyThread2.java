package javaIntermediate;

public class MyThread2 implements Runnable {
	// 자바중급 파트7 쓰레드 만들기
	// 관련파일 : ThreadExam2
	// 2. Runnable 인터페이스를 이용하는 방법
	// 자바는 단일상속만 지원하기 때문에
	// 다른 클래스를 상속받고 있었을 경우에 쓰레드 클래스를 또 상속받을 수 없음.
	// 인터페이스는 여러개 구현해서 사용할 수 있음.
	
	String str;
	
	public MyThread2(String str) {
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
