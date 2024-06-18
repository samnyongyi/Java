package school;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class temp8 extends JFrame {
	temp8() {
		setTitle("조동현");setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200); Container cp = getContentPane(); cp.add(new MyPanel(), BorderLayout.NORTH); setVisible(true);
	}
	class MyPanel extends JPanel {
		String[] names = { "Input Name", "Confirm", "Message" }; JButton[] btns =new JButton[3]; JTextField tf =new JTextField(10);
		MyPanel() { setBackground(Color.LIGHT_GRAY);
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(names[i]); btns[i].addActionListener(new MyAction()); this.add(btns[i]); // 패널에 add
		} this.add(tf); // 패널에 add
		}
		class MyAction implements ActionListener { // MyPanel 에 있는 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource(); 
				if (btn == btns[0]) {
					String name = JOptionPane.showInputDialog("이름을 입력하세요.");
					if (name != null) tf.setText(name);
				} else if (btn == btns[1]) {
					int result = JOptionPane.showConfirmDialog(null, "계속할 것입니까?", "Confirm", JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.CLOSED_OPTION) tf.setText("Just Closed without Selection");
					else if (result == JOptionPane.YES_OPTION) tf.setText("Yes");
					else tf.setText("No");
				} else JOptionPane.showMessageDialog(null, "조심하세요", "Message", JOptionPane.ERROR_MESSAGE);
			} 
		} 
	}
	public static void main(String[] args) {new temp8(); } 
}



