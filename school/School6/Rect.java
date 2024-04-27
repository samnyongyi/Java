package school;

public class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public Rect() {
		this.height=1;
		this.width=1;
	}
	public int getArea() {return width*height;}
	
	public int getwidth() {return width;}
	public int getheight() { return height;}
	public void setwidth(int n) {this.width=n;}
	public void setheight(int n) {this.height=n;}	
}

