package javaIntermediate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		// 자바 중급 파트3 Set 인터페이스
		// javaUtil 패키지
		// Set : 중복X, 순서X 자료구조
		
		Set<String> set1 = new HashSet<String>();
		// 제너릭 -> String만 이용
		//인터페이스는 객체생성 불가하므로 set을 구현한 클래스인 hashset 이용해서 인스턴스 생성.
		boolean flag1 = set1.add("kang");	// 중복값이면 false 반환, 아니면 true
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang");
		
		System.out.println(set1.size());	// 자료구조 크기
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		
		Iterator<String> iter = set1.iterator();
		// Set은 인덱스가 없어서 while 사용
		while(iter.hasNext()) {
			String str = iter.next();	// 값을 꺼내고 자동으로 다음 것을 참조.
			System.out.println(str);
		}
		

	}

}
