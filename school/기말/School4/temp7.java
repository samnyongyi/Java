package school;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class temp7 extends JFrame {
	JLabel imgLabel = new JLabel(); // 빈 레이블
	temp7() {
		setTitle("조동현");
		createMenu();	// 메뉴생성, 프레임에 삽입
		Container cp = getContentPane();
		cp.add(imgLabel, BorderLayout.CENTER);
		setSize(250,200); setVisible(true);
	}
	void createMenu() { 
		JMenuBar mb = new JMenuBar(); // 메뉴바 생성
		JMenu screenMenu = new JMenu("Screen");
		JMenuItem [] menuItem = new JMenuItem [4];
		String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		MenuAction listener = new MenuAction(); 
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]); 
			menuItem[i].addActionListener(listener); 
			screenMenu.add(menuItem[i]);
			if(i<menuItem.length-1) screenMenu.addSeparator();
		}
		mb.add(screenMenu); 
		setJMenuBar(mb); // 메뉴바를 프레임에 부착
	}
	class MenuAction implements ActionListener { 
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand(); 
			switch(cmd) { // 메뉴 아이템의 종류 구분       
			case "Load" :
				if(imgLabel.getIcon() != null ) return;	// 이미 로딩되었으면 리턴
				imgLabel.setIcon(new ImageIcon("images/img0.jpg")); 
				break;
			case "Hide" : imgLabel.setVisible(false); break;
			case "ReShow" : imgLabel.setVisible(true); break;
			case "Exit" : System.exit(0); break;
			}
		}
	}
	public static void main(String [] args) { new temp7(); }
}