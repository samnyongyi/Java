package school;

import java.util.Scanner;

public class School2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점 (x,y)의 좌표를 입력");
		
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		if((x>=50)&&(x<=100)) {
			if((y>=50)&&(y<=100)) {
				System.out.println("점 (" +x+ ","+ y+ ")는 (50,50)과 (100,100)의 사각형 내에 존재");
			}
		}
		else System.out.println("존재 x");
		sc.close();
		
		
	
	}

}
