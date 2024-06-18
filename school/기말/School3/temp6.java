package school;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp6 extends JFrame{
	JLabel la=new JLabel("Move Me");
	Container cp=getContentPane();
	temp6(){
		this.setTitle("마우스 이벤트 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,200);
		this.setVisible(true);
		
		MyMouse listener=new MyMouse();
		cp.addMouseListener(listener);
		cp.addMouseMotionListener(listener);
		la.setSize(80,20); la.setLocation(100,80);
		cp.add(la);
	}
	class MyMouse extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			la.setLocation(e.getX(), e.getY()); 
			setTitle("mousePressed("+e.getX()+","+e.getY()+")"); 
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			/*if(e.getClickCount()==2){}*/}	// 더블 클릭 처리 루틴
		public void mouseEntered(MouseEvent e) {
			cp.setBackground(Color.CYAN);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			cp.setBackground(Color.YELLOW);
		}
		@Override
		public void mouseDragged(MouseEvent e) { 
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseDragged("+e.getX()+","+e.getY()+")"); 
		}
		@Override
		public void mouseMoved(MouseEvent e) { 
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseMoved ("+e.getX()+","+e.getY()+")"); 
		}
	}
	public static void main(String[] args) {new temp6();}
}
