package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JListTest3 extends JFrame {
	private JPanel contentPane;
	
	
	private ImageIcon[] images = {
			new ImageIcon(JListTest3.class.getResource("/component/icon1.png")),
			new ImageIcon(JListTest3.class.getResource("/component/icon2.png")),
			new ImageIcon(JListTest3.class.getResource("/component/icon3.png")),
			new ImageIcon(JListTest3.class.getResource("/component/icon4.png")),
	};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest3 frame = new JListTest3();
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
	public JListTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		String[] fruits = {"»ç°ú","¹Ù³ª³ª","Å°À§","¸Á°í","¹è","º¹¼þ¾Æ","µþ±â"};
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		
		JList<String> list = new JList<>(fruits);
		panel.add(list);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JList<ImageIcon> list_1 = new JList<>(images);
		panel_1.add(list_1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JList<String> list_2 = new JList<>(fruits);
		scrollPane.setViewportView(list_2);
	}

}
