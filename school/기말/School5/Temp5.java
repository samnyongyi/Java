package school;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Temp5 extends JFrame{
	Vector<Point> vStart = new Vector<>(); Vector<Point> vEnd = new Vector<>();
	Color c= new Color(0,0,255);	// 색상 blue 세팅
	Temp5(){
		setTitle("조동현"); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setContentPane(new MyPanel()); setSize(300, 300); setVisible(true);
	}
	class MyPanel extends JPanel{
		public MyPanel() { this.addMouseListener( new MyMouse() ); }
		class MyMouse extends MouseAdapter{
			@Override
			public void mousePressed(MouseEvent e) { Point startP = e.getPoint(); vStart.add(startP); }
			@Override
			public void mouseReleased(MouseEvent e) {
				Point endP = e.getPoint(); vEnd.add(endP); repaint();	// 패널의 다시 그리기를 요청
			}
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g); g.setColor(c);	// 색상 c변수로 세팅 
			for(int i=0; i<vStart.size(); i++) {
				Point s = vStart.get(i); Point e = vEnd.get(i);
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}

	public static void main(String[] args) {new Temp5();}

}


