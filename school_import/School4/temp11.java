package school;

import java.util.InputMismatchException;	// try-catch-fianlly문을 사용하기 위해 작성
import java.util.Scanner;

public class temp11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {	// 예외가 발생할 가능성이 있는 실행문
				n=scanner.nextInt();
				sum+=n;
			}catch(InputMismatchException e) {	// 예외 처리문
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				scanner.next();	
				i--;
			}
			//fianlly{}	// finally블록은 생략가능, 예외 발생 여부와 상관없이 무조건 실행되는 블록
		}
		System.out.println("합은 "+sum);
		scanner.close();
	}

}
