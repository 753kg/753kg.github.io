
public class EnumExam {

	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	
	public static void main(String[] args) {
		// 자바입문 파트5 열거형(enum)
		// static한 필드 사용 시 클래스명.변수명
		// 열거형 사용하는 이유
		// 변수 gender에 MALE 혹은 FEMALE 딱 둘 중에 서만 가질 수 있게
		// boy라는 문자 혹은 다른 문자는 가질 수 없게 하고싶다.
		
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
		
		//enum 이름 자체가 타입이 됨.
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		//gender2 = "boy";	//MALE, FEMALE만 가능
		

	}

}

enum Gender{
	MALE, FEMALE;
}
