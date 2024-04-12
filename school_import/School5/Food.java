package school5;

import java.util.Scanner;

public class Food {
	private String name;
	private int kcal;
	
	public void setname(String n) {
		this.name=n;
	}
	public void setkcal(int k) {
		this.kcal=k;
	}
	public String getname() {return this.name;}
	public int getkcal() {return this.kcal;}
	public void show() {
		System.out.print("음식정보 입력(이름, 칼로리))>> ");
		Scanner sc= new Scanner(System.in);
		this.name=sc.next();
		this.kcal=sc.nextInt();
	}
	public int cal(int count) {
		return this.kcal*count;
	}
}
