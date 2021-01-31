package openTutorials;

class Foo {
	
	public static String classVar = "I class var";		//클래스 소속
	public String instanceVar = "I instance var";			//인스턴스 소속
	
	public static void classMethod() {
		System.out.println(classVar);		// 접근 가능
		//System.out.println(instanceVar);	// 인스턴스 변수에 접근 불가
	}
	
	public void instanceMethod() {
		System.out.println(classVar);		// 접근 가능
		System.out.println(instanceVar);	// 접근 가능
	}

}

public class StaticApp {

	public static void main(String[] args) {
		// 생활코딩 JAVA 객체 지향 프로그래밍
		// static
		
		System.out.println(Foo.classVar);		// 클래스를 통해서 클래스 변수에 접근 가능
		//System.out.println(Foo.instanceVar);	// Error 인스턴스를 통해서 접근해야 함

		Foo.classMethod();
		//Foo.instanceMethod(); 	// 접근 불가. 클래스를 통해서는 접근 불가능한다.
		
		// 클래스변수는 참조, 인스턴스변수는 복제되어 독립적으로 사용
		// 클래스메소드도 참조, 인스턴스메소드는 복제되어 독립적으로 사용
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);		// I class var
		System.out.println(f1.instanceVar);		// I instance var
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar);		// changed by f1
		System.out.println(f1.classVar);		// changed by f1
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar);		// changed by f1
		System.out.println(f2.instanceVar);		// I instance var
	}

}
