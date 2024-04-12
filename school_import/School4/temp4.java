package school;

import java.util.Scanner;

public class temp4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name[]= new String[5];
		String max= "";
		
		System.out.print("5명의 학생 이름 입력>>");
		for(int i=0; i<5; i++) {
			name[i]=sc.next();
			if(name[i].length()>max.length()) max=name[i];	// 문자열 길이 비교하여 가장 긴 문자열을 저장	
		}
		System.out.println("가장 길이가 긴 이름은 "+ max);
	
	}
}
