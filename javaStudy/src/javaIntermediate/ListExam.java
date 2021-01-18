package javaIntermediate;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		// 자바 중급 파트3 List 인터페이스
		// javaUtil 패키지
		// List : 중복O, 순서O 자료구조
		
		List<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size());
		
		// List는 인덱스가 있으므로 for 사용
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}

	}

}
