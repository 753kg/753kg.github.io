
public class SwitchExam {

	public static void main(String[] args) {
		// 자바입문 파트3 switch문
		// switch, case, default, break
		// break 없으면 만난 케이스부터 나머지 다 수행
		
		int value = 2;
		
		switch(value) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("그 외 다른 숫자");
		}
		
		String str = "A";
		
		switch(str) {
			case "A" :
				System.out.println("A");
				break;
			case "B" :
				System.out.println("B");
				break;
		}
	}

}
