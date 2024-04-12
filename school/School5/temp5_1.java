package school5;

public class temp5_1 {

	public static void main(String[] args) {
		Boiler b1=new Boiler();Boiler b2=new Boiler(10);
		System.out.println(b1.getTemp());
		b1.setTemp(1);
		System.out.println(b1.getTemp());
		System.out.println(b2.getTemp());

	}

}
