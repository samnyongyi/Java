package school;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String eng[]= {"student", "love", "java", "happy", "future"};
		String kor[]= {"학생", "사랑", "자바", "행복한", "미래"};
		String temp;
		String exit="exit";
	
		while(true) {
			System.out.print("영어단어를 입력하세요>> ");
			temp=sc.next();
			if(temp.equals(exit)) break;
			int check=-1;
			for(int i=0; i<5; i++) {
				if(temp.equals(eng[i])) {
					System.out.println(kor[i]);
					check++;
				}else if(i==4 && check==-1) System.out.println("그런 영어단어가 없습니다.");
			}
			check=-1;
		}
	}
}
