
public class ArrayExam {

	public static void main(String[] args) {
		// 자바입문 파트4 배열 만들기
		// 배열은 참조형 타입
		
		int[] array1 = new int[100];
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[]{1,2,3,4};
		
		int[] array3 = {1, 2, 3, 4};
		System.out.println(array3[3]);
		
		int value = array3[0];
		System.out.println(value);
		

	}

}
