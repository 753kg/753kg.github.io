package openTutorials;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		// 생활코딩 JAVA Exception - Checked vs Unchecked Exception
		// checked exception -> 꼭 예외처리를 해야 함.
		// Unchecked -> 예외처리를 하지 않아도 컴파일이 됨.
		// checked exception : RuntimeException과 이 클래스의 자식 클래스들
		// unchecked exception : RuntimeException 제외 모든 것. ex)IOException
		
		FileWriter f = null;	// null : 값이 없다
		
		try {
			f = new FileWriter("src/openTutorials/data_E.txt");
			f.write("Hello");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// close를 하기 전에 예외가 발생할 수 있기 때문에 finally로 처리
			// try 안에서  예외가 발생 했건 안했건 무조건 실행
			if(f != null) {
				try {
					f.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
