package com.kosta.day02;

public class ForTest2 {
	
	// break : �ߴ�, switch, for, while, do-while
	// ���� ����� �ݺ��� ����������
	// ��ø �ݺ����� �������� �� �̸��� �ش�.
	
	public static void test2() {
		// countinue ���� ����
		AA:for(int j = 1; j <= 3; j++) {
			for(int i = 1; i <= 5; i++) {
				if(i == 3) continue AA;	// �Ʒ� ������� �����ϰ� �ݺ��� ��� ����
				
				System.out.println(i + ", "+ j);
				System.out.println("**********");
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		test2();
		System.out.println("=======================");
		
		AA:for(int dan = 2; dan <= 9; dan++) {
			System.out.println(dan+"��-----");
			//if(dan == 4) break;				//4���� �� ����
			//System.out.println("oo");
			for(int gop = 1; gop <=9; gop++) {
//				if(dan == 4) break;				//4���� ���� skip
				if(dan == 4) break AA;			//4���� �� ����
				System.out.println(dan+"*"+gop);
			}
		}
		System.out.println("for end");

	}

}
