package javaIntermediate;

public class StringBufferExam {

	public static void main(String[] args) {
		// 자바중급 파트2 스트링버퍼 
		// 스트링 : 자기 자신이 변하지 않는 클래스
		// 스트링버퍼 : 자기 자신이 변하는 클래스
		// 메소드체이닝 : 자기 자신의 메서드를 호출하여 자기 자신의 값을 바꿔나가는 것
		// 스트링버퍼클래스는 메서드체인방식으로 사용할 수 있도록 만들어짐.
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");	//StringBuffer의 append는 this(자기자신) 반환
		if(sb2 == sb3)
			System.out.println("sb2 == sb3");
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
		
	}

}
