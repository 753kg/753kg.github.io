package javaBeginner;

public class BizException extends RuntimeException {
	// 자바입문 파트9 사용자 정의 Exception
	// 관련 파일 : BizService, BizExam
	
	// 만드는 이유
	// 클래스 이름만으로 어떤 오류가 발생했는지 직관적으로 알 수 있다.
	
	// RuntimeException을 상속받으면 unCheckedException
	// 예외처리를 하지 않아도 컴파일 시에 오류를 발생시키지 않는다.
	
	// Exception 클래스를 상속 받으면 CheckedException
	// 반드시 오류를 처리해야 함. 예외처리를 하지 않으면 컴파일 오류 발생.
	
	// 생성자 정의
	// 문자열로 된 오류 메시지
	// 실제 발생할 Exception
	public BizException(String msg) {
		super(msg);		// 부모 생성자 호출
	}
	
	public BizException(Exception ex) {
		super(ex);
	}

}
