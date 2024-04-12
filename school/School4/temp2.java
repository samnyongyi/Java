package school;

import java.util.Scanner;

public class temp2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double sum=0;	// 누적함수, 초기화 필수
		double num[]= new double[7];	// double형 타입 배열
		System.out.printf("실수 7개 입력>>");
		for(int i=0; i<7; i++) {
			num[i]=sc.nextDouble();	// 키보드 입력하는 문자들을 double형으로 변환하여 리턴
			sum+=num[i];
		}
		System.out.printf("배열의 원소 합=%.1f", sum);
	}

}
