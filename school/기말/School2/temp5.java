package school;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class temp5  extends JFrame{
	temp5(){
		this.setTitle("[조동현]BorderLayout 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);
		Container cp=getContentPane();
		
		cp.setLayout(new BorderLayout(30,20));
// BorderLayout(int hGap, int vGap)
// hGap : 좌우 두 컴포넌트 사이의 수평 간격, 픽셀 단위(디폴트 : 0)
// vGap : 상하 두 컴포넌트 사이의 수직 간격, 픽셀 단위(디폴트 : 0)
		cp.add(new JButton("add"), BorderLayout.NORTH);
		cp.add(new JButton("sub"), BorderLayout.SOUTH);
		cp.add(new JButton("mul"), BorderLayout.EAST);
		cp.add(new JButton("div"), BorderLayout.WEST);
		cp.add(new JButton("Calculate"), BorderLayout.CENTER);
// add()메소드:  void add(Component comp, int index)
// comp 컴포넌트를 index 위치에 삽입
// index : 컴포넌트의 위치
		setVisible(true);
	}
	public static void main(String[] args) {new temp5();}
}
