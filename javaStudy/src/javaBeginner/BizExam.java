package javaBeginner;

public class BizExam {

	public static void main(String[] args) {
		// 자바입문 파트9 사용자 정의 Exception
		// 관련 파일 : BizService, BizException
		
		BizService biz = new BizService();
		biz.bizMethod(5);
		try {
			biz.bizMethod(-3);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
