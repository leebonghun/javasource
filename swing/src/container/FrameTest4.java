package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest4 extends JFrame {
	
	public FrameTest4() {
		setTitle("MyFrame");
		setSize(400,500);
		
		//�������� ������ ���α׷� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn1 = new JButton("��ư1");
		add(btn1);
		JButton btn2 = new JButton("��ư2");
		add(btn2);
		JButton btn3 = new JButton("��ư3");
		add(btn3);
		JButton btn4 = new JButton("��ư4");
		add(btn4);
		JButton btn5 = new JButton("��ư5");
		add(btn5);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		FrameTest3 f = new FrameTest3();
	}
}