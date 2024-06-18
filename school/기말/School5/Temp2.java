package school;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Temp2 extends JFrame{
	Temp2(){
		setTitle("JPanel 크기에 맞추어 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		Container cp=getContentPane();
		cp.add(new JLabel("배경이미지 들어감"));
		setSize(200,300); setVisible(true);
	}
	class MyPanel extends JPanel{
		ImageIcon icon=new ImageIcon("images/img0.jpg");
		Image img=icon.getImage();
		@Override	
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,0,0,getWidth(),getHeight(),this);
			// getWidth(), getHeight()로 패널의 폭과 높이를 산출
		}
	}
	public static void main(String[] args) {new Temp2();}

}
