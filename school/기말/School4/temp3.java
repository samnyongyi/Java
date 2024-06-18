package school;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class temp3 extends JFrame{
	JCheckBox[] cb=new JCheckBox[2];
	Label la=new Label();
	String[] names={"버튼 비활성화","버튼 감추기"};
	JButton btn=new JButton("test button");
	temp3(){
		this.setTitle("조동현 4번 실습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(250,150);
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		
		MyItem listener=new MyItem();
		for(int i=0; i<cb.length; i++) {
			cb[i]=new JCheckBox(names[i]);
			cp.add(cb[i]); cb[i].addItemListener(listener);
		}
		cp.add(btn);
		cp.add(la);
		this.setVisible(true);
	}
	class MyItem implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()==cb[0]) btn.setEnabled(false);
				else {btn.setVisible(false); la.setText("버튼이 감춰졌습니다");}
			}
			else { if(e.getItem()==cb[0]) btn.setEnabled(true); 
			else {btn.setVisible(true); la.setText("");}
			}
		}
	}
	public static void main(String[] args) {new temp3();}
}
