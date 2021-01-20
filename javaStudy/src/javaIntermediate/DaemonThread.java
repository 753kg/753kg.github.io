package javaIntermediate;

public class DaemonThread implements Runnable {
	// 자바중급 파트7 데몬쓰레드
	// 데몬쓰레드 : 자바에서 백그라운드로 동작하는 쓰레드.
	// 자바프로그램을 만들 때 백그라운드에서 특별한 작업을 처리하는 용도로 만듦
	// 일반 쓰레드(main 등)이 모두 종료되면 강제적으로 종료됨.
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("데몬 쓰레드가 실행 중입니다.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;	// 실행 중에 Exception 발생하면 while을 빠져나가도록
			}
		}

	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true);		// 데몬쓰레드로 설정
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드가 종료됩니다.");
	}

}
