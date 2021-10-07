package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockscissorPaper extends JFrame implements ActionListener {
	private JPanel pan1, pan2;
	private JTextField textField;
	private JButton btn1, btn2, btn3;
	static final int ROCK =0;
	 static final int SCISSOR =1;
	  static final int PAPER =2;
	 
	public RockscissorPaper() {
		// TODO Auto-generated constructor stub
		setTitle("���������� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = getContentPane();

		JLabel lbl = new JLabel("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���Ͻÿ�");
		lbl.setFont(new Font("����", Font.BOLD, 18));
		container.add(lbl, BorderLayout.NORTH);

		// ��� �̹��� ���
		pan1 = new JPanel();
		pan1.setLayout(new GridLayout(0, 3));

		btn1 = new JButton();
		btn1.setIcon(new ImageIcon(RockscissorPaper.class.getResource("/component/8df1922ae8a3bca4d81acb048a20bef6103833.jpg")));
		btn1.setActionCommand("0");
		btn1.addActionListener(this);
		pan1.add(btn1);

		btn2 = new JButton();
		btn2.setIcon(new ImageIcon(RockscissorPaper.class.getResource("/component/scissor.png")));
		btn2.setActionCommand("1");
		btn2.addActionListener(this);
		pan1.add(btn2);

		btn3 = new JButton();
		btn3.setIcon(new ImageIcon(RockscissorPaper.class.getResource("/component/paper.png")));
		btn3.setActionCommand("2");
		btn3.addActionListener(this);
		pan1.add(btn3);

		container.add(pan1, BorderLayout.CENTER);
		// �ϴ� ��� ���
		textField = new JTextField();
		textField.setFont(new Font("����", Font.BOLD, 18));
		container.add(textField, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		int random = (int) (Math.random() * 3);
		System.out.println(random);
		if (random == Integer.parseInt(cmd)) {
			textField.setText("�����ϴ�"+random);
		} else if (random < Integer.parseInt(cmd)) {
			textField.setText("������ �¸��Ͽ����ϴ�"+random);
		} else if (random > Integer.parseInt(cmd)) {
			textField.setText("��ǻ�Ͱ� �¸��Ͽ����ϴ�"+random);	
		}

	}

	public static void main(String[] args) {
		new RockscissorPaper();
	}

}
