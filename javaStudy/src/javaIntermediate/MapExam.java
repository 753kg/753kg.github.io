package javaIntermediate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		// 자바 중급 파트3 Map 인터페이스
		// javaUtil 패키지
		// Map : key와 value를 쌍으로 저장하는 자료구조 
		// Key 중복 X, Value 중복 O
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		
		map.put("001", "kang");
		
		System.out.println(map.size());
		
		System.out.println(map.get("001"));	// 키가 같으면 마지막으로 들어온 값이 저장됨.
		System.out.println(map.get("002"));
		
		Set<String> keys = map.keySet();	// 키만 꺼내서 Set 자료구조에 넣어줌.
		
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + " " + value);
		}
		
	}

}
