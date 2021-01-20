package javaIntermediate;

public class ThreadB extends Thread {
	// 자바중급 파트7 쓰레드와 상태제어(wait, notify)
	// 관련파일 : ThreadA
	// wait과 notify는 동기화된 블록 안에서 사용해야 한다.
	// wait을 만나면 해당 쓰레드는 모니터링 락 권한을 놓고 대기한다.
	// notify를 만나면 쓰레드를 깨움.
	
	int total;
	
	@Override
	public void run() {
		// 자신(ThreadB) 쓰레드가 모니터링 락을 잡으면
		synchronized (this) {
			for(int i = 0; i < 5; i++) {
				System.out.println(i + "를 더합니다.");
				total += i;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			notify();
		}
	}
	
	
	
}
