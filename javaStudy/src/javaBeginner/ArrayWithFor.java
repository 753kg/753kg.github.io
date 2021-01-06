package javaBeginner;

public class ArrayWithFor {

	public static void main(String[] args) {
		// 자바입문 파트4 배열 사용하기
		// array.length : 배열의 크기
		
		int[] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		System.out.println(iarray.length);
		
		//i를 배열의 인덱스로 사용
		//i라는 변수는 for문이 시작할 때 생셩됐다가 블럭이 끝날 때 사라짐
		for(int i = 0; i < iarray.length; i++) {
			iarray[i] = i + 1;
		}
		
		int sum = 0;
		for(int i = 0; i < iarray.length; i++) {
			sum = sum + iarray[i];
		}
		
		System.out.println(sum);

	}

}
