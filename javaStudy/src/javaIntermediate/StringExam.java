package javaIntermediate;

public class StringExam {

	public static void main(String[] args) {
		// 자바중급 파트2 스트링 클래스의 문제점
		// 스트링 클래스 : 불변 클래스
		
		String str1 = "hello world";
		String str2 = str1.substring(5);	//5번째부터 자름
		System.out.println(str1);
		System.out.println(str2);
		
		// 문제
		String str3 = str1 + str2;
		System.out.println(str3);
		
		// str3이 만들어지는 과정
		// 문자열과 문자열을 더하는 코드 = 스트링버퍼객체를 만들고 append, toString으로 리턴
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
		
		// 반복문 안에서 사용하게 되면?
		// 100번동안 스트링버퍼객체를 만들어냄, 프로그램 속도 느려짐. 반드시 피하기.
		String str5 ="";
		for(int i = 0; i < 100; i++) {
			str5 = str5 + "*";
		}
		System.out.println(str5);
		
		// 위 처럼 사용하는 것 보다 스트링버퍼를 적절하게 이용하기
		// 훨씬 효율적인 코드이다.
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100; i++) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);

	}

}
