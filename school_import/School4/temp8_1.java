package school;

import java.util.Scanner;

public class temp8_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("행번호 입력>>"); int row= in.nextInt();
		System.out.print("열번호 입력>>"); int col= in.nextInt();
		int [][] arr =new int[row][col];
		
		for(int i=0; i<arr.length; i++) {	// 행의 길이
			for(int j=0; j<arr[0].length; j++) {	// 열의 길이
				if(i<2)arr[i][j]=(int)(Math.random()*10)+1;	//배열 초기화
				else arr[i][j]=i;
			}
		}
		int total=0;
		System.out.print("배열\t");
		for(int i=0; i<arr[0].length; i++)System.out.print(i+"\t");
		System.out.print("행합\n");
		
		for(int i=0; i<arr.length; i++) {// 행
			int r_sum=0; System.out.print(i+"\t");
			for(int j=0; j<arr[0].length; j++) {	//열
				System.out.print(arr[i][j]+"\t"); r_sum+=arr[i][j];
			}total+=r_sum;	System.out.print(r_sum+"\n");
		}
		System.out.print("열합\t");;
		for(int j=0; j<arr[0].length; j++) {	//열
			int c_sum=0;
			for(int i=0; i<arr.length; i++)c_sum+=arr[i][j];
			System.out.print(c_sum+"\t");
		}System.out.print(total+"\n");
	}
}
