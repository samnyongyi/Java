package school;

public class School3_10 {

	public static void main(String[] args) {
		/*for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		/*for(int i=1; i<=5; i++) {
			for(int j=6; j>i; j--
					) {
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		for(int i=1; i<=5; i++) {
			int j;
			for(j=6; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) { 
					System.out.print("*");
			}
			if(j==i) System.out.print("\n");
		}
		
	}
}
