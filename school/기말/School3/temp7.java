package school;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp7 extends JFrame{
	JLabel la=new JLabel("실습2");
	Container cp=getContentPane();
	temp7(){
		this.setTitle("조동현, 마우스 이벤트 실습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setLayout(new FlowLayout());
		cp.setBackground(Color.GREEN);
		this.setSize(250,250);
		this.setVisible(true);
		cp.add(la);
		
		MyMouseListener ml=new MyMouseListener();
		cp.addMouseListener(ml);
		cp.addMouseMotionListener(ml);
	}
	class MyMouseListener extends MouseAdapter{
		@Override
		public void mouseDragged(MouseEvent e) {
			cp.setBackground(Color.YELLOW);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			cp.setBackground(Color.GREEN);
		}
	}
	public static void main(String[] args) {
		new temp7();
	}
}
