package school;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class temp4 extends JFrame{
	temp4(){
		this.setTitle("첫번째 프레임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);
		Container cp=getContentPane();
		this.setVisible(true);
	
		cp.setBackground(Color.ORANGE);
		cp.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));	// 주석처리시 배치모양 변경
		
		cp.add(new JButton("add"));
		cp.add(new JButton("sub"));
		cp.add(new JButton("mul"));
		cp.add(new JButton("div"));
		cp.add(new JButton("Calculate"));
		setVisible(true);

	}
	public static void main(String[] args) {
		new temp4();
	}

}
