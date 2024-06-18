package school;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class temp extends JFrame{
	ButtonGroup g= new ButtonGroup();	//버튼 그룹 객체 생성
	JRadioButton[] rb= new JRadioButton[3]; String str[]= {"사과", "배","체리"};
	JLabel la= new JLabel("선택한 과일: ");
	temp(){
		setTitle("라디오버튼"); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(235,150); Container cp=getContentPane();
		cp.setLayout(new FlowLayout()); setVisible(true);
		
		MyItem lin=new MyItem();
		for(int i=0; i<rb.length; i++) {
			rb[i]=new JRadioButton(str[i]);	
			g.add(rb[i]); cp.add(rb[i]);	// 버튼그룹과 컨텐트팬에 삽입
			rb[i].addItemListener(lin);
		}
		cp.add(la); 
	}
	class MyItem implements ItemListener{
		@Override	
		public void itemStateChanged(ItemEvent e) {
			if(e.getItem()==rb[0])la.setText("선택한 과일:"+str[0]);
			else if(e.getItem()==rb[1])la.setText("선택한 과일:"+str[1]);
			else la.setText("선택한 과일:"+str[2]);
		}
	}
	public static void main(String[] args) {new temp();}
}
