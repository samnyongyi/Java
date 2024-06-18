package school;

import java.util.ArrayList;
import java.util.Scanner;

public class temp8 {

	public static void main(String[] args) {
		ArrayList<Integer>arr= new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);	
		
		System.out.print("정수 5개 입력>>");
		for(int i=0; i<5; i++) {
			arr.add(sc.nextInt());
		}
		
		int max=arr.get(0);
		for(int i=1; i<arr.size(); i++) {
			if(max<arr.get(i))max=arr.get(i);
		}
		System.out.println("가장 큰 수는 "+max);
		
		
		/* 수정 필요
		int[] num=new int[5];
		int max=0;
		
		System.out.print("정수 5개 입력>> ");
		for(int i=0; i<5; i++) {
			num[i]=sc.nextInt();
			arr.add(num[i]);
		}
		for(int i=0; i<5; i++) {
			max=arr.get(0);
			if(max< arr.get(i))max=arr.get(i);
		}
		System.out.print("가장 큰 수는 "+max);
	*/
		
		/*배열에서 최대값 구하는 알고리즘
		int[] arr=new int[5];
		
		for(int i=0; i<arr.length; i++)
			arr[i]=sc.nextInt();
		int max= arr[0];
		for(int i=1; i<arr.length; i++)
			if(max<arr[i])max=arr[i];
		System.out.println("최대값="+max);
		int index=0;
		for(int i=1; i<arr.length; i++)
			if(arr[index]<arr[i])index=i;
		System.out.println("최대값="+arr[index]);
		
		 */
	}

}
