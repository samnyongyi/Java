package school;

public class Point {
	private int x, y;
	public void set(int x, int y) {
		this.x=x; this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
	// temp6에서 사용
	public Point() { this.x=this.y=0;}
	public Point(int x, int y) {this.x=x; this.y=y;}
}
