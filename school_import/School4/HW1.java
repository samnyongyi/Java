package school;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1 {	// 메소드는 일반적으로 public 접근 지정을 가짐

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num;
		for(;;) {
			try {
				System.out.print("정수를 입력하세요 >> ");
				num= sc.nextInt();
				if(num<0) {
					System.out.println("프로그램을 종료합니다");
					break;
				}
				String[] day= {"일", "월", "화", "수", "목", "금", "토"};	// 선언과 동시에 초기화
				int count=num%7;
				System.out.println(day[count]);	//syso+Tab키
			}catch(InputMismatchException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				sc.next();
				
			}
		/*	String[] day;
			day = new String[]{"일", "월", "화", "수", "목", "금", "토"};
		 	*/
		}
		sc.close();
	}

}

