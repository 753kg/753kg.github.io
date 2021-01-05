
public class TypeCastingExam {

	public static void main(String[] args) {
		// 자바 입문 파트2 기본형 타입변환
		// int < long
		// 큰 타입을 작은 타입으로 변환 시 강제 형변환 해야 함
		
		int x = 50000;
		long y = x;			//묵시적 형변환
		
		long x2 = 5;
		int y2 =(int) x2;	//강제 형변환
		
		

	}

}
