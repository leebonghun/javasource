package container;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* Flowlayout : ������Ʈ�� ���ʿ��� ���������� ��ġ
 * 
 * 
 * 
 */

public class BorderLayoutTest2 extends JFrame {
	public BorderLayoutTest2() {
		// TODO Auto-generated constructor stub
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		���̾ƿ� ����
//		���� �������� contentPane ��������
		Container container = getContentPane();
		container.setLayout(new BorderLayout(10,10));
		
		
		JButton btn1 = new JButton("��ư1");
		add(btn1);
		JButton btn2 = new JButton("��ư2");
		add(btn2);
		JButton btn3 = new JButton("��ư3");
		add(btn3);
		JButton btn4 = new JButton("��ư4");
		add(btn4);
		JButton btn5 = new JButton("��ư5");
		add(btn5);
		
		
		
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		BorderLayoutTest2 f= new BorderLayoutTest2();
	}

}
