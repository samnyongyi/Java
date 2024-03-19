package school_import;

import java.util.Scanner;

public class School1 {

	public static void main(String[] args) {
		System.out.print("학번 : ");
		Scanner scan = new Scanner(System.in);
		String num = scan.next();	//문자열 입력 함수 : next(), space바로 구분하므로 주의
		// nextLine같은 경우는 space바도 입력 가능하며 Enter키로 구분
		
		System.out.print("나이 : ");
		int age = scan.nextInt();	// 정수 입력 함수 :  nextInt()
		
		System.out.println("학번 : " + num);
		System.out.println("나이 : " + age);
		
		scan.close();
	}

}
