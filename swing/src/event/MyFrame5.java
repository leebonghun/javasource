package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame5 extends JFrame implements ActionListener {
	
	private JTextField num1,num2,result;
	public MyFrame5() {
		setTitle("덧셈 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel top = new JPanel();
		num1 = new JTextField(10);
		top.add(num1);
		
		JLabel lbl = new JLabel("+");
		top.add(lbl);
		
		num2 = new JTextField(10);
		top.add(num2);
		
		JLabel lbl2 = new JLabel("=");
		top.add(lbl2);
		
		result = new JTextField(10);
		top.add(result);
		add(top,BorderLayout.NORTH);
		
		
		JPanel bottom = new JPanel();
		JButton btn1 = new JButton("확인");
		btn1.addActionListener(this);
		bottom.add(btn1);
		
		JButton btn2 = new JButton("취소");
		btn2.addActionListener(this);
		bottom.add(btn2);
		add(bottom,BorderLayout.CENTER);
		
		//버튼 두개 생성
		
		
		setSize(500, 500);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)  {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		try {
			
			if(cmd.equals("확인")) {
				int op1 = Integer.parseInt(num1.getText());
				int op2 = Integer.parseInt(num2.getText());
				int total = op1+op2;
				result.setText(total+"");
			}else  {
				num1.setText("");
				num2.setText("");
				result.setText("");
			}
		} catch (Exception e2) {
			System.out.println("잘못 입력했습니다");
			}
	}
	
	public static void main(String[] args) {
		new MyFrame5();
	}

}
