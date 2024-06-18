package school;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp10 extends JFrame {
	temp10() {
		setTitle("[조동현]배치관리자 null");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 200);
		Container cp = getContentPane();
		cp.setLayout(null);  
		for(int i=0; i<20; i++) {
			JLabel label = new JLabel(Integer.toString(i)); 
			int x = (int)(Math.random()*(this.getWidth()-50));
			int y = (int)(Math.random()*(this.getHeight()-50));
			label.setLocation(x,y); 
			label.setSize(20,20); 
			label.setForeground(Color.MAGENTA); 
			cp.add(label);
		}
		setVisible(true);
	}
	public static void main(String[] args) { new temp10(); }
}
