package school;

public class Card {
	private String kind;
	private int num;
	public static int width=100, height=250;

	public Card() { kind="Spade"; num=1;}
	public Card(String kind, int num) { this.kind=kind; this.num=num;}
	public void showInfo() {System.out.println(kind+"숫자: "+num);}
	public void showSize() {System.out.println(" 카드 사이즈: "+width+"X"+height);}
	public static void setSize(int w, int h) { width=w; height=h;}	// static이 아닌 변수로 매개변수, 함수내용 확인
}
