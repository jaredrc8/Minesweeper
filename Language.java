package Minesweeper;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class Language extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JRadioButton rdbtnEnglish;
	private JRadioButton rdbtnSpanish;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Language dialog = new Language();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Language() {
		setBounds(0, 0, 100, 150);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		ButtonGroup group = new ButtonGroup();
		{
			rdbtnEnglish = new JRadioButton("English");
			rdbtnEnglish.setBounds(6, 6, 88, 23);
			contentPanel.add(rdbtnEnglish);
			group.add(rdbtnEnglish);
			rdbtnEnglish.addActionListener(this);
			rdbtnEnglish.setSelected(true);
		}
		{
			rdbtnSpanish = new JRadioButton("Spanish");
			rdbtnSpanish.setBounds(6, 41, 88, 23);
			contentPanel.add(rdbtnSpanish);
			group.add(rdbtnSpanish);
			rdbtnSpanish.addActionListener(this);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnOk = new JButton("OK");
				btnOk.setActionCommand("OK");
				buttonPane.add(btnOk);
				getRootPane().setDefaultButton(btnOk);
				btnOk.addActionListener(this);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource().equals(rdbtnEnglish)) {
			Minesweeper.setLanguage("ENGLISH");
		} else if(event.getSource().equals(rdbtnSpanish)) {
			Minesweeper.setLanguage("SPANISH");
		} else if(event.getSource().equals(btnOk)) {
			this.dispose();
		}
	}

}
