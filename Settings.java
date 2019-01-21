package Minesweeper;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;

public class Settings extends JDialog implements ActionListener {
	
	Language languagePage = new Language();
	Display displayPage = new Display();
	Colours coloursPage = new Colours();
	Mines minesPage = new Mines();

	private final JPanel contentPanel = new JPanel();
	private JButton btnDisplay;
	private JButton btnMines;
	private JButton btnColours;
	private JButton btnLanguage;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Settings dialog = new Settings();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Settings() {
		setBounds(0, 0, 150, 250);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnDisplay = new JButton("Display");
		btnDisplay.setBounds(6, 6, 138, 29);
		contentPanel.add(btnDisplay);
		btnDisplay.addActionListener(this);
		
		btnMines = new JButton("Mines");
		btnMines.setBounds(6, 47, 138, 29);
		contentPanel.add(btnMines);
		btnMines.addActionListener(this);
		
		btnColours = new JButton("Colours");
		btnColours.setBounds(6, 88, 138, 29);
		contentPanel.add(btnColours);
		btnColours.addActionListener(this);
		
		btnLanguage = new JButton("Language");
		btnLanguage.setBounds(6, 129, 138, 29);
		contentPanel.add(btnLanguage);
		btnLanguage.addActionListener(this);
		
		btnOk = new JButton("OK");
		btnOk.setBackground(Color.BLUE);
		btnOk.setBounds(64, 193, 80, 29);
		contentPanel.add(btnOk);
		btnOk.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource().equals(btnDisplay)) {
			displayPage.setVisible(true);
		} else if(event.getSource().equals(btnMines)) {
			minesPage.setVisible(true);
		} else if(event.getSource().equals(btnColours)) {
			coloursPage.setVisible(true);
		} else if(event.getSource().equals(btnLanguage)) {
			languagePage.setVisible(true);
		} else if(event.getSource().equals(btnOk)) {
			this.dispose();
			new Minesweeper(Minesweeper.getSizeX(), Minesweeper.getSizeY(), Minesweeper.getMineCount());
		}
	}
}
