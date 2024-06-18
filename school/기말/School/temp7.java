package school;

import java.util.ArrayList;

public class temp7 {

	public static void main(String[] args) {
		ArrayList<Point>arr= new ArrayList<>();
		arr.add(new Point(2,3));
		arr.add(new Point(-5,20));
		arr.add(new Point(30,-8));
		
		arr.remove(1);
		
		for(int i=0; i<arr.size(); i++) {
			Point p=arr.get(i);
			System.out.println(p);
		}
	}

}
