package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class JListTest2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest2 frame = new JListTest2();
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
	public JListTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
//		Vector<String> vector = new Vector<String>();
		
		/*vector.add("사과");
		vector.add("포도");
		vector.add("딸기");
		vector.add("바나나");
		vector.add("참외");
		vector.add("키위");*/
		String[] arr = {"사과","포도","딸기","바나나","참외"};
		
		JList<String> list = new JList<>(arr);
		
		
		
		contentPane.add(list, BorderLayout.CENTER);
	}

}
