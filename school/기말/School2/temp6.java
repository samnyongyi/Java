package school;
import java.awt.*;
import javax.swing.*;
public class temp6 extends JFrame {
	public temp6() {
		super("Grid 예제");setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
//		cp.setLayout(new GridLayout(2,5,5,5));	// 2X5, 가로/세로 5간격
		cp.setLayout(new GridLayout(2,10));	// 2X10
// GridLayout(int rows, int cols, int hGap, int vGap)
// rows : 격자의 행수 (디폴트 : 1), cols : 격자의 열수 (디폴트 : 1)
// rows x cols 만큼의 셀을 가진 격자로 컨테이너 공간을 분할, 배치
// hGap : 좌우 두 컴포넌트 사이의 수평 간격, 픽셀 단위(디폴트 : 0), vGap : 상하 두 컴포넌트 사이의 수직 간격, 픽셀 단위(디폴트 : 0)

		for(int i=0; i<10; i++) { 
			String text = Integer.toString(i);	// i를 문자열로 변환
			JButton button = new JButton(text);
			cp.add(button); 
		}
		setVisible(true);
	}
	public static void main(String[] args) {new temp6(); }
}
