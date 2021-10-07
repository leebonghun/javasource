package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonTest2 extends JFrame implements ActionListener{
	private JButton left,middle,right;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonTest2 frame = new ButtonTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		left = new JButton("Disable middle button");// 이게 길면 setActionCommand를 사용해서 대표하는 command를 해줄수 있음
		left.setIcon(new ImageIcon(ButtonTest2.class.getResource("/component/left.gif")));
		left.setActionCommand("disable");
		left.setMnemonic('D');
		left.addActionListener(this);
		contentPane.add(left);
		
		middle = new JButton("Middle Button");
		middle.setIcon(new ImageIcon(ButtonTest2.class.getResource("/component/middle.gif")));
		middle.setActionCommand("middle");
		middle.setMnemonic('M');
		middle.addActionListener(this);
		contentPane.add(middle);
		
		 right = new JButton("Enable middle Button");
		right.setIcon(new ImageIcon(ButtonTest2.class.getResource("/component/right.gif")));
		right.setActionCommand("enable");
		right.setMnemonic('E');
		right.addActionListener(this);
		contentPane.add(right);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if(cmd.equals("disable")) {
			left.setEnabled(false);
			middle.setEnabled(false);
			right.setEnabled(true);
	
		}else if(cmd.equals("enable")) {
			middle.setEnabled(true);
			left.setEnabled(true);
			right.setEnabled(false);
		}
		
	}

}
