package school;

public class School3_9 {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {	// 행
			for(int j=1; j<10; j++) {	// 열
				System.out.print(i+"*"+j+"="+i*j);
				System.out.print('\t');
			}
			System.out.println();
		}

	}

}
