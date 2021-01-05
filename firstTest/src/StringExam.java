
public class StringExam {

	public static void main(String[] args) {
		// 자바입문 파트5 String 클래스
		// String 클래스는 new 연산자를 이용하지 않고 인스턴스를 만들 수 있다.
		
		// new 연산자를 이용하지 않고 인스턴스를 만드는 경우
		// "hello"라는 문자열은 상수가 저장되는 메모리 영역에 저장됨.
		// 따라서 str2의 "hello" 문자열 상수는 이미 만들어져 있으므로
		// str1이 참조하는 인스턴스를 str2도 참조한다.
		String str1 = "hello";
		String str2 = "hello";
		
		// new 연산자를 이용하여 인스턴스 만든 경우
		// new가 나오는 순간 인스턴스는 무조건 새롭게 만들어진다.
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		//기본형은 값이 같은지 비교
		//참조형은 실제 가리키고 있는 주소가 같은지 비교
		//문자열이 같은지 비교하고 싶을 땐 str1.equals(str2)
		if(str1 == str2)
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		if(str1 == str3)
			System.out.println("str1과 str3는 같은 레퍼런스입니다.");
		if(str3 == str4)
			System.out.println("str3과 str4는 같은 레퍼런스입니다.");
		
		// String은 한 번 만들어지면 내부 값이 변하지 않는다.
		System.out.println(str1);
		System.out.println(str1.substring(3));	//3번째자리부터 자름
		System.out.println(str1);
		

	}

}
