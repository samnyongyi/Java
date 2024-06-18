package school;

import java.util.Scanner;
import java.util.*;

public class temp1 {

	public static void main(String[] args) {
		HashMap<String, Integer>tp=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("아이스크림 이름과 가격을 입력하세요");
		for(int i=0; i<5; i++) {
			System.out.print("이름, 가격 >> ");
			/* 확인필요
			String name=sc.next();
			int price=sc.nextInt();
			tp.put(name, price);*/
			tp.put(sc.next(),sc.nextInt());
		}
		Set<String>keys=tp.keySet();
		Iterator<String>it=keys.iterator();
		System.out.print("아이스크림 이름:");
		Vector<Integer>price=new Vector<>();
		while(it.hasNext()) {
			String key=it.next();
			System.out.print(key+" ");;
			price.add(tp.get(key));
		}
		System.out.println();
		System.out.print("가격:");
		int sum=0;
		for(int i=0; i<price.size();i++) {
			System.out.print(price.get(i)+" ");
			sum+=price.get(i);
		}
		System.out.println();
		System.out.print("아이스크림 총가격"+sum);
	}

}
