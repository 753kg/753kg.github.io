package openTutorials;

class Accounting2{
	public double valueOfSupply;
	public static double vatRate = 0.1;
	
	public Accounting2(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	
	public double getVAT() {
		// 인스턴스 변수에 접근하려면 static이면 안됨.
		return valueOfSupply * vatRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	
}

public class AccountingApp2 {

	public static void main(String[] args) {
		// 생활코딩 JAVA 객체 지향 프로그래밍 - 클래스와 인스턴스의 활용
		// 클래스의 상태가 계속 바뀌어야 하는 상황일 때 인스턴스 활용
		// 인스턴스를 활용하면 각자 독립된 내부적인 상태를 유지할 수 있다.
		// static 변수 사용이 편리할 때 : 한 곳에서 바꾸면 모든 곳에서 바꿀 필요가 없을 때
		
		Accounting2 a1 = new Accounting2(10000.0);
		
		Accounting2 a2 = new Accounting2(20000.0);
		
		System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("Value of supply : " + a2.valueOfSupply);
		
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		
		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());
		
		

	}

}
