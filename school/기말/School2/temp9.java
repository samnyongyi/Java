package school;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp9 extends JFrame{
	temp9(){
		this.setTitle("[조동현]Flow");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);	
		Container cp=getContentPane();
		
		cp.setLayout(new FlowLayout());
		
		cp.add(new JLabel("100+200"));
		cp.add(new JButton("="));
		cp.add(new JLabel("300"));
		setVisible(true);
	}
	public static void main(String[] args) {new temp9(); }
}