package school_import;

public class School2_1 {
	public static final double PI=3.14;	// 21버전부터는 main함수 밖에 입력
	// final 키워드 사용시 실행중 값 변경 불가, 주로 static과 함께 작성
	
	public static void main(String[] args) {
		double radius = 10.2;
		double circleArea = radius*radius*PI;
		
		System.out.println("반지름 : " + radius);
		System.out.println("원 넓이 : " + circleArea);
	}
}
