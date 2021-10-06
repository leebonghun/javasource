package container;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.BoxLayout;

public class PracticeTest1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PracticeTest1 frame = new PracticeTest1();
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
	public PracticeTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 150);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JLabel lblNewLabel = new JLabel("\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4. \uD53C\uC790\uC758 \uC885\uB958\uB97C \uC120\uD0DD\uD558\uC2DC\uC624");
		lblNewLabel.setLabelFor(contentPane);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\uCF64\uBCF4\uD53C\uC790");
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uD3EC\uD14C\uC774\uD1A0\uD53C\uC790");
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("\uBD88\uACE0\uAE30\uD53C\uC790");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\uAC1C\uC218");
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(7);
	}

}
