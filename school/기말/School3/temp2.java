package school;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class temp2 extends JFrame{
	//컴포넌트는 주로 필드에 선언
	JTextField tf1=new JTextField("0",5); 
	JTextField tf2=new JTextField("0",5);
	JButton btn= new JButton("=");
	JLabel la= new JLabel("0");
	temp2(){
		this.setTitle("액션리스너");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350,120);
		Container cp=this.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(tf1);
		cp.add(new JLabel("+"));
		cp.add(tf2);
		cp.add(btn);
		cp.add(la);
		btn.addActionListener(new MyAction());	//3. 리스너 등록
		this.setVisible(true);
	}
	// 1. 리스너 선택(액션, 마우스, 키, 아이템)->액션
	//2. 리스너 구현(액션:ActionListener 추상 매서드 구현)
	//3. 리스너를 동작처리 할 컴포넌트(버튼)에 연결(등록):addXXXListener
	class MyAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int x=Integer.parseInt(tf1.getText().toString());
			int y=Integer.parseInt(tf2.getText().toString());
			la.setText(""+(x+y));	//Integer.toString(s+y)
		}
	}
	public static void main(String[] args) {
		new temp2();
	}
}
