package school_import;	//23018092 조동현

import java.util.Scanner;

public class School2_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피를 주문: " );
		String coffee = sc.next();
		int num = sc.nextInt();
		int total;
		
		switch(coffee){
			case "에소프레소":
				total=2000*num;
				if(/*coffee.equals("에소프레소")&&*/num>=10) {
					total=total-(total/20);
					//(double)total=total*0.95;	//	컴파일에러, int형은 double형으로 변환 불가, 정수와 실수는 서로 강제변환으로도 불가
				}
				System.out.println("가격 : " + total);	
				break;
			case "아메리카노":
				total=2500*num;
				System.out.println("가격 : " + total);
				break;
			case "카푸치노":
				total=3000*num;
				System.out.println("가격 : " + total);
				break;
			case "카페라떼":
				total=3500*num;
				System.out.println("가격 : " + total);
				break;
		}			
		sc.close();
	}

}
