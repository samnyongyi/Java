package school_import;

import java.util.Scanner;

public class School2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("봄/여름/가을/겨울 : ");
		String season = sc.next();
		
		char c = season.charAt(0);
		
//		if(c=='봄') {}	//기본데이터 타입(정수, 실수, 문자, 불린) 비교연산자 사용가능
//		if(season=="봄") {}		// 오류, season.equals("봄")과 같이 작성해야 사용가능
			
			
		
		sc.close();
	}

}
