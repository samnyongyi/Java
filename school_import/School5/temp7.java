package school5;

public class temp7 {

	public static void main(String[] args) {
		Myphone p1=new Myphone();
		Myphone p2=new Myphone();

		p1.show();
		p2.show();
		p2.volUp();
		
		System.out.println("=폰정보 목록=");
	//	System.out.println(p1.year)	//year필드는 private이기에 접근 불가
		System.out.println("출시년도: "+p1.getyear()+"년 볼륨"+p1.getvol());
		System.out.println("출시년도: "+p2.getyear()+"년 볼륨"+p2.getvol());
	}
}
