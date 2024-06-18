package school;

public class temp2 {

	public static void main(String[] args) {
		// Character 사용
		System.out.println(Character.toLowerCase('A'));	// 'A'를 소문자로 변환
		char c1='4', c2='F';
		if(Character.isDigit(c1))System.out.println(c1+"는 숫자");	// 문자 c1이 숫자이면 true
		if(Character.isAlphabetic(c2))System.out.println(c2+"는 영문자");
		// Integer 사용
		System.out.println((Integer.parseInt("28")+10));	// 문자열 "28"을 정수 변환
		System.out.println((Integer.toString(28)+10));	// 정수 28을 문자열로 변환
		Integer i=28;	// 자동 박싱
		System.out.println(i.doubleValue());	// 정수를 double 값으로 변환, 28.0
		System.out.println((double)i);	// i를 자동 언박싱으로 정수 변환 후 double로 형변환, 28.0
		// Double 사용
		Double d=3.14;	// 자동 박싱
		System.out.println(d.toString());	// Double을 문자열 "3.14"로 변환
		System.out.println(Double.parseDouble("3.14"));	// 문자열을 실수 3.14로 변환

	}

}
