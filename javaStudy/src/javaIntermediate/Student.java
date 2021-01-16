package javaIntermediate;

public class Student {
	// 자바중급 파트1 Object와 오버라이딩
	
	// Object 클래스는 모든 클래스의 최상위 클래스
	// 아무것도 상속받지 않으면 자동으로 Object를 상속
	// Object가 가지고 있는 메소드는 모든 클래스에서 다 사용할 수 있다는 것을 의미
	// equals, toString, hashCode 등등..
	// equals와 hashCode는 사용자가 알맞게 오버라이딩 해서 사용해야한다.
	
	// 필드 선언
	String name;
	String number;
	int birthYear;
	
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.number = "1234";
		s1.birthYear = 1995;
		
		Student s2 = new Student();
		s2.name = "홍길동";
		s2.number = "1234";
		s2.birthYear = 1995;
		
		if(s1.equals(s2))
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");		
		// 결과
		// 오버라이딩 전 : 다르다
		// 오버라이딩 후 : 같다
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());		
		// 오버라이딩 전 : 해시코드가 서로 다름
		// 오버라이딩 후 : 같음
		
		System.out.println(s1);
		System.out.println(s1.toString());
		// 오버라이딩 전 : 의미없는값이 출력됨
		// 오버라이딩 후 : 보여주고싶은 속성 값들 출력
		// 출력할 때 s1 = s1.toString()
	}

	
	// 오버라이딩 하는 법
	// Source > Generate hashCode() and equals() > 비교할 기준 선택
	// hashCode는 알고리즘 따로 공부하기
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	// Source > Generate toString() > 보여주고싶은 속성 선택
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}

}
