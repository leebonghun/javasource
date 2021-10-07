package event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//KetListener
// KeyEvent�� �����ϴ� ������
// KeyEvent �� ��Ŀ���� ���� ������Ʈ������ �߻�
// KeyPressed() : Ű�� ������ ���� �߻�
// KeyTyped() : ���� Ű�� �������� ���� ȣ��
// KeyReleased() : ����Ű�� ���� ���� ȣ��
public class KeyEventTest2 extends JFrame implements KeyListener {
	
	private JPanel panel;
	private JTextField textField;
	private JTextArea textArea;
	
	public KeyEventTest2() {
		// TODO Auto-generated constructor stub
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));
		
		panel.add(new JLabel("���ڸ� �Է��ϼ���"));
		
		textField = new JTextField(10);
		textField.addKeyListener(new MyKeyListener());
		panel.add(textField);
		
		textArea = new JTextArea(3,30);
		
		getContentPane().add(panel,BorderLayout.NORTH);
		getContentPane().add(textArea,BorderLayout.SOUTH);
		
		setTitle("Ű �̺�Ʈ");
		setSize(400,200);
		setVisible(true);
	
	}

	
	protected void display(KeyEvent e,String str) {
		char keychar = e.getKeyChar(); //���� ������ Ű ���ڰ�
		int keyCode =e.getKeyCode(); //���� ������ Ű �ڵ尪
		
//		textArea.setText(t);
		String modifiers = "Alt : "+e.isAltDown()+"Ctrl : "+e.isControlDown()+"Shift : "+e.isShiftDown();
		textArea.append(str+"���� :"+keychar+"(�ڵ� : "+keyCode+")"+modifiers+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventTest2();
	}
	class MyKeyListener extends KeyAdapter{ //����ϰ� ���� �޼ҵ常 ������ �ͼ� �� �� �ִ�.
		@Override
		public void keyPressed(KeyEvent e) {
			display(e, "KeyPressed :");
		}
	}

}
