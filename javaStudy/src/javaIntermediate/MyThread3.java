package javaIntermediate;

public class MyThread3 extends Thread {
	// 자바중급 파트7 쓰레드와 상태제어(join)
	// 관련파일 : JoinExam
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("MyThread5 : " + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
