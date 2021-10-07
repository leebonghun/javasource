package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.SwingConstants;

public class KeyPad extends JFrame implements ActionListener{
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	private JPanel contentPane;
	private JTextField textField;
	private String res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyPad frame = new KeyPad();
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
	public KeyPad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		textField = new JTextField(24);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 3, 0, 0));
		
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		panel_1.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(this);
		panel_1.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		panel_1.add(btn3);
		
		btn4 = new JButton("4");
		btn4.addActionListener(this);
		panel_1.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(this);
		panel_1.add(btn5);
		
		 btn6 = new JButton("6");
		btn6.addActionListener(this);
		panel_1.add(btn6);
		
		btn7 = new JButton("7");
		btn7.addActionListener(this);
		panel_1.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(this);
		panel_1.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(this);
		panel_1.add(btn9);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		textField.setText(textField.getText()+cmd);
	}

}
