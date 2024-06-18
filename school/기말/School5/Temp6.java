package school;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Temp6 extends JFrame{
	Vector<Point> vStart = new Vector<>(); Vector<Point> vEnd = new Vector<>();
	Color c;
	Temp6(){
		setTitle("선 그리기"); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel()); createMenu(); setSize(300, 300); setVisible(true);
	}
	class MyPanel extends JPanel{
		public MyPanel() { this.addMouseListener( new MyMouse() ); }
		class MyMouse extends MouseAdapter{
			@Override
			public void mousePressed(MouseEvent e) { Point startP = e.getPoint(); vStart.add(startP); }
			@Override
			public void mouseReleased(MouseEvent e) {
				Point endP = e.getPoint(); vEnd.add(endP); repaint();	// 패널의 다시 그리기를 요청
			}
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g); g.setColor(c);	// 색상 c변수로 세팅 
			for(int i=0; i<vStart.size(); i++) {
				Point s = vStart.get(i); Point e = vEnd.get(i);
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
	void createMenu() {
		JMenuBar mb=new JMenuBar(); JMenu clearMenu=new JMenu("Clear");
		JMenu colorMenu=new JMenu("Color"); JMenuItem menuItem=new JMenuItem("clear");
		JMenuItem[] colorItem=new JMenuItem[3]; String[] itemTitle= {"Red","Blue","Green"};
		for(int i=0; i<colorItem.length; i++) {
			colorItem[i]=new JMenuItem(itemTitle[i]);
			colorItem[i].addActionListener(new MyAction());
			colorMenu.add(colorItem[i]);
		}
		menuItem.addActionListener(new MyAction());
		clearMenu.add(menuItem); mb.add(clearMenu); mb.add(colorMenu);
		setJMenuBar(mb);
	}
	class MyAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd=e.getActionCommand();
			switch(cmd) {
			case "clear": vStart.clear(); vEnd.clear(); break;
			case "Red": c=new Color(255,0,0); break;
			case "Blue": c=new Color(0,0,255); break;
			case "Green": c=new Color(0,255,0); break;
			}
			repaint();
		}
	}
	public static void main(String[] args) {new Temp6();}
}
