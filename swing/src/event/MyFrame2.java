package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame  {
	private JButton btn1,btn2;
	public MyFrame2() {
		setTitle("�׼� �̺�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lb1 = new JLabel("��ư�� ��������");
		add(lb1);
		btn1 = new JButton("click");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lb1.setText("ù��° ��ư Ŭ��");
				
			}
		});
		add(btn1);
		
		
		
				
//		lb1.setText("ù���� ��ư Ŭ����");	 -< ���̺��� �ؽ�Ʈ�� ����
		

		btn2 = new JButton("click2");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lb1.setText("�ι�° ��ư Ŭ��");
			}
		});
		add(btn2);
				
		setBounds(100, 100, 300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource()== btn1) {
//			System.out.println("ù��° ��ư�� ���������ϴ�");
//		}else if (e.getSource()==btn2) {
//			System.out.println("�ι�° ��ư�� ���������ϴ�");
//		}
//	}

}
