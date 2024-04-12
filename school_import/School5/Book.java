package school5;

public class Book {
	String title;
	String author;
	
	public void print() {System.out.println("제목:"+title+", 저자:"+author);}
	public Book(String t) {
		title=t; author="작가미상";
	}
	public Book(String t, String a) {
		title=t; author=a;
	}	
	
	//temp6에 추가로 쓰이는 소스
	void show() {System.out.println(title+" " +author);}
	public Book() {
		this("","");
		System.out.println("생성자 호출됨");
	}
}
