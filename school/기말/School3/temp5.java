package school;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp5 extends JFrame{
	JLabel la=new JLabel("HELLO");
	temp5(){
		this.setTitle("키를 이용하여 텍스트 움직이기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		Container cp=getContentPane();
		setVisible(true);
		
		cp.setLayout(null);
		cp.addKeyListener(new MyKey());
		la.setLocation(50,50); la.setSize(100,20);
		cp.add(la);
		//포커스 지정
		cp.setFocusable(true);
		cp.requestFocus();
	}
	class MyKey extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode=e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(),la.getY()-10);break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(),la.getY()+10);break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-10,la.getY());break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+10,la.getY());break;
			}
		}
	}
	public static void main(String[] args) {new temp5();}
}
