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
		setTitle("액션 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lb1 = new JLabel("버튼을 누르세요");
		add(lb1);
		btn1 = new JButton("click");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lb1.setText("첫번째 버튼 클릭");
				
			}
		});
		add(btn1);
		
		
		
				
//		lb1.setText("첫번쨰 버튼 클릭됨");	 -< 레이블의 텍스트를 변경
		

		btn2 = new JButton("click2");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lb1.setText("두번째 버튼 클릭");
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
//			System.out.println("첫번째 버튼이 눌러졌습니다");
//		}else if (e.getSource()==btn2) {
//			System.out.println("두번째 버튼이 눌러졌습니다");
//		}
//	}

}
