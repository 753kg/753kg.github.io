
public class StringMethodExam {

	public static void main(String[] args) {
		// 자바입문 파트5 String 클래스의 메소드
		
		//String str = new String("hello");
		String str = "hello";
		System.out.println(str.length());	//문자열 길이
		
		System.out.println(str.concat(" world")); //문자열 결합, hello world라는 객체를 새로 생성
		System.out.println(str);	//String은 불변클래스
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
		
		
		// 궁금한거
		String str2 = "hello world";
		System.out.println(str);
		if(str == str2)
			System.out.println("str과 str2는 같은 레퍼런스.");

	}

}
