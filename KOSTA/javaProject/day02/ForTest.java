package com.kosta.day02;

public class ForTest {

	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
	}
	
	// 4���϶� �ߴ�. ��
	// ���ʿ� �ִ� for���� �ٱ��� for�� �ߴܽ�ų��
	public static void test3() {
		outerFor:for(int dan=2; dan<=9; dan++) {
			
			for(int gop=1; gop<=9; gop++) {
				if(dan == 4) {
					break outerFor;
				}
				System.out.println(dan + "*" + gop + "=" + dan*gop + "\t");
			}
		}
	}
	
	// 4�ܸ� ����
	public static void test2() {
		for(int dan=2; dan<=9; dan++) {
			for(int gop=1; gop<=9; gop++) {
				if(dan == 4) {
					break;
				}
				System.out.println(dan + "*" + gop + "=" + dan*gop + "\t");
			}
		}
	}
	
	// 4���϶� �ߴ�
	public static void test1() {
		// ���� for��. ������
		
		for(int gop=1; gop<=9; gop++) {
			for(int dan=2; dan<=9; dan++) {
				if(dan == 4) {
					break;
				}
				System.out.print(dan + "*" + gop + "=" + dan*gop + "\t");
			}
			System.out.println();
		}
	}
	
	

}
