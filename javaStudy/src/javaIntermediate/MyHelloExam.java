package javaIntermediate;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
		// 자바중급 파트6 어노테이션
		// 관련 파일 : MyHello, Count100
		
		MyHello hello = new MyHello();
		
		// 메서드에 대한 정보를 얻어내는 코드
		// getClass() : 클래스 정보를 얻음
		// getDeclaredMethod : hello라는 이름의 메서드에 대한 정보를 구함.
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
			if(method.isAnnotationPresent(Count100.class)) {
				// 특정 어노테이션이 메서드에 적용되어있는지 알아냄
				// Count100 어노테이션이 적용되어있으면 해당 메서드를 100번 출력하게 해보겠다.
				for(int i = 0; i < 100; i++) {
					hello.hello();
				}
			} else {
				// 적용이 안돼있으면 한번만 출력하도록
				hello.hello();
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
