package openTutorials;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		// 생활코딩 JAVA Exception - try-with-resource
		// try(close해야하는것){실행할것}catch(Exception e){실행할것}
		
		try(FileWriter f = new FileWriter("src/openTutorials/data_E.txt")) {
			f.write("Hello");
			//f.close();	//자동으로 해줘서 안써도 됨.
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
