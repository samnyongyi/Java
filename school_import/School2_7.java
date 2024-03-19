package school_import;

import java.util.Scanner;

public class School2_7 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("봄/여름/가을/겨울 : ");
		String season = sc.next();
		
		char c = season.charAt(0);	//인덱스가 0이므로 문자열에서 0번째 인덱스만 문자로 추출(문자입력은 문자열에서 처리)
		
		switch(season) {	//season 대신 c 입력시 봄, 여, 가, 겨 로 수정
		case "봄":
			System.out.println("3~5월");
			break;
		case "여름":
			System.out.println("6~8월");
			break;
		case "가을":
			System.out.println("9~11월");
			break;
		case "겨울":
			System.out.println("12~2월");
			break;
		default:
			System.out.println("잘못된 입력");
		}
		sc.close();
	}
}
/*	break문의 중요성
public class School2_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월(1~12)을 입력: ");
		int month = sc.nextInt();
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
			default:
				System.out.println("잘못된 입력");
		}
	
	}
}
*/