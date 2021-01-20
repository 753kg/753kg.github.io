package javaIntermediate;

public class LambdaExam {

	public static void main(String[] args) {
		// 자바중급 파트8 람다식
		// 메서드를 하나만 가지고 있는 인터페이스 = 함수형 인터페이스
		
		// run 메서드를 가진 Runnable을 객체로 만들어서 전달
		// 자바는 메서드만 전달할 수 있는 방법이 없다.
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("hello");
				}
				
			}
		}).start();
		
		// 이 문제를 해결하는 것이 람다 표현식.
		// 객체를 직접 생성할 필요 X
		// 람다식 = 익명메서드
		new Thread(()-> {
			// 메서드 정의할 필요 없이 구현할 부분만
			for(int i = 0; i < 10; i++) {
				System.out.println("hello");
			}
		}).start();
	}

}
