package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* ActionListner
 * JButton, JMenuItem, JTextField
 * 
 * JButton : ���콺�� enter ��ư ����
 * jMenuItem : �޴� ����
 * JTextField : enter Ű �Է�
 */
public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// �׼��� �Ͼ ��ü�� command�� ������
		System.out.println("e.getActionCommand()"+e.getActionCommand());
		System.out.println("e.getID()"+e.getID());
		System.out.println("e.getActionCommand()"+e.getSource());
		
		
		
	}

}
