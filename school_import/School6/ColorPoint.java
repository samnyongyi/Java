package school;

public class ColorPoint extends Point{
	private String color;
 	public void setColor(String color) { this.color=color;}
 	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}

	// temp6에서 사용
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	public ColorPoint() {color="white";}
}
