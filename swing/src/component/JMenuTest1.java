package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JMenuTest1 extends JFrame {

	private JPanel contentPane;
	private JLabel imgLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenuTest1 frame = new JMenuTest1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JMenuTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu screenMenu = new JMenu("Screen");
		menuBar.add(screenMenu);

		JMenuItem load = new JMenuItem("Load");
		load.addActionListener(new MenuActionListener());
		screenMenu.add(load);

		JMenuItem hide = new JMenuItem("Hide");
		hide.addActionListener(new MenuActionListener());
		screenMenu.add(hide);

		JMenuItem reshow = new JMenuItem("Reshow");
		reshow.addActionListener(new MenuActionListener());
		screenMenu.add(reshow);

		JSeparator separator = new JSeparator();
		screenMenu.add(separator);

		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new MenuActionListener());
		screenMenu.add(exit);

		JMenu editMenu = new JMenu("Edit");
		menuBar.add(editMenu);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		editMenu.add(mntmNewMenuItem_4);

		JMenu sourceMenu = new JMenu("Source");
		menuBar.add(sourceMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(contentPane, popupMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("load");
		popupMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("hide");
		popupMenu.add(mntmNewMenuItem_1);
		
		imgLabel = new JLabel();
		
		
		
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		add(imgLabel,BorderLayout.CENTER);
	}

	private class MenuActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String cmd = e.getActionCommand();

			switch (cmd) {
			case "Load":
				if(imgLabel.getIcon()!=null) 
					return;
					
					imgLabel.setIcon(new ImageIcon(JMenuTest1.class.getResource("/component/rock.png")));
				
				break;
			case "Hide":
				imgLabel.setVisible(false);
				break;
			case "Reshow":
				imgLabel.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;

			default:
				break;
			}
		}

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
