package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventTest5 extends JFrame{

   private JLabel lbl= new JLabel("Hello");
   
   public MouseEventTest5() {
      setTitle("텍스트 움직이기");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(null);
      
      lbl.setLocation(50,50);
      lbl.addMouseListener(new MouseAdapter() {
      });
      lbl.setSize(100,20);
      add(lbl);
      
      Container contentPane = getContentPane();
      contentPane.addMouseListener(new MyMouseAdapter() {
      });
      contentPane.setFocusable(true);
      contentPane.requestFocus();
      
      setSize(200, 200);
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new MouseEventTest5();
   }
   
   
   class MyMouseAdapter extends MouseAdapter{
      @Override
      public void mousePressed(MouseEvent e) {
         int x = e.getX();
         int y = e.getY();
         
         lbl.setLocation(x, y);
      }
   
      
   }



}