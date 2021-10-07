package event;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
// MouseListener
// mouseClicked():마우스가 컴포넌트를 클릭했을 떄
// mousePressed() : 마우스 버튼이 눌러졌을 때
// mouseReleased() : 눌러진 버튼이 떼어질 때
// mouseEntered() : 마우스가 컴포넌트 위에 올라갈 때
// mouseExited() : 마우스가 컴포넌트에서 내려올 때
import javax.swing.JTextArea;
import javax.swing.JTextField;

// ** MouseMotionListener **//
// mouseDragged() : 마우스가 드래그 되는 동안
// mouseMoved() : 마우스가 움직이는 동안
public class MouseEventTest1 extends JFrame implements MouseListener,MouseMotionListener {
	private JTextField textField;
	
	
	public MouseEventTest1() {
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TODO Auto-generated constructor stub
		JButton btn = new JButton("클릭");
		btn.addMouseListener(this);
		add(btn,BorderLayout.NORTH);
		
		
		JTextArea textArea = new JTextArea(3,50);
		textArea.addMouseListener(this);
		textArea.addMouseMotionListener(this);
		add(textArea,BorderLayout.CENTER);
		
		textField = new JTextField();
		add(textField,BorderLayout.SOUTH);
		
		
		setSize(100,100);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventTest1();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseclicked");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스눌름");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 뗌");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 엔터");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 퇴장");
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseDragged");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mousemMoved");
	}

}
