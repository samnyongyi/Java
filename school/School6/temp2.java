package school;

import java.util.Scanner;

public class temp2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("인원수");
		int n=sc.nextInt();
		Phone[] ph=new Phone[n];
		for(int i=0; i<n; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			ph[i]=new Phone(sc.next(), sc.next());
		}
		System.out.println("저장되었습니다");
		for(;;) {
			System.out.print("검색할 이름>>");
			String name=sc.next();
			if(name.equals("exit")) break;
			int i;
			for(i=0; i<n; i++) {
				if(name.equals(ph[i].getName())) {
					System.out.println(name+"의 번호는 "+ph[i].getTel()+"입니다.");
					break;
				}
			}
			if(i==ph.length) System.out.println(name+"이 없습니다.");	
		}
	}
}
