package school;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {
	JLabel timerLabel;	// 타이머 값이 출력되는 레이블
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; 
	}
	@Override
	public void run() {	// 스레드 코드, run() 종료시 스레드 종료
		int n=0; 
		while(true) {
			timerLabel.setText(Integer.toString(n)); 
			n++;
			try {Thread.sleep(1000);}	// 1초동안 잠을 잔다
			catch(InterruptedException e) { return;}
		}
	}
}
public class Temp7 extends JFrame {
	public Temp7() {
		setTitle("Thread");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();	// 타이머 값을 출력할 레이블 생성1
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		JLabel timerLabel2 = new JLabel();	// 타이머 값을 출력할 레이블 생성2
		timerLabel2.setFont(new Font("Gothic", Font.ITALIC, 40));
		c.add(timerLabel2);
		
		TimerThread th = new TimerThread(timerLabel);
		TimerThread th2 = new TimerThread(timerLabel2);
		setSize(250,150); setVisible(true);
		th.start();	// 타이머 스레드의 실행을 시작하게 한다
		th2.start();	// 타이머 스레드의 실행을 시작하게 한다
	}
	public static void main(String[] args) { new Temp7(); }
}
