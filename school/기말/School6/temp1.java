package school;

public class temp1 {

	public static void main(String[] args) {
		SharedPrinter p= new SharedPrinter();	// 공유 데이터 생성
		String[] engText= {"Wise men say, ", "only fools rush in", 
				"But I can't help", "falling in love with you", 
				"Shall I stay?", "Would it be a sin?", "If I can't help, ",
				"falling in love with you"};
		String[] korText= {"동해물과 백두산이 마르고 닳도록, ", 
				"하느님이 보우하사 우리나라 만세",
				"무궁화 삼천리 화려강산",
				"대한 사람 대한으로 길이 보전하세",
				"남산 위에 저 소나무, 철갑을 두른 듯",
				"바람서리 불변함은 우리 기상일세.",
				"무궁화 삼천리 화려강산, ",
				"대한 사람 대한으로 길이 보전하세"};
		Thread th1= new WorkerThread(p,engText);	// 영문출력스레드
		Thread th2=new WorkerThread(p,korText);	// 국문출력스레드
		
		th1.start(); th2.start();
		}
	}
class SharedPrinter{	// 두 WorkerThread 스레드에 의해 동시 접근되는 공유 프린터
	synchronized void print(String text[]) {	// synchronized 생략시 한글과 영어가 한줄에 섞여 출력되는 경우 발생
		for(int i=0; i<text.length; i++) {
			for(int j=0; j<text[i].length(); j++) System.out.print(text[i].charAt(j));;
			System.out.println();
		}
	}
}
class WorkerThread extends Thread{	// 스레드 클래스
	SharedPrinter p;	// 공유 프린터 주소
	String[] text;
	WorkerThread(SharedPrinter p, String[] text){this.p=p; this.text=text;}
	@Override	// 스레드는 반복적으로 공유 프린터에 10번 접근, text[] 출력
	public void run() {p.print(text);}	// 공유 프린터에 출력
}

