package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JTextArea;

public class JListTest4 extends JFrame implements ListSelectionListener{

	private JPanel contentPane;
	private JTextArea textArea;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest4 frame = new JListTest4();
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
	public JListTest4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		String items[] = {"����","�ݼ�","����","ȭ��","��","�伺","õ�ռ�"}; 
		
		
		JList<String> list = new JList<>(items);
		list.addListSelectionListener(this);
		contentPane.add(list);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		contentPane.add(textArea);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		//���콺�� �������� �����ϴ� ������ ���콺���� ���� ���� ������
		//��� �̺�Ʈ�� ȣ���
//		System.out.println(e.getFirstIndex());
//		System.out.println(e.getLastIndex());
//		System.out.println(e.getValueIsAdjusting());
	
//		System.out.println(e.getSource());
		JList<String> list = (JList<String>) e.getSource();
		if(e.getValueIsAdjusting()) {
			textArea.append(list.getSelectedValue());
		}
	}

}
