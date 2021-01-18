package javaIntermediate;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		// 자바중급 파트4 Calendar 클래스
		// 지역화를 고려한 클래스
		
		// Calendar는 추상 클래스 -> 인스턴스 생성 못함
		// Calendar가 갖고 있는 필드 이용
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);	// 0~11월로 표현돼서 +1 해줘야 함.
		System.out.println(cal.get(Calendar.DATE));
	
		System.out.println(cal.get(Calendar.HOUR));			//12시까지 표현
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));	//24시 표현
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5); 		// 5시간 후
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);	
		System.out.println(cal.get(Calendar.DATE));
	
		System.out.println(cal.get(Calendar.HOUR));			
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));	
		System.out.println(cal.get(Calendar.MINUTE));
	}

}
