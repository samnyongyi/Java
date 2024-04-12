package school;

import java.util.Scanner;

public class temp3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num[]= new int[5];
		int count=0, max=0;
		
		System.out.println("정수 5개 입력>>");
		for(int i=0; i<5; i++) {
			num[i]=sc.nextInt();
			if(num[i]>5) count++;
		}
		System.out.println("5보다 큰 원소의 개수: " + count);
	}
}
