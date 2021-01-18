package javaIntermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		// 자바중급 파트4 java.time 패키지
		// java.util.Date : 직관적이지 못하다
		
		LocalDateTime timePoint = LocalDateTime.now();	// 현재 시간, 날짜
		System.out.println(timePoint);
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);	// 원하는 날짜
		System.out.println(ld1);
		
		LocalTime lt1 = LocalTime.of(17, 18);	// 17시 18분에 대한 LocalTime 객체를 구함.
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("10:15:30");	// 입력한 문자열에 대한 LocalTime 객체를 구함.
		System.out.println(lt2);
		
		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate);
		
		System.out.println(timePoint.getMonth());
		
		Month month = timePoint.getMonth();
		System.out.println(month.getValue());
		
		System.out.println(timePoint.getHour());
		
	}

}
