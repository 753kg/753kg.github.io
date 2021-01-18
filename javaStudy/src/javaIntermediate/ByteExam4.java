package javaIntermediate;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam4 {

	public static void main(String[] args) {
		// 자바중급 파트5 자바IO - 다양한 타입의 입력
		// ByteExam3에서 저장한 파일을 읽어서 화면에 출력하기.
		
		try(
				// IO 선언
				// 다양한 데이터 타입을 읽을수 있는 객체
				DataInputStream in = new DataInputStream(new FileInputStream("src/javaIntermediate/data.txt"));
				) {
			// 저장된 순서대로 읽어야 함
			int i = in.readInt();
			boolean b = in.readBoolean();
			double d = in.readDouble();
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
