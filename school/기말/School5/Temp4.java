package school;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Temp4 extends JFrame{
	Temp4(){
		setTitle("repaint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,300); setVisible(true);
	}
	public static void main(String[] args) {new Temp4();}
	class MyPanel extends JPanel{
		Point start=null, end=null;	// 마우스의 시작점과 끝점
		public MyPanel() {
			MyMouseListener listener=new MyMouseListener();	// listener를 아래 두 리스너로 공통 등록
			addMouseListener(listener);
			addMouseMotionListener(listener);
		}
		class MyMouseListener extends MouseAdapter{
			@Override
			public void mousePressed(MouseEvent e) {start=e.getPoint();}
			@Override
			public void mouseDragged(MouseEvent e) {
				end=e.getPoint();
				repaint();	// 패널의 그리기 요청 주목
// repaint() 호출시 자바 플랫폼에 의해 MyPanel의 paintComponent()가 호출되며 여기서 start와 end 사이의 타원을 그린다
			}
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(start==null) return;	// 타원 미생성
			g.setColor(Color.BLUE);
			int x=Math.min(start.x, end.x);
			int y=Math.min(start.y, end.y);
			int width=Math.abs(start.x-end.x);
			int height=Math.abs(start.y-end.y);
			g.drawOval(x, y, width, height);	// 타원 그리기
		}
	}
}
