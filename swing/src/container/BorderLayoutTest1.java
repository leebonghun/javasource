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

public class BorderLayoutTest1 extends JFrame {
	public BorderLayoutTest1() {
		// TODO Auto-generated constructor stub
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		���̾ƿ� ����
//		���� �������� contentPane ��������
		Container container = getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		
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
		BorderLayoutTest1 f= new BorderLayoutTest1();
	}

}
