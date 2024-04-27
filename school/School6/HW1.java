package school;
/*
class Rect {
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

class Vol extends Rect {
	private int depth;
	
	public int getDepth() {return this.depth;}
	
	public Vol(int a, int b, int c) {
		super(a,b);
		this.depth=c;
	}
	public int volume() {
		return this.getheight()*this.getwidth()*this.depth;
	}
}*/

public class HW1 {
	
	public static void main(String[] args) {
		Rect r = new Rect(); Vol v= new Vol(2,2,2);
		System.out.println("가로"+r.getwidth()+",높이: "+r.getheight());
		System.out.println("가로"+v.getDepth()+",높이: "+v.volume());
		

	}

}
