package school;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp9 extends JFrame {
	JCheckBox[] fruits = new JCheckBox [3]; 
	String[] names = {"사과", "배", "체리"}; 
	JLabel sumLabel=new JLabel("현재 0 원 입니다.");
	temp9() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,200);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		setVisible(true);
		
		cp.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		MyItem listener = new MyItem ();	
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); 
			fruits[i].setBorderPainted(true);	// 체크 박스의 테두리 표시
			cp.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		cp.add(sumLabel);
	}
	class MyItem implements ItemListener {
		int sum = 0; // 가격의 합
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) { 
				if(e.getItem() == fruits[0]) sum += 100;
				else if(e.getItem() == fruits[1]) sum += 500;
				else sum += 20000;
			}
			else {
				if(e.getItem() == fruits[0]) sum -= 100;
				else if(e.getItem() == fruits[1]) sum -= 500;
				else sum -= 20000;
			}
			sumLabel.setText("현재 " + sum + "원 입니다."); 
		}
	}
	public static void main(String[] args) {new temp9();}
}
