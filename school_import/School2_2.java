package school_import;

import java.util.Scanner;	// Scanner 객체 사용하기 위해 작성

public class School2_2 {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력");
		
		Scanner sc = new Scanner(System.in);	// System.in을 직접 사용이 가능하지만 어려움이 존재하기에 Scanner 객체 사용
		// System.in.read() 함수는 end of stream (-1)을 만날 때까지 동작, backspace로 편집이 가능하며 enter키로 데이터를 읽기도 가능 
		// '윈도우 : CTRL+z, 리닉스/매킨토시 : CTRL+d' == -1

		String name = sc.next();	// 문자열로 리턴, space바 입력시 종료
		System.out.println("이름은 " + name);
		String city = sc.next();
		System.out.println("도시는 " + city);
		String age = sc.next();
		System.out.println("나이는 " + age);
		String weight = sc.next();
		System.out.println("체중은 " + weight);
		String single = sc.next();
		System.out.println("독신여부는 " + single);
		
		sc.close();	// Scanner 객체인 sc 종료
	}

}
