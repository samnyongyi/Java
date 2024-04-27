package school;

import java.util.Scanner;

public class temp1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		Rect[] rc= new Rect[4];
		for(int i=0; i<4; i++) {
			System.out.print((i+1)+" 너비와 높이>>");
			rc[i]=new Rect(sc.nextInt(), sc.nextInt());
	/*		rc[i]=new Rect();
			rc[i].setwidth=sc.nextInt();
			rc[i].setheight=sc.nextInt();*/
			sum+=rc[i].getArea();	//sum+=rc[i].getwidht()*arr[i]*getHeight();
		}
	/*	
		Rect[] rc;	// Circle 배열에 대한 래퍼런스 변수 rc 선언
		rc= new Rect[4];	//래퍼런스 배열 생성
		for(int i=0; i<4; i++) {
			System.out.print((i+1)+" 너비와 높이>>");
			rc[i]=new Rect(sc.nextInt(), sc.nextInt());	// 각 원소 객체 생성
			sum+=rc[i].getArea();
		}
	*/
		System.out.println("저장하였습니다");
		System.out.println("사각형 전체 합은" +sum);
	}
}
