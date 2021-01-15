package javaBeginner;

//자바입문 파트8 내부클래스
//관련 파일 InnerExam1~3, Action

//내부 클래스 : 클래스 안에 선언된 클래스
//선언된 위치에 따라 4가지 형태가 있다.

public class InnerExam3 {
	
	//3.지역 중첩 클래스 or 지역 클래스
	//내부 클래스가 메서드 안에서 선언되는 경우
	//Cal 객체 생성은 메서드 안에서만 가능 
	//메서드 안에서도 클래스를 지역변수처럼 사용할 수 있다.
	public void exec() {
		
		class Cal{
			int value = 0;
			
			public void plus() {
				value++;
			}
		}
		
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}

	public static void main(String[] args) {
		InnerExam3 t = new InnerExam3();
		t.exec();

	}

}
