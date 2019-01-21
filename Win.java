package Minesweeper;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Win extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCongratulationsYouveWon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Win dialog = new Win();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Win() {
		setBounds(0, 0, 400, 150);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		txtCongratulationsYouveWon = new JTextField();
		txtCongratulationsYouveWon.setHorizontalAlignment(SwingConstants.CENTER);
		txtCongratulationsYouveWon.setFont(new Font("Arial", Font.PLAIN, 12));
		txtCongratulationsYouveWon.setEditable(false);
		txtCongratulationsYouveWon.setText("Congratulations! You've Won! Press \"Reset\" to Restart the Game.");
		getContentPane().add(txtCongratulationsYouveWon, BorderLayout.CENTER);
		txtCongratulationsYouveWon.setColumns(10);

		
	}

}
