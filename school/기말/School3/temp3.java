package school;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp3 extends JFrame{
	JLabel la=new JLabel("Hello");
	temp3(){
		this.setTitle("Mouse이벤트 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200,200); this.setVisible(true);
		Container cp=getContentPane();
		
		cp.addMouseListener(new MyMouse());
		cp.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		cp.add(la);
	}
	class MyMouse extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x,y);;
		}
	}
	/*
	class MyMouseListener implements MouseListener {
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}*/
	public static void main(String[] args) {new temp3();}
}


