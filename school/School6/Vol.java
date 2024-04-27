package school;

public class Vol extends Rect {
	private int depth;
	
	public int getDepth() {return this.depth;}
	
	public Vol(int a, int b, int c) {
		super(a,b);
		this.depth=c;
	}
	public int volume() {
		return this.getheight()*this.getwidth()*this.depth;
	}
}
