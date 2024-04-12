package school;

public class temp6 {

	public static void main(String[] args) {
	// 2차원 배열 입력시 괄호를 쓰고 행구분을 해야함
		double score[][]= {{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}};
		double sum=0;
		
		for( double k[]:score)	//각 학년별로 반복, 행번호
			for(double j: k)	// 각 학년의 학기별로 반복
				sum+=j;	// 전체 평점 합
		/*
		for(int i=0; i<score.length; i++)
			for(int j=0; j<score[0].length; j++)
				sum+= score[i][j];
		*/
		int n=score.length;	// 배열 행 개수, 4
		int m=score[0].length;	// 배열의 열 개수, 2
		
		System.out.println("4년 전체 평점 평균은 "+ sum/(n*m));

	}
}
