package school;

import java.util.Scanner;

public class School3_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("단 입력하세요>> ");
		int num=sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(num+ "*" +i +"="+ num*i);
			//System.out.printf("%d*%d=%2d\n", num, i,(num*i));
		}
		sc.close();
	}

}
