package javaIntermediate;

public class MathExam {

	public static void main(String[] args) {
		// 자바중급 파트2 Math Class
		// static 메서드 사용 : 클래스이름.메서드명
		
		int value1 = Math.max(5, 30);	//둘 중 큰 값
		System.out.println(value1);
		
		int value2 = Math.min(5, 30);
		System.out.println(value2);
		
		System.out.println(Math.abs(-10));	//절대값
		
		System.out.println(Math.random());	//랜덤한 값, 0이상 1.0미만의 실수값(double type)
		
		System.out.println(Math.sqrt(25));	//제곱근

	}

}
