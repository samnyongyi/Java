package school;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp6 extends JFrame {
	String [] fruits = {"apple", "banana", "mango"}; 
	ImageIcon [] images = { new ImageIcon("images/apple.jpg"),new ImageIcon("images/banana.jpg"), new ImageIcon("images/mango.jpg") };
	JLabel imgLabel = new JLabel(images[0]);
	JComboBox<String> combo = new JComboBox<>(fruits); 
	temp6() {
		setTitle("JComboBox"); Container c = getContentPane();
		c.setLayout(new FlowLayout()); c.add(combo); c.add(imgLabel);
		// 콤보박스에 Action 리스너 등록. 선택된 아이템의 이미지 출력
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = combo.getSelectedIndex(); 
				imgLabel.setIcon(images[index]); 
			}
		});
		setSize(300,250); setVisible(true);
	}
	public static void main(String [] args) { new temp6();}
}


