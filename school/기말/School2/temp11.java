package school;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp11 extends JFrame {
	public temp11() {
		super("[조동현]grid");setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		cp.setLayout(new GridLayout(4, 4));
		Color[] color= {Color.RED, Color.ORANGE, Color.YELLOW,Color.GREEN, Color.CYAN,Color.BLUE,Color.MAGENTA,Color.GRAY,Color.PINK,Color.LIGHT_GRAY};
		
		for(int i=0; i<16; i++) { 
			JLabel la = new JLabel(Integer.toString(i));
			la.setOpaque(true);	// 불투명도를 true로 설정, 배경색 보유 가능
			la.setBackground(color[i%10]); 
			cp.add(la); 
		}
		setVisible(true);
	}
	public static void main(String[] args) {new temp11(); }
}