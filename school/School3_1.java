package school;

import java.util.Scanner;

public class School3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력하세요>>");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println("1~"+n+"까지의 합="+sum);
		sc.close();
	}
}
