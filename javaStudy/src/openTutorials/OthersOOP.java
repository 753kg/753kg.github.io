package openTutorials;

import java.io.FileWriter;

import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		// 생활코딩 JAVA 객체 지향 프로그래밍
		// 남의 클래스 & 남의 인스턴스 
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		// 일회용으로 작업하는 것들은 클래스를 사용
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));	//소수점 내림
		System.out.println(Math.ceil(1.8));		//소수점 올림
		
		// FileWriter : 어떤 정보를 파일에 기록할 때 쓰는 클래스
		// 긴 맥락의 작업은 클래스를 직접 사용하는 것이 아니라 복제해서 사용
		FileWriter f1 = new FileWriter("src/openTutorials/data.txt");		// new로 인해서 클래스가 복제됨. 그 복제본(=인스턴스)을 f1에 담음
		f1.write("Hello");
		f1.write(" Java");
		
		FileWriter f2 = new FileWriter("src/openTutorials/data2.txt");
		f2.write("Hello");
		f2.write(" Java 2");
		f2.close();
		
		f1.write("!!!");
		f1.close();

	}

}
