package container;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 extends JFrame {
	
	public Test1() {
		setTitle("여러 레이아웃 혼합");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.orange);	
		JButton btn1 = new JButton();
		btn1.setBackground(Color.BLUE);
	
		add(btn1);
		panel1.add(new JButton("버튼 2"));
		panel1.add(new JButton("버튼 3"));
		add(panel1,BorderLayout.NORTH);
		
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.red);
		panel2.setLayout(new BorderLayout());
		add(panel2,BorderLayout.CENTER);
		panel2.add(new JButton("Swing"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1();
	}

}
