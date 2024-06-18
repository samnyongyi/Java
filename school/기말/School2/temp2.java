package school;

import java.awt.Container;	//Ctrl Shift O

import javax.swing.JFrame;

public class temp2 extends JFrame{
	temp2(){
		this.setTitle("첫번째 프레임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		Container cp=getContentPane();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new temp2();
	}

}
