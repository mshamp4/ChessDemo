package chess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ChessPanel extends JPanel {

	private static final long serialVersionUID = 7659163831895615217L;
	private JButton[][] board;
	private ChessModel model;
	private JPanel center;
	private final int BOARD_SIZE = 8;

	public ChessPanel() {

		ButtonListener listener = new ButtonListener();
		center = new JPanel();
		center.setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));
		board = new JButton[BOARD_SIZE][BOARD_SIZE];

		model = new ChessModel();

		// setting up the board to have a checkered pattern 
		boolean white = true;

		for (int row = 0; row < model.numRows(); row++) {
			white = !white; // switches color next row down
			for (int col = 0; col < model.numColumns(); col++) {
				board[row][col] = new JButton("");
				board[row][col].setPreferredSize(new Dimension(90, 90));
				board[row][col].setBorder(null);
				board[row][col].addActionListener(listener);
				center.add(board[row][col]);
				if (white)
					board[row][col].setBackground(Color.WHITE);
				else
					board[row][col].setBackground(Color.DARK_GRAY);
				white = !white;
			}
		}

		add(center, BorderLayout.CENTER);
		displayBoard();
		
	}

	// method that updates the board
	private void displayBoard() {

	}

	
	// inner class that represents action listener for buttons
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {			
			
		}

	}
}
