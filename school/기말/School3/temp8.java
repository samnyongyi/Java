package school;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class temp8 extends JFrame {
    JLabel la = new JLabel("Love Java");
    int size;
    temp8() {
        this.setTitle("조동현, 실습2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400); setVisible(true);
        Container cp = getContentPane();
        cp.setFocusable(true); cp.requestFocus();
        cp.addKeyListener(new MyKey());

        Font f = la.getFont(); // 현재 la의 폰트 얻기
        size = f.getSize(); // 폰트의 크기 알아내기
        la.setFont(new Font("Arial", Font.BOLD, size + 5)); // 15픽셀 크기로 폰트 변경
        cp.setLayout(new FlowLayout());
        la.setSize(la.getPreferredSize());	// 요소가 내용을 표시하는데 가장 자연스럽거나 최적의 크기라고 판단하는 크기로 조정
        la.setLocation(150, 150); 
        cp.add(la);
    }

    class MyKey extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    size += 5;
                    la.setFont(new Font("Arial", Font.BOLD, size));
                    break;
                case KeyEvent.VK_DOWN:
                    if (size > 5) size -= 5;
                    la.setFont(new Font("Arial", Font.BOLD, size));
                    break;
            }
        }
    }
    public static void main(String[] args) {new temp8();}
}
