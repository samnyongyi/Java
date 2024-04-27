package school;

public class CircleManager {
	public static void copy(Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	public static boolean equals(Circle a, Circle b) {
		if(a.getRadius()==b.getRadius()) return true;
		else return false;
	}
}
