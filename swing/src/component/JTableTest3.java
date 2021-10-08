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

import dao.UserDAO;
import domain.UserDTO;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class JTableTest3 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtGender;
	private DefaultTableModel model;
	private UserDAO dao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableTest3 frame = new JTableTest3();
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
	public JTableTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		String columnNames[]= {"번호","이름","태어난해","주소","전화번호"};
		model=new DefaultTableModel(columnNames, 0) {
			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		
	
		scrollPane.setViewportView(table);
		table.setModel(model);
		
		dao = new UserDAO();
		showTable();
		
	}
	private void showTable() {
		Vector<UserDTO> vecList =dao.select();
		if(!vecList.isEmpty()) {
			for(UserDTO dto : vecList) {
				Vector<Object> newVec = new Vector<Object>();
				newVec.add(dto.getNo());
				newVec.add(dto.getUsername());
				newVec.add(dto.getBrithYear());
				newVec.add(dto.getAddr());
				newVec.add(dto.getMobile());
				
				model.addRow(newVec);
			}
		}
		
	}

}
