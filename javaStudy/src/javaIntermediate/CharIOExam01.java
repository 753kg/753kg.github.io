package javaIntermediate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam01 {

	public static void main(String[] args) {
		// 자바중급 파트5 자바IO - Char 단위 입출력 (Console)
		
		// 키보드로부터 한줄씩 입력받기.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 콘솔에 출력하기.
		String line = null;
		
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(line);
		
		
	}

}
