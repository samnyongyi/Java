package school;

import java.util.*;	// 모든 클래스 사용

public class temp6 {
	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList/*<String>*/();
		Scanner scanner=new Scanner(System.in);
			for(int i=0; i<4; i++){
				System.out.print("이름을 입력하세요>>");
				String s= scanner.next();	
				a.add(s);	// ArrayList 컬렉션에 삽입
			}
			for(int i=0; i<a.size(); i++) {
				String name=a.get(i);	// ArrayList의 i번째 문자열 얻어오기
				System.out.print(name+" ");
			}
			int max=0;
			for(int i=1; i<a.size(); i++) {
				if(a.get(max).length()<a.get(i).length())
					max=i;
			}
			System.out.println("\n가장 긴 이름은: "+a.get(max));
	}
}



