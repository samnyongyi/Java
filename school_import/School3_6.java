package school;

import java.util.Scanner;

public class School3_6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=0;
		int com=(int)(Math.random()*10)+1;
		while(true) {
			System.out.println("컴퓨터가 생각한 수를 맞춰보세요(1~10)>>");
			int num=sc.nextInt();
			if(num>com) {
				System.out.println("입력한수가 큽니다");
				count++;
			}
			if(num<com) {
				System.out.println("입력한수가 작습니다");
				count++;
			}
			if(num==com) {
				count++;
				break;
			}
			/*
			 * int count=1;
			 	if(com==num){
					System.out.println(count+"만에 맞힘");
					break;
				}else if(com>num)
					System.out.println("입력한 수가 컴보다 작다");
				else System.out.println("입력한 수가 컴보다 크다");
				}
			 */
		}
		System.out.println(count+"번 만에 맞췄습니다");
		sc.close();
	}

}
