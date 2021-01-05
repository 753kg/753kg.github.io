
public class OperatorExam {

	public static void main(String[] args) {
		// 자바 입문 파트2 산술연산자
		
		int i1 = -5;	//부호 연산자
		int i2 = +i1;	//변수 앞 +는 부호 그대로, -는 반대로 바꿈.
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3;	//먼저 i3 = i3 + 1; 하고 i4에 넣음.
		System.out.println(i4);
		System.out.println(i3);
		
		int i5 = i3++;	//먼저 i5에 넣고 i3 = i3 + 1;
		System.out.println(i5);
		System.out.println(i3);
		
		int i = 5;
		int j = 2;
		
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);	//int라서 몫만 얻음.
		System.out.println(i /(double)j);	//하나라도 실수면 실수값 얻음.
		System.out.println(i % j);	//나머지

	}

}
