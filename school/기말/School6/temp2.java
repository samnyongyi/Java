package school;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyLabel extends JLabel {
	int maxBarSize; int barSize = 0; // 바의 크기
	MyLabel(int maxBarSize) { this.maxBarSize = maxBarSize; }
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g); g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth())) / maxBarSize*barSize);
		if(width==0) return; 
		g.fillRect(0, 0, width, this.getHeight());
	}
	synchronized void fill() {
		if(barSize == maxBarSize) {
			try {wait(); } catch (InterruptedException e) { return; }
		}barSize++; repaint(); notify(); // 바 다시 그리기
	}
	synchronized void consume() {
		if(barSize == 0) {
			try {wait(); } catch (InterruptedException e) { return; }
		}barSize--; repaint(); notify(); // 바 다시 그리기
	}
}
class ConsumerThread extends Thread {
	MyLabel bar;
	ConsumerThread(MyLabel bar) { this.bar = bar; }
	@Override
	public void run() {
		while(true) {
			try { sleep(200); bar.consume(); 
			} catch (InterruptedException e) { return; }
		} 
	}
}
public class temp2 extends JFrame {	//MyLabel, ConsumerThread 클래스 정의 필요
	MyLabel bar = new MyLabel(100);
	temp2() {
		setTitle("조동현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); bar.setBackground(Color.ORANGE);
		bar.setOpaque(true); bar.setLocation(20, 50);
		bar.setSize(300, 20); c.add(bar);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) { bar.fill(); }
		});
		setSize(350,200); setVisible(true);
		c.setFocusable(true); c.requestFocus(); 
		ConsumerThread th = new ConsumerThread(bar); 
		th.start(); // 스레드 시작
	}
	public static void main(String[] args) { new temp2( ); }
}
