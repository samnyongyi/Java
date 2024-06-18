package school;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class temp4 extends JFrame{
	temp4(){
		this.setTitle("조동현");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,500);
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		this.setVisible(true);
		
		ImageIcon img=new ImageIcon("images/image.jpg");
		JLabel imageLabel=new JLabel(img);
		
		ImageIcon icon=new ImageIcon("images/icon.gif");
		JLabel label=new JLabel("아이콘", icon, SwingConstants.CENTER);
		cp.add(imageLabel); cp.add(label);
	}
	public static void main(String[] args) {new temp4();}
}
