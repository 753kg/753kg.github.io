package javaBeginner;

public class forEachExam {

	public static void main(String[] args) {
		// 자바입문 파트4 for each
		
		int[] iarray = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < iarray.length; i++) {
			int value = iarray[i];
			System.out.println(value);
		}
		
		//for(타입 값을받을변수명:출력하고싶은자료구조)
		for(int value:iarray) {
			System.out.println(value);
		}

	}

}
