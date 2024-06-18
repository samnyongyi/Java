package school;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class temp8 extends JFrame{
	temp8(){
		this.setTitle("[조동현]Border");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);
		Container cp=getContentPane();

		cp.setLayout(new BorderLayout(5,5));
		cp.add(new JButton("NORTH"), BorderLayout.NORTH);
		cp.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		cp.add(new JButton("WEST"), BorderLayout.WEST);
		cp.add(new JButton("CENTER"), BorderLayout.CENTER);
		setVisible(true);

	}
	public static void main(String[] args) {
		new temp8();
	}

}
