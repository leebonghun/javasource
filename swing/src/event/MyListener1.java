package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* ActionListner
 * JButton, JMenuItem, JTextField
 * 
 * JButton : 마우스나 enter 버튼 선택
 * jMenuItem : 메뉴 선택
 * JTextField : enter 키 입력
 */
public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 액션이 일어난 객체의 command를 가져옴
		System.out.println("e.getActionCommand()"+e.getActionCommand());
		System.out.println("e.getID()"+e.getID());
		System.out.println("e.getActionCommand()"+e.getSource());
		
		
		
	}

}
