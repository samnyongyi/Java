package school;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class temp2 extends JFrame{
    ButtonGroup g = new ButtonGroup();    // 버튼 그룹 객체 생성
    JRadioButton[] rb = new JRadioButton[2]; 
    String[] str = {"red", "blue"};
    JLabel la = new JLabel();
    Container cp;

    temp2(){
        this.setTitle("조동현 3번 실습");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(235, 100); 
        cp = getContentPane();
        cp.setLayout(new FlowLayout());
        func lin = new func();
        for(int i = 0; i < rb.length; i++) {
            rb[i] = new JRadioButton(str[i]);
            g.add(rb[i]); 
            cp.add(rb[i]);
            rb[i].addActionListener(lin);
        }
        cp.add(la); 
        setVisible(true);
    }

    class func implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == rb[0]) 
                cp.setBackground(Color.RED);
            else 
                cp.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new temp2();
    }
}

/* 오류 찾기
package school;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class temp2 extends JFrame{
	ButtonGroup g= new ButtonGroup();	//버튼 그룹 객체 생성
	JRadioButton[] rb= new JRadioButton[2]; String str[]= {"red", "blue"};
	JLabel la= new JLabel();
	temp2(){
		this.setTitle("조동현 3번 실습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(235,100); Container cp=getContentPane();
		func lin=new func();
		cp.setLayout(new FlowLayout());
		for(int i=0; i<rb.length; i++) {
			rb[i]=new JRadioButton(str[i]);
			g.add(rb[i]); cp.add(rb[i]);
			rb[i].addActionListener(lin);
		}
		cp.add(la); setVisible(true);
	}
	class func implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==rb[0]) cp.setBackground(Color.RED);
			else cp.setBackground(Color.BLUE);
			
		}
	}
	public static void main(String[] args) {
		new temp2();
	}

}*/
