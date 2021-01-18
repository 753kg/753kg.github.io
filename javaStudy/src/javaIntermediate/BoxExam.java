package javaIntermediate;

public class BoxExam {

	public static void main(String[] args) {
		// 자바중급 파트3 Generic
		// 관련파일 : Box
		
//		Box box = new Box();
//		box.setObj(new Object());	// 박스에 오브젝트 객체를 넣어줌.
//		Object obj = box.getObj();
//		System.out.println(obj);
		
		// 오브젝트타입의 자식클래스들 모두 들어갈 수 있음
		// String, int ... 등등 모두 가능
		// 꺼낼 때는 형변환 작업을 해야함.
//		box.setObj("hello");
//		String str = (String)box.getObj();	// 큰 -> 작 이므로 형변환
//		System.out.println(str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj();
		
		// 제너릭
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();		// 스트링 값만 받음.
		box2.setObj("hello");
		box2.getObj();						// 형변환 할 필요 X
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		box3.getObj();
		

	}

}
