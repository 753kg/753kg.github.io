
public class OperatorExam4 {

	public static void main(String[] args) {
		// 자바입문 파트3 논리연산자
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		
		int score = 68;
		if(score <= 100 && score >= 70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		System.out.println(b1 ^ b3);	//배타적논리합, 두개가 다를 때 true
		System.out.println(b1 ^ b2);
		System.out.println(!b1);		//not

	}

}
