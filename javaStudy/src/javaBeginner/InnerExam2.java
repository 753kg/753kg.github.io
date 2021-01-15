package javaBeginner;

//자바입문 파트8 내부클래스
//관련 파일 InnerExam1~3, Action

//내부 클래스 : 클래스 안에 선언된 클래스
//선언된 위치에 따라 4가지 형태가 있다.

public class InnerExam2 {
	
	//2. 정적 중첩 클래스 or 스태틱 클래스
	//정적인(static)한 필드에 선언되는 경우
	static class Cal{
		int value = 0;
		
		public void plus() {
			value++;
		}
	}

	public static void main(String[] args) {

		// static한 필드는 InnerExam 객체 생성할 필요 없다.
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}

}
