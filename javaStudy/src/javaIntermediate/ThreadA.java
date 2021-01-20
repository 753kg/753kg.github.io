package javaIntermediate;

public class ThreadA {
	
	public static void main(String[] args) {
		// 자바중급 파트7 쓰레드와 상태제어(wait, notify)
		// 관련파일 : ThreadB
		// b.wait() 호출 -> main 쓰레드 기다림
		// b가 5번 값을 더한 후에 notify를 호출하면 그때 main 깨어남
		
		ThreadB b = new ThreadB();
		b.start();
		
		// b 쓰레드가 모니터링 락을 잡으면
		synchronized (b) {
			try {
				System.out.println("b가 완료될때까지 기다립니다.");
				b.wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is : " + b.total);
			
		}
	}

}
