package com.kosta.day10;

import java.util.Arrays;

public class LAB {

	public static void main(String[] args) {
		String s = "everyday we have is one more than we deserve";
		System.out.println(s);
		char[] cc = new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == ' ') continue;
			
			char c2 = (char)(s.charAt(i) + 3);
			if(c2 > 'z') c2 -= ('z'+1)-'a';
			cc[i] = c2;
		}
		s = String.valueOf(cc);
		System.out.println(s);
		
	
	}

}
