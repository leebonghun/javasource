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

public class JTableTest1 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableTest1 frame = new JTableTest1();
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
	public JTableTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uD64D\uAE38\uB3D9", "35", "\uB0A8"},
				{"\uC774\uC2B9\uAE30", "28", "\uB0A8"},
				{null, "32", "\uC5EC"},
			},
			new String[] {
				"\uC774\uB984", "\uB098\uC774", "\uC131\uBCC4"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("\uCD9C\uB825");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//jtable 내용을 화면으로 출력
				TableModel model = table.getModel();
				System.out.println("이름\t나이\t성별");
				for(int i=0;i<model.getColumnCount();i++) {
					for(int j=0;j<model.getColumnCount();j++) {
						System.out.print(model.getValueAt(i, j)+"\t");
					}
					System.out.println();
				}
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
