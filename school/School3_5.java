package school;

import java.util.Scanner;
//23018092 조동현
public class School3_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("[출력 결과 예제]\n* 메뉴 *\n1. 아메리카노 2000\n2. 아아 2500\n3. 기타 3000\n[주문 종료 0 입력]\n==========");
		int sum=0;
		while(true) {
			System.out.println("메뉴입력>>");
			int num=sc.nextInt();
			switch(num) {
			case 1: sum+=2000; break;
			case 2: sum+=2500; break;
			case 3: sum+=3000; break;
			default: System.out.println("오류");
			}
			if(num==0) break;
		}
		System.out.println("주문종료\n주문금액="+sum+"원입니다");
		sc.close();
	}
}
