package school;

public class Pizza extends Circle {
	private String topping;
	public Pizza(String s, int n) {
		super(n);	// 필수
	//	this.setRadius(n);	// 작성 미필수
		this.topping=s;
	}
	public void print() { 
		System.out.println("토핑: "+this.topping);
		System.out.println("피자 반지름: "+this.getRadius());
		System.out.println("피자 크기: "+ this.area());
	}
}
