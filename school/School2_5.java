package school;

import java.util.Scanner;

public class School2_5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("x의 값을 입력: ");
		int x = sc.nextInt();
		int y=x*x-3*x+7;
		System.out.println("x : " + x + ", "+ "y : "+ y);
		
		sc.close();		
	}
}
