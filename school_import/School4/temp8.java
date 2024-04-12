package school;

import java.util.Scanner;

public class temp8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("행 번호, 열 번호 >> ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0, sum2=0, total=0;
		int num[][]=new int[a+1][b+1];	// a와 b는 개수여야 하므로 +1
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<b+1; j++) {
				num[i][j]=(int)(Math.random()*10);
				sum+=num[i][j];
				System.out.print("\t"+"\t"+num[i][j]+" ");
			}
			System.out.println(" >> 행의 합은"+ sum);
			total+=sum;
			sum=0;
		}
		for(int i=2; i<a+1; i++) {
			for(int j=0; j<b+1; j++) {
				num[i][j]=i;
				sum+=num[i][j];
				System.out.print("\t"+"\t"+num[i][j]+" ");
			}
			System.out.println(" >> 행의 합은"+ sum);
			total+=sum;
			sum=0
					;
		}
		System.out.print("열의 합은 >> ");
		for(int i=0; i<b+1; i++) {
			for(int j=0; j<a+1; j++) {
				sum2+=num[j][i];
			}
			System.out.print("\t"+sum2+"\t");
			sum2=0;
		}
		System.out.println();
		// System.out.print();은 컴파일 에러 발생
		System.out.println("총 합 >> "+total);
	}

}
