package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame {
	
	public FrameTest3() {
		setTitle("MyFrame");
		setSize(400,500);

		JButton btn1 = new JButton("버튼");
		add(btn1,BorderLayout.EAST);
		JButton btn2 = new JButton("버튼");
		add(btn2,BorderLayout.SOUTH);
		JButton btn3 = new JButton("버튼");
		add(btn3,BorderLayout.WEST);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		FrameTest3 f = new FrameTest3();
	}
}
