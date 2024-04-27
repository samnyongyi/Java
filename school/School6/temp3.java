package school;

import java.util.Scanner;

public class temp3 {

	public static void main(String[] args) {
		System.out.println("카드의 폭은 "+Card.width+", 높이는 "+Card.height);
		Scanner in =new Scanner(System.in);
		Card[] arr= new Card[2];
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"무늬와 숫자>>");
			arr[i]=new Card(in.next(), in.nextInt());
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print("C"+(i+1)+"의 무늬는 : ");
			arr[i].showInfo(); arr[i].showSize();
		}
		Card.setSize(50,80); System.out.println("카드 사이즈 변경!");
		for(int i=0; i<arr.length; i++) {
			System.out.print("C"+(i+1)+"의 무늬는 : ");
			arr[i].showInfo(); arr[i].showSize();
		}
	
	}

}
