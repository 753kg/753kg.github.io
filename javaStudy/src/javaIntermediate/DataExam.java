package javaIntermediate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataExam {

	public static void main(String[] args) {
		// 자바중급 파트4 Date 클래스
		
		Date date = new Date();
		System.out.println(date.toString());
		
		// 월은 대문자로 해야함
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(ft.format(date));
		
		System.out.println(date.getTime());	// 현재시간 long 값으로 구함????
		
		long today = System.currentTimeMillis();	// 현재시간 long 값으로 구함
		System.out.println(today);
		
		System.out.println(today - date.getTime());	//현재시간 - date 인스턴스가 생성된 시간 : 걸린 시간

	}

}
