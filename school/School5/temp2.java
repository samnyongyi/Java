package school5;

public class temp2 {

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory= new Book("춘향전");
		System.out.println(littlePrince.title+" " +littlePrince.author);
		System.out.println(loveStory.title+" " +loveStory.author);
		littlePrince.print(); loveStory.print();
	}
}
