package com.kosta.day05;

/*<<class>>
 * public:�����Ű������ ���ٰ��� 
 * ����(default) : ������Ű�������� ���ٰ���
 * <<����, �޼���, ������>>
 * public:�����Ű������ ���ٰ��� 
 * protected : ������Ű���������ٰ��� 
 *           : �ٸ���Ű�������� ��ӹ����� ���ٰ��� 
 * ����(default) : ������Ű�������� ���ٰ��� 
 * private : ����class������ ���ٰ���
 */
public class Person {
	//final : 1���� �Ҵ簡��,�����Ұ�  
	public final String nation="�ѱ�";//1)����� �ʱ�ȭ�Ѵ�.
	public final String ssn;
	//��� 
	public static final String COUNTRY = "���ѹα�"; 
	protected String name;
	private int age;
	int score=100;
	
	public Person(){
		this.ssn = "";
	}
	Person(String ssn,String name,int age){
		this.ssn = ssn;//2)������ �ʱ�ȭ�Ѵ�. 
		this.name = name;
		this.age = age;
	}
	void test() {
		name = "�̸�����";
		age = 20;
		//------------final�� �����Ұ�
		//nation="�ѱ�";
		//ssn = "12345";
		//COUNTRY = "���ѹα�";
	}
	void test2() {
		//Integer.MAX_VALUE = 100;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.class);
		
		//bitCount() ->2������ �ٲپ 1�ǰ��� �?
		System.out.println(Integer.bitCount(10));
		
	}
	
	public static void main(String[] args) {
	 
		new Person().test2();
		System.out.println(
			new String("�ڹ����α׷�").substring(0, 2).charAt(0) );
	}
	
}
