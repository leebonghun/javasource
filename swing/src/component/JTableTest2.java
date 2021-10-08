package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class JTableTest2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable table;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtGender;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableTest2 frame = new JTableTest2();
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
	public JTableTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		String columnNames[]= {"이름","나이","성별"};
		model=new DefaultTableModel(columnNames, 0);
		scrollPane.setViewportView(table);
		table.setModel(model);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		panel.add(lblNewLabel);
		
		txtName = new JTextField();
		panel.add(txtName);
		txtName.setColumns(5);
		
		JLabel lblNewLabel_1 = new JLabel("\uB098\uC774");
		panel.add(lblNewLabel_1);
		
		txtAge = new JTextField();
		panel.add(txtAge);
		txtAge.setColumns(5);
		
		JLabel lblNewLabel_2 = new JLabel("\uC131\uBCC4");
		panel.add(lblNewLabel_2);
		
		txtGender = new JTextField();
		panel.add(txtGender);
		txtGender.setColumns(5);
		
		JButton btnNewButton = new JButton("입력");
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("삭제");
		btnNewButton_1.addActionListener(this);
		panel.add(btnNewButton_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if(cmd.equals("입력")) {
			String name =txtName.getText();
			String age =txtAge.getText();
			String gender =txtGender.getText();
			Object[] rowData = {name,age,gender};
			
			model.addRow(rowData);
			
			txtName.setText("");
			txtAge.setText("");
			txtGender.setText("");
		}else {
			model.removeRow(table.getSelectedRow());
		}
	}

}
