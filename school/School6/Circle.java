package school;

public class Circle {
	private int radius;
	public Circle(int radius) {this.radius=radius;}
	public int getRadius() {return this.radius;}
	public void setRadius(int radius) {this.radius=radius;}
	// temp7에서 사용
	public static final double PI=3.14;
	public double area() {return radius*radius*PI;}
}

