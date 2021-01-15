package javaBeginner;

public class BizService {
	// 자바입문 파트9 사용자 정의 Exception
	// 관련 파일 : BizException, BizExam
	
	public void bizMethod(int i) throws BizException{
		System.out.println("비즈니스 메서드 시작");
		
		if(i < 0) {
			throw new BizException("매개변수 i는 0 이상이어야 합니다.");
		}
		
		System.out.println("비즈니스 메서드 종료");
	}

}
