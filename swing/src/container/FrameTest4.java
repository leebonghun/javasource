package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest4 extends JFrame {
	
	public FrameTest4() {
		setTitle("MyFrame");
		setSize(400,500);
		
		//프레임을 닫으면 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn1 = new JButton("버튼1");
		add(btn1);
		JButton btn2 = new JButton("버튼2");
		add(btn2);
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		JButton btn4 = new JButton("버튼4");
		add(btn4);
		JButton btn5 = new JButton("버튼5");
		add(btn5);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		FrameTest3 f = new FrameTest3();
	}
}