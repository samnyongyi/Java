package school;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp7 extends JFrame {
	temp7() {
		setTitle("배치관리자 null");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		cp.setLayout(null);	// 컨텐트팬의 배치관리자 제거
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50); 
		la.setSize(200, 20); 
// void setSize(int width, int height) // 컴포넌트 크기 설정
// void setLocation(int x, int y) // 컴포넌트 위치 설정
// void setBounds(int x, int y, int width, int height) // 위치와 크기 동시 설정
		cp.add(la); 
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); 
			b.setLocation(i*15, i*15); 
			b.setSize(50, 20); 
			cp.add(b); 
		}
		// 사용자가 setLocation과 setSize를 사용하여 크기와 위치를 직접 설정해주었기에 화면 출력가능
		setSize(300, 200); setVisible(true);
	}
	public static void main(String[] args) { new temp7(); }
}