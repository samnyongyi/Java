package school;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Temp extends JFrame{
	Temp(){
		setTitle("조동현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel()); setSize(250, 450); setVisible(true);
	}
	class MyPanel extends JPanel{
		@Override
	 	public void paintComponent(Graphics g) {	// 오버라이딩 메뉴사용
			super.paintComponent(g);	// 부모의 잔상 제거
			g.setColor(Color.RED);
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How much?", 30, 70);
			g.drawRect(10,10,50,50); 
			g.setColor(Color.BLUE); g.drawOval(10,70,50,50); 
			g.setColor(Color.GREEN); g.fillRoundRect(10,130,50,50,20,20); 
			g.setColor(Color.MAGENTA);g.fillArc(10,190,50,50,0,270); 
			g.setColor(Color.ORANGE);
	 		
			int []x ={30,10,30,60}; int []y ={250,275,300,275};
	 		g.fillPolygon(x, y, 4); 
	 	}
	 }
	 public static void main(String [] args) { new Temp(); } 
}

