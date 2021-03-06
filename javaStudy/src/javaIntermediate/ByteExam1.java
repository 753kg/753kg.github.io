package javaIntermediate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {

	public static void main(String[] args) {
		// 자바중급 파트5 자바IO - Byte 단위 입출력
		// 1Byte씩 읽어서 1Byte씩 씀.
		
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = null;	// 파일로부터 읽어오기 위한 객체
		FileOutputStream fos = null;	// 파일에 쓸 수 있게 하는 객체
		
		try {
			fis = new FileInputStream("src/javaIntermediate/ByteExam1.java");
			fos = new FileOutputStream("src/javaIntermediate/byte.txt");
			
			int readData = -1;	// 초기화, 선언할 때 의미없는 값 넣어줌.
			while((readData = fis.read()) != -1) {
				// read() 함수는 끝을 나타내기 위해 -1을 리턴함.
				fos.write(readData);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}

}
