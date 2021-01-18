package javaIntermediate;

public class WrapperExam {

	public static void main(String[] args) {
		// 자바중급 파트2 java.lang 패키지/오토박싱
		// Integer는 class이기 때문에 필드(속성)와 메소드를 가진다.
		// 기본형 타입은 필드와 메서드를 가질 수 없다.
		
		int i = 5;						// 기본형타입, 객체 X = 참조형이 아니다.
		Integer i2 = new Integer(5);	// int를 객체로 바꿔주는 wrapper class 중 하나인 Integer 클래스
		
		Integer i3 = 5;					// 오토박싱 : 기본타입데이터를 객체타입데이터로 자동 형변환 시켜주는 기능
		
		int i4 = i3.intValue();			// 객체를 int 타입으로 변환
		
		int i5 = i3;					// 오토언박싱 : 객체 타입 데이터를 기본형 타입 데이터로 자동 형변환

	}

}
