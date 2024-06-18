package school;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Temp3 extends JFrame{
	JTextField tf = new JTextField(10); JButton btn=new JButton("출력");
	Temp3(){
		setTitle("조동현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,400); setContentPane(new MyPanel());
		Container cp=getContentPane(); cp.add(tf); cp.add(btn);
		tf.addActionListener(new MyAction()); btn.addActionListener(new MyAction());
		setVisible(true);
	}
	class MyPanel extends JPanel{
		ImageIcon icon=new ImageIcon("Images/b.jpg");
		Image img=icon.getImage();
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g); g.drawImage(img,0,0,getWidth(),getHeight(),this);
		}
	}
	class MyAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String s=tf.getText().toString();
			JOptionPane.showMessageDialog(null,  "입력한 내용:"+s,"내용확인", JOptionPane.INFORMATION_MESSAGE);
			tf.setText("");tf.requestFocus();
		}
	}
	public static void main(String[] args) {new Temp3();}
}
