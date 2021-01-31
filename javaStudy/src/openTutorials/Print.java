package openTutorials;

class Print {
	// 관련파일 : MyOOP
	// 연관있는 변수와 메서드 -> 클래스로
	// 클래스의 멤버 : delimiter, A, B
	
	// static : 클래스 소속
	// 인스턴스 소속이려면 static을 지움
	public String delimiter = "";
	
	public Print(String delimiter) {
		this.delimiter = delimiter;		//this : 인스턴스의 delimiter 변수를 가리킴
	}
	
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
		
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}