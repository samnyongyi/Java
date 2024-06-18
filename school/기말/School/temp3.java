package school;

import java.util.Random;

public class temp3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		sb.append(" is pencil."); // sb = "This is pencil."
		sb.insert(7, " my"); // sb = "This is my pencil."
		sb.replace(8, 10, "your"); // sb = "This is your pencil."
		System.out.println(sb); // "This is your pencil." 출력
		
		System.out.println(Math.abs(-3.14)); // 절댓값 구하기
		System.out.println(Math.sqrt(9.0)); // 9의 제곱근 = 3
		System.out.println(Math.exp(2)); // e2
		System.out.println(Math.round(3.14)); // 반올림
		Random r = new Random();
		int n = r.nextInt(); // 음수, 양수, 0 포함, 자바의 정수 범위 난수 발생
		int m = r.nextInt(100)+1; // 0에서 99 사이(0과 99 포함)의 정수 난수 발생	
	}
}
