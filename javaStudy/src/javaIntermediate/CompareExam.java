package javaIntermediate;

public class CompareExam {
	
	// Compare 인터페이스를 받아들여서 해당 인터페이스를 이용하는 메서드
	public static void exec(Compare compare) {
		int k = 10;
		int m = 20;
		int value = compare.compareTo(k, m);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		// 자바중급 파트8 람다식 기본문법
		// 관련파일 : Compare
		
		exec((i, j)->{
			return i - j;
		});

	}

}
