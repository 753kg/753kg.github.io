
public class VariableScopeExam {
	// 자바입문 파트5 변수의 scope와 static
	// 변수의 사용 범위 : 변수가 선언된 블록
	
	int globalScope = 10;	//클래스 전체가 사용 범위
	
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(value2);
	}

	public static void main(String[] args) {
		//클래스는 인스턴스화 하지 않은 채로 사용할 수 없다.
		//static: 클래스를 인스턴스화 하지 않아도 사용할 수 있다.
		//static한 필드 내에서 static하지 않은 필드는 사용할 수 X
		
//		System.out.println(globalScope);	
//		System.out.println(localScope);
//		System.out.println(value);
		
		System.out.println(staticVal);	//static한 변수는 사용 가능
		
		//static하지 않은 것은 객체를 만들어 사용
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		
		// 인스턴스를 만들 때 공간이 생겨남 = 인스턴스 변수
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		// static한 필드는 값을 저장할 수 있는 공간이 1개, 값을 공유 = 클래스 변수
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		System.out.println(VariableScopeExam.staticVal);
		//이런 경우엔 클래스이름을 직접 사용하는 것이 좀 더 바람직하다.

	}

}
