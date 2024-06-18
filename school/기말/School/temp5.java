package school;

import java.util.StringTokenizer;

public class temp5 {
	public static void main(String[] args) {
		String query="name=kitae&addr=seoul&age=21";
		// 구분문자'&': 문자열을 구분할때 사용되는 문자
		// 토큰: 구분 문자로 분리된 문자열
		// name, kitae, addr, seoul, age, 21순으로 토큰 설정
		StringTokenizer st= new StringTokenizer(query, "&");
		
		int n=st.countTokens();	// 토큰 개수
		System.out.println("토큰 개수= "+n);
		
		while(st.hasMoreTokens()) {
			String token=st.nextToken();	// 다음 토큰 얻어내기
			System.out.println(token);
		}
	}
}
