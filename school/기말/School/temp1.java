package school;
// java.lang 패키지는 가장 기본이 되는 클래스와 인터페이스 보관을 하므로 import문 없이 사용
// 그 중 object 클래스는 모든 자바 클래스가 반드시 상속받도록 자동 컴파일
class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x=x; this.y=y;
	}
	//Source에서 Override/Implements~ 선택
	@Override	// toString() 기본내용: 패키지 이름.클래스이름@해시코드
	public String toString() {	//object 클래스의 toString()메소드 오버라이딩
	// 재정의하지 않는 경우 디폴트 문자열 값은 "클래스 이름@해쉬코드값"으로 리턴
		//return "Point("+x+","+"y"+")";
		return "("+x+","+y+")";	// temp7에서 사용
	}
	@Override
	public boolean equals(Object obj) {	//Object obj=b;	//업캐스팅
		Point b=(Point)obj;	// 다운캐스팅
		if(x==b.x &&y==b.y)return true;
		return false;
	}
	
}
public class temp1 {
	
	public static void main(String[] args) {
		Point p= new Point(2,3);
		
		String s = p.toString() + "점";	// String= a+"점";
		System.out.println(p.toString());	// System.out.println(s);
		
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());	// p는 p.toString()으로 자동 변환
		System.out.println(p);
		
		Point P= new Point(3,3);
		System.out.println("p와 P비교= "+p.equals(P));
	}

}
