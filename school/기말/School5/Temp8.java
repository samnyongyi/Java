package school;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class Temp8 extends JFrame { 	
	MyThread th=null; 
	/*Thread th=null;*/
	public Temp8() {
		setTitle("조동현"); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200); setLocation(300,300); setVisible(true);
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(th==null || !th.isAlive()) { th = new MyThread(); th.start(); /*th=new Thread(new My Thread()); th.start();*/} 
				else th.interrupt(); 
			}
		});
	}
	class MyThread extends Thread{
	/*class MyThread implements Runnable{*/
		@Override
		public void run() { 
			Random r = new Random();
			while(true) {
				try { Thread.sleep(20);
				} catch(InterruptedException e){ return; }
				int x = getX() + r.nextInt()%5; int y = getY() + r.nextInt()%5; 
				setLocation(x, y);
			}
		}
	}
	public static void main(String [] args) { new Temp8(); }
} 