package school5;

public class temp7_1 {

	public static void main(String[] args) {
		Myphone[] p=new Myphone[2];
		for(int i=0; i<2; i++) {
		//	p[i]=new Myphone();
			p[i].show();
		}
		
		System.out.println("폰 정보 목록");
		p[1].volUp();
		System.out.println("출시년도: "+p[0].getyear()+"년 볼륨"+p[0].getvol());
		System.out.println("출시년도: "+p[1].getyear()+"년 볼륨"+p[1].getvol());
	}
}
