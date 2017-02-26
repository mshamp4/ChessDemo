package chess;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ChessGUI {

	private static JMenuBar menuBar;
	private static JMenu menu;
	private static JMenu menuNewGame;
	private static JMenuItem menuExit;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Chess Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ChessPanel panel = new ChessPanel();
		frame.getContentPane().add(panel);
		frame.setSize(740, 766);
		frame.setLocationRelativeTo(null);

		class MenuActionListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == menuExit)
					System.exit(0);
			}
		}

		// adding a menu to a JMenuBar on the frame
		menuBar = new JMenuBar();
		menu = new JMenu("Options");
		menuBar.add(menu);
		
		// adding the new game to the menu
		menuNewGame = new JMenu("New Game");
		menuNewGame.addActionListener(new MenuActionListener());
		menu.add(menuNewGame);
		
		menu.addSeparator();

		// adding the Exit button to the menu
		menuExit= new JMenuItem("Exit");
		menuExit.addActionListener(new MenuActionListener());
		menu.add(menuExit);
		frame.setJMenuBar(menuBar);
		
		/* set visible is last because it creates the JMenuBar first then 
		 * displays the panel */
		frame.setVisible(true);
	}
}
