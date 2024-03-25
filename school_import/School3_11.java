package school;

import java.util.Scanner;

public class School3_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력>>");
		String s= sc.next();	// 문자열로 읽음
		char c=s.charAt(0);	// 입력한 문자열에 0번 인덱스의 문자를 반환
		
		for(char i='a'; i<=c; i++) {
			for(char j=i; j<=c; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		/*
		String s= sc.next();
		for(int i=0; i<s.length(); i++) {
			int tempi=i;
			for(int j=s.length(); j>i; j--) {
				char c= s.charAt(tempi);
				System.out.print(c);
				tempi++;
			}
			System.out.print("\n");
			tempi=i;
		}*/
		sc.close();
	}
	
}
