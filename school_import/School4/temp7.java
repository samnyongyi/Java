package school;

public class temp7 {

	public static void main(String[] args) {
		int intArray[][];
		intArray=new int[3][4];	// 3행 4열
		
		for(int i=0; i<3; i++)	//행번호
			for(int j=0; j<4; j++)	//열번호
				intArray[i][j]=(int)(Math.random()*10);
		
		for(int i=0; i<intArray.length; i++) {	// intArray.length는 2차원 배열의 행의 개수
			for(int j=0; j< intArray[0].length; j++) 	//int Array[0].length는 0번째 행의 열의 개수
				System.out.print(intArray[i][j]);	
			System.out.println();
		}
		
		int i=0, sum=0;
		while(i<3) {
			/*for(int k[]:intArray)
				for(int j:k)
					sum+=j;
			*/
			for(int j=0; j<intArray[0].length; j++)
				sum+=intArray[i][j];
			i++;
		}
		System.out.println("합은 "+sum);
	
	}

}
