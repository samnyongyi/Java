package school5;

public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius=1; name="";
	}
	public Circle(int r, String n) {
		radius=1; name=n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

}
