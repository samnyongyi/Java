package school;

interface PhoneInterface{	// 필드 선언 불가, (public) interface
// 상수: public만 허용, public/ static/ final 생략 가능
// 추상 메소드: public abstract 생략 가능
// default 메소드: public 접근 지정만 허용, 생략가능
// private 메소드: 인터페이스 내에 메소드 코드가 작성되어야 하며 인터페이스내에 있는 다른 메소드에 의해서만 호출가능
// static 메소드: public/ private 지정 가능, 생략시 private
	final int TIMEOUT=10000;	// 상수, (public static final) int
	void sendCall();	// (public static final) void
	void receiveCall();	// (abstract public) void
	default void printLogo() {	// default 명시필요
		System.out.println("**Phone**");
	}
// 인터페이스는 객체 생성 불가하지만 인터페이스 타입의 레퍼런스 변수 선언은 가능
	// new PhoneInterface();	// 컴파일 오류
	//PhoneInterface A;	// A는 인터페이스에 대한 래퍼런스 변수
// extends로 상속이 가능하며 다중 상속 허용
}
class SamsungPhone implements PhoneInterface{	// 인터페이스 구현
	// PhoneInterface의 모든 메소드 구현
	@Override
	public void sendCall() {System.out.println("띠리리리링");}
	@Override
	public void receiveCall() {System.out.println("전화가 왔습니다");}
	public void flash() {System.out.println("전화기에 불이 들어왔습니다");}	// 메소드 추가 작성
}
public class temp5 {

	public static void main(String[] args) {
		SamsungPhone phone=new SamsungPhone();
		phone.printLogo(); phone.sendCall();
		phone.receiveCall(); phone.flash();
	}
}
