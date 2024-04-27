package school;

class Rect2 {
	private int width, height;
	public Rect2(int width, int height) {this.width=width;this.height=height;}
	public Rect2() {this.height=1;this.width=1;}
	public int around() {return 2*(this.height+this.width);}
	public int getArea() {return width*height;}
	
	public int getwidth() {return width;}
	public int getheight() { return height;}
	public void setwidth(int n) {this.width=n;}
	public void setheight(int n) {this.height=n;}	
}

class Vol extends Rect2 {
	private int depth;
	public int getDepth() {return this.depth;}
//	public Vol() {depth=1;}	// 미필수
	public Vol(int a, int b, int c) {
		super(a,b);
		this.depth=c;
	}
	public int volume() { return getArea()*depth; }
	@Override
	public int around() { return super.around()*2+depth*4;}
}

public class temp3 {

	public static void main(String[] args) {
		Rect2 r= new Rect2(); Vol v= new Vol(2,2,2);
		System.out.println("가로: "+ r.getwidth()+", 높이: "+ r.getheight());
		System.out.println("깊이: "+ v.getDepth()+", 부피: "+ v.volume());
		System.out.println("사각형둘레: "+ r.around()+", 직육면체둘레: "+ v.around());
	}
}
