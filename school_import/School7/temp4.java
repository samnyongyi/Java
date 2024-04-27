package school;

abstract class Calc{	// 추상 메소드를 가진 추상 클래스
// 온전한 클래스가 아니기에 인스턴스를 생성 불가능 	
	// Calc c= new Calc();	// 컴파일 오류
/*	컴파일 오류
 	Calc c;
	c=new Calc();
*/
// 추상 메소드가 없는 추상 클래스도 존재
	public abstract int add(int a, int b);	// 추상 메소드, 메소드의 코드는 없고 원형만 선언되어있는 형태
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

public class temp4 extends Calc{
	@Override	// 메소드 오버라이딩, 자식 클래스에서 부모클래스의 메소드 중복 작성
// 항상 오버라이딩한 메소드가 실행되도록 보장
// 메소드 오버라이딩: 슈퍼 클래스의 메소드를 동일한 이름으로 서브 클래스마다 다르게 구현
	public int add(int a, int b){return a+b;}
	@Override
	public int subtract(int a, int b) {return a-b;}
	@Override
	public double average(int[] a) {
		double sum=0;
		for(int i=0; i<a.length; i++)sum+=a[i];
		return sum/a.length;
	}
	public static void main(String[] args) {
		temp4 c= new temp4();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int[] {2,3,4}));
	}
}




