package com.kosta.day05;

public class Student {
	//���ٱ���(����):public, protected,default,private
	public String name;
	protected int[] scores;
	String major;
	private String sNo;
	//Ȱ���� : static, final
	public static String school;
	public final int grade=4;
	public static final String TEACHER="�豳����";
	
	//�������� ���ٱ��� 
	public Student(String name){this.name = name;}
	protected Student(String name,String major){
		this.name = name;
		this.major = major;
	}
	Student(){	}
	private Student(int[] scores) {}
	
	//�޼����� ���ٱ��� 
	public void study() {}
	protected void study2() {}
	void study3() {}
	private void study4() {}
	
	//�޼����� Ȱ����
	//1.static : class�޼��� 
	public static void study5() {}
	//2.final : �ڽ��� �θ��� �޼��带 ������ �Ұ� 
	public final void study6() {}
	//3.abstract : ���Ǵ� �ְ� ������ ����. ������ �ڽ����Ѵ�.
	//4.synchronized : lock�ɱ� ...��Ƽ������ 
	
}





