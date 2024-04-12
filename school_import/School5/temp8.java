package school5;

import java.util.Scanner;

public class temp8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Food[] f=new Food[2];
		for(int i=0; i<2; i++) {
			f[i]= new Food();
			f[i].show();
		}
		System.out.println("음식 정보 목록");
		System.out.println("음식명: "+f[0].getname()+", 칼로리: "+f[0].getkcal());
		System.out.println("음식명: "+f[1].getname()+", 칼로리: "+f[1].getkcal());

		System.out.print("음식명>> ");
		String name;
		name=sc.next();
		System.out.print("주문개수>> ");
		int count;
		count=sc.nextInt();
		for(int i=0; i<2; i++) {
			if(f[i].getname().equals(name)) System.out.println("총칼로리="+f[i].cal(count));
		}
	}
}
