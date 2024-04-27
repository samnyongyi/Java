package school;

public class temp4 {

	public static void main(String[] args) {
		Circle pizza=new Circle(5);
		Circle waffle=new Circle(1);
		boolean res=CircleManager.equals(pizza, waffle);
		if(res==true)
			System.out.println("pizza와 waffle의 크기 동일");
		else 
			System.out.println("pizza와 waffle의 크기 다름");
		CircleManager.copy(pizza, waffle);
		res=CircleManager.equals(pizza, waffle);
		if(res==true)
			System.out.println("pizza와 waffle의 크기 동일");
		else
			System.out.println("pizza와 waffle의 크기 다름");
	}
}
