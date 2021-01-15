package javaBeginner;

// 자바입문 파트8 내부클래스
//관련 파일 InnerExam1~3, Action

// 내부 클래스 : 클래스 안에 선언된 클래스
// 선언된 위치에 따라 4가지 형태가 있다.

public class InnerExam1 {
	
	// 1. 중첩 클래스 or 인스턴스 클래스
	// 필드를 선언하는 위치에 선언되는 경우 
	class Cal{
		int value = 0;
		
		public void plus() {
			value++;
		}
	}

	public static void main(String[] args) {
		
		// Cal 객체 사용 방법	
		InnerExam1 t = new InnerExam1();
		InnerExam1.Cal cal = t.new Cal();
		cal.plus();
		System.out.println(cal.value);

	}

}
