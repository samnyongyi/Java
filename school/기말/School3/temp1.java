package school;

import java.awt.Container; import java.awt.FlowLayout;
import java.awt.event.ActionEvent; import java.awt.event.ActionListener;

import javax.swing.JButton; import javax.swing.JFrame;

public class temp1 extends JFrame{
	JButton btn= new JButton("Action");
	temp1(){
		this.setTitle("Action 이벤트 리스너 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(250,120);
		Container cp=this.getContentPane();
		cp.setLayout(new FlowLayout());
		this.setVisible(true);
		
		cp.add(btn);// 버튼에 액션리스너 처리(리스너 선택)
		btn.addActionListener(new MyAction());	// 리스너 인스턴스 생성과 등록, 대상 컴포넌트에 리스너 연결
	}
	class MyAction implements ActionListener{	// 내부 클래스로 작성, 리스너 상속(인터페이스 구현)
		@Override	// 작성 필수
		public void actionPerformed(ActionEvent e) {	//JButton b=(JButton)e.getSource();
			if(btn.getText().equals("Action"))btn.setText("액션");
			else btn.setText("Action");
		}
	}
	public static void main(String[] args) {new temp1();}
	
}
