package javaIntermediate;

public class MusicBox {
	// 자바중급 파트7 쓰레드와 공유객체, 동기화 메소드와 동기화 불록
	// 관련 파일 : MusicPlayer, MusicBoxExam
	// 하나의 객체를 여러개의 쓰레드가 사용한다.
	// Thread 클래스는 java.lang 패키지라서 import 안해도 됨.
	
	// 1초 이하의 시간동안 10번 반복하면서 어떤 음악을 출력하는 메소드.
	// synchronized : 공유객체가 가진 메소드를 동시에 호출 되지 않도록 하는 방법
	public synchronized void playMusicA() {
		for(int i = 0; i < 10; i++) {
			System.out.println("신나는 음악!!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i = 0; i < 10; i++) {
			System.out.println("슬픈 음악!!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// synchronized를 붙히지 않은 메소드는 
	// 다른 쓰레드들이 synchronized메소드를 실행하면서 모니터링 락을 획득했다 하더라도, 
	// 그것과 상관없이 실행된다.
	public void playMusicC() {
		for(int i = 0; i < 10; i++) {
			// 동기화 블럭
			// : 문제가 있을 것 같은 부분만 synchronized 사용
			// 메소드 전체에 synchronized를 사용할 때
			// 마지막에 대기하는 쓰레드가 너무 오래 기다리는 걸 막기 위해 사용
			synchronized (this) {
				System.out.println("카페 음악!!");				
			}
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
