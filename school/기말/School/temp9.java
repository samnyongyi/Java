package school;

import java.util.*;

public class temp9 {

	public static void main(String[] args) {
		HashMap<String, String> dic=new HashMap<>();
		
		dic.put("baby", "아기");
		dic.put("love","사랑"); dic.put("apple","사과");
		Set<String>keys=dic.keySet();
		Iterator<String>it=keys.iterator();
		while(it.hasNext()) {
			String key=it.next();
			String value=dic.get(key);
			System.out.print("("+key+","+value+")");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			String eng=sc.next();
			if(eng.equals("exit"))break;
			String kor=dic.get(eng);
			if(kor==null)
				System.out.println(eng+"는 없는 단어입니다.");
			else System.out.println(kor);
		}
		System.out.println("프로그램 종료");
	}
}

