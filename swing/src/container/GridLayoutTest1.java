package container;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


//gridlayout : ���ڸ�� 
public class GridLayoutTest1 extends JFrame {
	public GridLayoutTest1() {
		// TODO Auto-generated constructor stub
	
		setTitle("gridlayout �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 4, 5, 5));
		
		//��ư 10�� ����
		for(int i=1; i<=12;i++) {
			JButton btn = new JButton(i+"");
			add(btn);
		}
		
		
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutTest1();
	}

}
