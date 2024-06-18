package school;

import java.awt.Color;import java.awt.Container;import java.awt.FlowLayout;
import javax.swing.JButton;import javax.swing.JFrame;

public class temp3 extends JFrame{
	temp3(){
		this.setTitle("[조동현]CP&JFrame 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,150);
		Container cp=getContentPane();
		this.setVisible(true);
		
		cp.setBackground(Color.ORANGE);	// 배경색을 오렌지색으로 설정
		cp.setLayout(new FlowLayout());	// 컨텐트팬에 FlowLayout, 주석처리시 배치모양 변경
		
		cp.add(new JButton("OK"));
		cp.add(new JButton("Cancel"));
		cp.add(new JButton("Ignore"));
		setVisible(true);
	}
	public static void main(String[] args) {new temp3();}
}



