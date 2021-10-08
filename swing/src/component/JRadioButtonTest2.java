package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.security.acl.Group;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class JRadioButtonTest2 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButtonTest2 frame = new JRadioButtonTest2();
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
	public JRadioButtonTest2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JRadioButtonTest2.class.getResource("/component/8df1922ae8a3bca4d81acb048a20bef6103833.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uD06C\uAE30 \uC120\uD0DD");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Size", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Small");
		rdbtnNewRadioButton_1.addItemListener(this);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Medium");
		rdbtnNewRadioButton_2.addItemListener(this);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Large");
		rdbtnNewRadioButton.addItemListener(this);
		panel.add(rdbtnNewRadioButton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		JRadioButton btn = (JRadioButton) e.getItem();
		textField.setText(btn.getText());
	}

}
