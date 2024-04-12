package school;

import java.util.InputMismatchException;
import java.util.Scanner;

public class temp12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력하세요");
		int n=0;
		for(;;) {
			System.out.print(">>");
			try {
				n=scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("수를 입력하지 않아 종료합니다");
				break;
			}
		}
		scanner.close();
	}
}
