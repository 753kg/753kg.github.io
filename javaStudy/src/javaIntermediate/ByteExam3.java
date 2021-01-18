package javaIntermediate;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {

	public static void main(String[] args) {
		// 자바중급 파트5 자바IO - 다양한 타입의 출력
		
		// try-with-resources: 사용한 자원을 자동으로 종료
		try(
				// IO 객체 선언
				// Data Output Steam
				// 장식 역할 : 다양한 메서드를 제공한다.
				DataOutputStream out = new DataOutputStream(new FileOutputStream("src/javaIntermediate/data.txt"));
				) {
			// 사용할 코드
			out.writeInt(100); 		//정수값으로 저장
			out.writeBoolean(true);	//불린으로 저장
			out.writeDouble(50.5);	//더블타입으로 저장
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
