package school;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class temp9 extends JFrame{
	JTextArea ta=new JTextArea(10,50);
	temp9(){
		setTitle(""); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();setSize(400,400); add(new JScrollPane(ta));setVisible(true);
	}
	void createMenu() {
		JMenuBar mb= new JMenuBar(); JMenu menuFile=new JMenu("File");
		JMenuItem miSave=new JMenuItem("Save"); JMenuItem miClear=new JMenuItem("Clear");
		miSave.addActionListener(new MenuAction());
	    miClear.addActionListener(new MenuAction());
	    menuFile.add(miSave);menuFile.addSeparator();menuFile.add(miClear);
	    mb.add(menuFile);
	    setJMenuBar(mb);
	}
	private class MenuAction implements ActionListener {
		@Override
	    public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
	    	case "Save":
	    		String name = JOptionPane.showInputDialog("파일이름을 입력하세요");
	    		if (name != null) ta.append(name + "\n"); 
	    		else JOptionPane.showMessageDialog(null, "취소했습니다.", "취소", JOptionPane.ERROR_MESSAGE);
	            break;
	    	case "Clear": ta.setText(""); break;
			}
		}
	}
	public static void main(String[] args) { new temp9();}
}