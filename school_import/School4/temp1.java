package school;

import java.util.Scanner;

public class temp1 {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int num[]= new int[5];	// 배열 생성
		/*int num[];
		  num=new int[5];
		 */
	
		System.out.println("정수 5개 입력>>");
		for(int i=0; i<5; i++) {
			num[i]=sc.nextInt();	// 초기화
		}
		System.out.println("배열이 원소 출력");
		for(int i=0; i<5; i++) {
			System.out.println(i+"번째 원소 :"+num[i]);
		}
	}
}
