package school;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp4 extends JFrame{
	JLabel la= new JLabel("<Enter>키로 배경색이 바뀝니다.");
	Container cp=getContentPane();
	temp4(){
		this.setTitle("keyListener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(250,150);
		cp.setLayout(new FlowLayout());
		setVisible(true);
		
		cp.add(la);
		cp.addKeyListener(new MyKey());
		//컨텐트팬에 포커스 설정
		cp.setFocusable(true);
		cp.requestFocus();
	}
	class MyKey extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			//임의의 색을 만들기 위해 랜덤하게 r,g,b성분 생성
			int r=(int)(Math.random()*256); int g=(int)(Math.random()*256); int b=(int)(Math.random()*256);
			switch(e.getKeyChar()) {	// 입력된 키 문자
			case '\n':	// <Enter>키 입력
				la.setText("r="+r+",g="+g+",b="+b);
				cp.setBackground(new Color(r,g,b));
				break;
			case 'q': System.exit(0);
			}
		}
	}
	public static void main(String[] args) {new temp4();}
}


