package school;

import java.util.Scanner;
//23018092 조동현
public class School3_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=0, n=0;
		double sum=0;
		
		System.out.println("정수 입력후 마지막에 0 입력");
		while((n=sc.nextInt())!=0) {	//sc.nextInt()!=0은 컴파일은 되지만 원하는 답은 안나옴
			sum=sum+n;
			count++;
		}
		/*
		while(true){
		n=sc.nextInt();
		if(n==0)break;
		sum=sum+n;
		count++;
		}
		 */
		System.out.print("수의 개수는 "+count+"개이며");
		System.out.println("평균은 "+sum/count+"입니다");
		
		sc.close();
	}
}
