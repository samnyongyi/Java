package school5;

public class Movie {
	String title;
	double score;
	int year;
	public Movie() {
		this.title="파묘"; this.score=4.5; this.year=2023;
	}
	public Movie(String t, double s, int y) {
		this.title=t; this.score=s; this.year=y;
	}
	public void print() {
		System.out.println("제목: "+title+", 평점="+score+", 연도="+year);
	}
}
