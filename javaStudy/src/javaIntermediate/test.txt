package javaIntermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharIOExam02 {

	public static void main(String[] args) {
		// 자바중급 파트5 자바IO - Char 단위 입출력 (File)
		// 파일로부터 한줄씩 입력받아서 다시 파일에 출력.
		
		// 파일로 읽기 -> FileReader 필요
		// 한줄씩 읽기 -> BufferedReader 필요
		
		// 편리하게 출력 -> PrinterWriter 필요
		// 파일에 쓰기 -> FileWriter
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			br = new BufferedReader(new FileReader("src/javaIntermediate/CharIOExam02.java"));
			pw = new PrintWriter(new FileWriter("src/javaIntermediate/test.txt"));
			
			String line = null;
			while((line = br.readLine()) != null) {
				//파일이 끝나면 null 리턴
				pw.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// IO는 열었으면 꼭 닫아야 함.
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
