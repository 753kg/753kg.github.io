package step02;

import java.util.Scanner;
public class No1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		if(v1 == v2) System.out.println("==");
		else if(v1 > v2) System.out.println(">");
		else System.out.println("<");
	}
}
