package openTutorials;

import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {
		// 생활코딩 JAVA - Method
		// 메소드의 기본 형식, 메소드의 입력값, 메소드의 출력
		// 메소드 : 연관된 명령을 그룹핑해서 이름을 붙인 것
		// main : 메소드
		
					// 인자(argument) : 메소드에 주입하는 값
		printTwoTimes("a", "-");
		System.out.println(twoTimes("a", "-"));
		//..
		writeFileTwoTimes("a", "*");
		FileWriter fw = new FileWriter("src/openTutorials/out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
		//..
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
		
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	
									// 매개변수(parameter) : 메소드 안으로 인자를 전달하는, 매개하는 역할
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
		FileWriter fw = new FileWriter("src/openTutorials/output.txt");
		fw.write(delimiter + "\n");
		fw.write(text + "\n");
		fw.write(text + "\n");
		fw.close();
	}

}
