package school5;

public class Dog {
	String breed;
	int age;
	String color;
	public void print() {
		System.out.println("종="+breed+", 나이="+age+", 색상="+color);
	}
	public void barking() {
		System.out.println(breed+"가 멍멍 짖는다");
	}
	public void eat(String food) {
		System.out.println(breed+"가 "+food+"를 먹는다");
	}
	public Dog() {
		breed="푸들"; age=1; color="믹스";
	}
	public Dog(String b, int a, String c) {
		this.breed=b; this.age=a; this.color=c;
	}
}
