package school;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class temp3 extends JFrame{
	public temp3() {
		setTitle("실습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(350,350); setVisible(true);
	}
	class MyPanel extends JPanel implements Runnable{
		private int x=100, y=100;
		public MyPanel() {new Thread(this).start();}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			g.drawOval(x, y, 50, 50);	// 타원 그리기
		}
		@Override
		public void run() {
			while(true) {
				try {Thread.sleep(500);} catch(InterruptedException e) {return;}
				x = (int)( Math.random() * (getWidth() -60));
				y = (int)( Math.random() * (getHeight() -60));
				repaint();
			}
		}
	}
	public static void main(String[] args) {new temp3();}
}