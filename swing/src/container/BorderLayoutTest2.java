package container;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* Flowlayout : 컴포넌트를 왼쪽에서 오른쪽으로 배치
 * 
 * 
 * 
 */

public class BorderLayoutTest2 extends JFrame {
	public BorderLayoutTest2() {
		// TODO Auto-generated constructor stub
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		레이아웃 변경
//		현재 프레임의 contentPane 가져오기
		Container container = getContentPane();
		container.setLayout(new BorderLayout(10,10));
		
		
		JButton btn1 = new JButton("버튼1");
		add(btn1);
		JButton btn2 = new JButton("버튼2");
		add(btn2);
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		JButton btn4 = new JButton("버튼4");
		add(btn4);
		JButton btn5 = new JButton("버튼5");
		add(btn5);
		
		
		
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		BorderLayoutTest2 f= new BorderLayoutTest2();
	}

}
