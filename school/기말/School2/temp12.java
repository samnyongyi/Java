package school;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class temp12 extends JFrame{
	JButton[] btns= new JButton[3];
	String[] strs= {"0:가위","1:바위", "2:보"};
	JLabel laResult=new JLabel("인간:컴퓨터");	
	temp12(){
		this.setTitle("[조동현]");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);
		Container cp=getContentPane();
		
		cp.add(new JLabel("아래의 버튼 중 하나를 클릭하시오"), BorderLayout.NORTH);
		JPanel p1=new JPanel(); p1.setLayout(new GridLayout(1,3));
		for(int i=0; i<btns.length; i++) {
			btns[i]=new JButton(strs[i]);
			p1.add(btns[i]);
		}
		cp.add(p1);
		JPanel p2=new JPanel(); p2.setBackground(Color.WHITE);
		p2.add(laResult);
		cp.add(p2,BorderLayout.SOUTH);		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new temp12();
	}
}