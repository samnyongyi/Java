package school5;

import java.util.Scanner;

public class Myphone {
	private int year;
	private int vol;
	
	public void setyear(int y) {
		this.year=y;
	}
	public void setvol(int v) {
		this.vol=v;
	}
	public int getyear() {
		return this.year;
	}
	public int getvol() {
		return this.vol;
	}
	
	public void show() {
	 	System.out.print("폰 정보 입력(출시년도, 볼륨)>> ");
	 	Scanner sc= new Scanner(System.in);
		year=sc.nextInt();
		vol=sc.nextInt();
	}
	public void volUp() {
		vol+=10;
	//	System.out.println("출시년도: "+this.year+"볼륨"+this.vol);
	}
	public void volDown() {
		vol-=10;
	//	System.out.println("출시년도: "+this.year+"볼륨"+this.vol);
	}
}
