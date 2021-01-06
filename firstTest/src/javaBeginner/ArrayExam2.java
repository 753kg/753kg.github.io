package javaBeginner;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 자바입문 파트4 2차원 배열
		
		int[][] array4 = new int[3][4];	//행3, 열4
		array4[0][1] = 10;
		
		// 각각 길이가 다른 배열 만들 수 있음.
		int[][] array5 = new int[3][];
		array5[0] = new int[1];
		array5[1] = new int[2];
		array5[0][0] = 10;
		
		int[][] array6 = {{1},{1,2},{1,2,3}};
		System.out.println(array6[0][0]);
		System.out.println(array6[2][2]);
		

	}

}
