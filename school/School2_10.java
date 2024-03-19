package school;	//23018092 조동현

import java.util.Scanner;

public class School2_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피를 주문: " );
		String coffee = sc.next();
		int num = sc.nextInt();
		int total;
		
		if(coffee.equals("에소프레소")){
				total=2000*num;
				System.out.println("가격 : " + total);
		}
		if(coffee.equals("아메리카노")){
				total=2500*num;
				System.out.println("가격 : " + total);
		}
		if(coffee.equals("카푸치노")){
				total=3000*num;
				System.out.println("가격 : " + total);
		}
		if(coffee.equals("카페라떼")){
				total=3500*num;
				System.out.println("가격 : " + total);
		}	
		sc.close();
	}

}
