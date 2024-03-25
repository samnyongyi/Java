package school;

import java.util.Scanner;

public class School3_13{

	public static void main(String[] args) {
		System.out.print("정수 10개 입력");
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[10];
	
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			}
		
		for(int i=0; i<arr.length; i++)
			if(arr[i]%3==0)System.out.print(arr[i]);
	}
}
