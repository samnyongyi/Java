package school;

public class temp4 {

	public static void main(String[] args) {
		String a= new String("C#");
		String b= new String(",C++,JS");
		System.out.println(a+"의 길이는"+a.length());	// 문자열의 길이(문자 개수)
		System.out.println(a.contains("#"));	// 문자열의 포함 관계
		a=a+b;	// 문자열 연결
		
		a=a.trim();	// 문자열 앞 뒤 공백 제거
// #,\ 등도 제거
		System.out.println(a);
		a=a.replace("C#","Java");	// 문자열 대치
		System.out.println(a);
		String s[]=a.split(",");	// 문자열 분리
		for(int i=0; i<s.length; i++) System.out.println("분리된 문자열"+i+":"+s[i]);
		// indexOf(문자): 해당 문자의 index를 리턴, 해당 문자가 없는 경우 index는 -1을 리턴
		int i=b.indexOf("J");
		a=b.substring(i);	// i 인덱스 이후의 문자열 추출, substring(시작인덱스,[문자개수]): 인덱스부터 문자개수만큼 추출
		System.out.println(a);
		char c=a.charAt(0);	// 해당 인덱스 문자 리턴
		System.out.println(c);
	}
}

