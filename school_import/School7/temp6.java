package school;

interface InterFood{
	void cook();
	void taste();
}

abstract class Food implements InterFood{
	private String foodName;
//	public Food(){	this.foodName="";};
	public Food(String s) {this.foodName=s;}
	
	public String getfoodName() { return this.foodName;}	// public 작성 필수
	public String setfoodName(String s) { return this.foodName=s;}
}

class Noodle extends Food{
	@Override
	public void cook() { System.out.println("끓는 물에 라면과 스프를 넣고 2분간 끓인다");}
	@Override
	public void taste() {System.out.println("개운하고 구수한 맛이 난다");}
	public Noodle(String s) {super(s);}	
}
class FriedRice extends Food{
	@Override
	public void cook() { System.out.println("밥과 각종 야채를 기름에 볶는다");}
	@Override
	public void taste() {System.out.println("밥이 고슬고슬하고 잘 볶아진 야채가 잘 어울러진다");}
	public FriedRice(String s) {super(s);}
}

public class temp6 {
	public static void main(String[] args) {
		Food[] f= new Food[2];
		f[0]=new Noodle("라면");	f[1]=new FriedRice("볶음밥");
		for(int i=0; i<2; i++) {
			System.out.println("음식명: "+f[i].getfoodName());
			System.out.print("요리법: "); f[i].cook();	// 값을 리턴하지 않기때문에 따로 처리
			if(f[i] instanceof Noodle) System.out.println("파를 넣는다");
			System.out.print("음식맛: "); f[i].taste();
			System.out.println("**************");
			
		//	System.out.println("요리법: "+f[i].cook());	// 컴파일 오류
		//	System.out.println("음식맛: "+f[i].taste());	// 컴파일 오류
		}
	}
}
