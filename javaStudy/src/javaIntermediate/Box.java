package javaIntermediate;

public class Box<E> {
	// 자바중급 파트3 Generic
	// 관련파일 : BoxExam
	
	// object 타입이 뭐지
//	private Object obj;
	
//	public void setObj(Object obj) {
//		this.obj = obj;
//	}
	
//	public Object getObj() {
//	return obj;
//}
	
	// 제너릭으로 바꿈
	// 가상 클래스 E를 사용한다는 의미.
	// 가상의 타입으로 선언 후, 사용 시 구체적 타입으로 선언.
	// 다양한 타입의 클래스를 이용하는 클래스를 만들 수 있다.
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	
	public E getObj() {
		return obj;
	}


}
