package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class PizzaTest extends JFrame implements ItemListener, ActionListener {
	private static int price1 = 0;
	private static int price2 = 0;
	private static int price3 = 0;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton, btnNewButton_1;
	private ButtonGroup group, group1, group2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaTest frame = new PizzaTest();
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
	public PizzaTest() {
		setTitle("\uC790\uBC14\uC8FC\uBB38");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(PizzaTest.class.getResource("/component/8df1922ae8a3bca4d81acb048a20bef6103833.jpg")));
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel(
				"\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel.setFont(new Font("a시월구일3", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.ORANGE));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.white);
		panel_2.setForeground(Color.RED);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0)), "\uC885\uB958", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uCF64\uBCF4");

		rdbtnNewRadioButton_1.addActionListener(this);
		panel_2.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\uD3EC\uD14C\uC774\uD1A0");
		rdbtnNewRadioButton_2.addActionListener(this);
		panel_2.add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uBD88\uACE0\uAE30");
		rdbtnNewRadioButton.addActionListener(this);
		panel_2.add(rdbtnNewRadioButton);

		group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255)), "\uCD94\uAC00 \uD1A0\uD551",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_3.setBackground(Color.white);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("\uCE58\uC988");
		rdbtnNewRadioButton_4.addActionListener(this);
		panel_3.add(rdbtnNewRadioButton_4);

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("\uD53C\uB9DD");
		rdbtnNewRadioButton_5.addActionListener(this);
		panel_3.add(rdbtnNewRadioButton_5);

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("\uD398\uD398\uB85C\uB2C8");
		rdbtnNewRadioButton_6.addActionListener(this);
		panel_3.add(rdbtnNewRadioButton_6);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("\uBCA0\uC774\uCEE8");
		panel_3.add(rdbtnNewRadioButton_3);
		group1 = new ButtonGroup();
		group1.add(rdbtnNewRadioButton_4);
		group1.add(rdbtnNewRadioButton_5);
		group1.add(rdbtnNewRadioButton_6);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 0)), "\uD06C\uAE30", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 255, 0)));
		panel_4.setBackground(Color.white);
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));

		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Small");
		rdbtnNewRadioButton_8.addActionListener(this);
		panel_4.add(rdbtnNewRadioButton_8);

		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Medium");
		rdbtnNewRadioButton_9.addActionListener(this);
		panel_4.add(rdbtnNewRadioButton_9);

		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Large");
		rdbtnNewRadioButton_7.addActionListener(this);
		panel_4.add(rdbtnNewRadioButton_7);
		group2 = new ButtonGroup();
		group2.add(rdbtnNewRadioButton_7);
		group2.add(rdbtnNewRadioButton_8);
		group2.add(rdbtnNewRadioButton_9);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setBackground(Color.white);

		btnNewButton = new JButton("\uC8FC\uBB38");
		btnNewButton.addActionListener(this);
		panel_1.add(btnNewButton);

		btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.addActionListener(this);
		panel_1.add(btnNewButton_1);

		textField = new JTextField();
		textField.addActionListener(this);
		panel_1.add(textField);
		textField.setColumns(10);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getItem() == "콤보") {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				price1 -= 10000;
			} else {
				price1 += 10000;
			}
		} else if (e.getItem() == "포테이토") {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				price1 -= 12000;
			} else {
				price1 += 12000;
			}
		} else if (e.getItem() == "불고기") {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				price1 -= 13000;
			} else {
				price1 += 13000;
			}
		} else if (e.getItem() == "피망") {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				price1 -= 2000;
			} else {
				price1 += 2000;
			}
		} else if (e.getItem() == "치즈") {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				price1 -= 2000;
			} else {
				price1 += 2000;
			}
		} else if (e.getItem() == "페페로니") {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				price1 -= 1000;
			} else {
				price1 += 1000;
			}
		} else if (e.getItem() == "베이컨") {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				price1 -= 3000;
			} else {
				price1 += 3000;
			}
		} else if (e.getItem() == "Small") {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				price1 -= 1000;
			} else {
				price1 += 1000;
			}
		} else if (e.getItem() == "Medium") {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				price1 -= 2000;
			} else {
				price1 += 2000;
			}
		} else if (e.getItem() == "Large") {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				price1 -= 3000;
			} else {
				price1 += 3000;
			}
			System.out.println(price1 + price2 + price3);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int result = price1 + price2 + price3;
		String cmd = (String) e.getActionCommand();
		if (cmd == "콤보") {
			price1 = 10000;
		} else if (cmd == "포테이토") {
			price1 = 12000;
		} else if (cmd == "불고기") {
			price1 = 13000;
		} else if (cmd == "피망") {
			price2 = 2000;
		} else if (cmd == "치즈") {
			price2 = 2000;
		} else if (cmd == "페페로니") {
			price2 = 1000;
		} else if (cmd == "베이컨") {
			price2 = 3000;
		} else if (cmd == "Small") {
			price3 = 1000;
		} else if (cmd == "Medium") {
			price3 = 2000;
		} else if (cmd == "Large") {
			price3 = 3000;
			
		} else if (cmd == "주문") {
			JOptionPane.showConfirmDialog(getParent(), "주문완료","주문완료",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
			textField.setText(Integer.toString(price1 + price2 + price3));
		} else if (cmd == "취소") {
			textField.setText("0");
			group.clearSelection();
			group1.clearSelection();
			group2.clearSelection();

			price1 = 0;
			price2 = 0;
			price3 = 0;
		}
		System.out.println(price1 + price2 + price3);
	}

}
