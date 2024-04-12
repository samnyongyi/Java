package school;

public class temp5 {

	public static void main(String[] args) {
		// 뒤에 있는 변수명은 앞에 있는 변수명에 있는 만큼 대입
		// for-each는 읽기 전용
		int[] n= {1,2,3,4,5};
		int sum=0;
		for(int k:n) {	// k는 n[0~4]로 반복
			System.out.print(k+" ");
			sum+=k;
		}
		System.out.println("합은"+sum);
		
		String f[]= {"사과", "배", "바나나", "체리", "딸기", "포도"};
		for(String s:f) System.out.print(s+" ");	// s는 f[0~5]로 반복
	}

}
