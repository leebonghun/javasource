package event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame implements ActionListener {
	private JButton btn1;
	private JButton btn2;
	Container container = getContentPane();
	public MyFrame4() {
		// TODO Auto-generated constructor stub
		setTitle("Frame ¹è°æ»ö º¯°æ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setLayout(new FlowLayout());
		btn1 = new JButton("³ë¶û");
		btn1.addActionListener(this);
		add(btn1);
	    btn2 =  new JButton("»¡°­");
	    btn2.addActionListener(this);
		add(btn2);
		//		setLayout(new FlowLayout());
		setBounds(200,100,300,200);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		
		if(cmd.equals( "³ë¶û")) {
			container.setBackground(Color.yellow);
		}else if(cmd.equals ("»¡°­")) {
			container.setBackground(Color.red);
		}
	}
	
	
	public static void main(String[] args) {
		new MyFrame4();
	}

}
