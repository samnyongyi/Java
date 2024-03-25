package school;

import java.util.Scanner;

public class School3_7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("exit을 입력하면 종료");
		
		while(true) {
			System.out.print(">>");
			String text= sc.next();
			if(text.equals("exit")) break;
		}
		System.out.println("종료");
		sc.close();
	}

}
