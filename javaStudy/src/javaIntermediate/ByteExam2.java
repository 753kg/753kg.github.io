package javaIntermediate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

	public static void main(String[] args) {
		// 자바중급 파트5 자바IO - Byte 단위 입출력 심화
		// 512Byte씩 읽어서 512Byte씩 씀.
		// 속도 향상
		// 파일을 읽어올 땐 512Byte의 배수로 배열을 잡는 게 좋다.
		
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = null;	// 파일로부터 읽어오기 위한 객체
		FileOutputStream fos = null;	// 파일에 쓸 수 있게 하는 객체
		
		try {
			fis = new FileInputStream("src/javaIntermediate/ByteExam1.java");
			fos = new FileOutputStream("src/javaIntermediate/byte.txt");
			
			int readCount = -1;	// 초기화, 선언할 때 의미없는 값 넣어줌.
			byte[] buffer = new byte[512];
			while((readCount = fis.read(buffer)) != -1) {
				// fis.read(buffer) 
				// : 읽은 값을 buffer에 저장하고 최대 512byte까지
				//   읽은 값의 크기를 readCount에 리턴
				fos.write(buffer, 0, readCount);
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
