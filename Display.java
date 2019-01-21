package Minesweeper;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Display extends JDialog implements ChangeListener, ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JSlider sliderX;
	private JSlider sliderY;
	private JTextField txtChooseHorizontalSize;
	private JTextField txtChooseVerticalSize;
	private JButton btnOk;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Display dialog = new Display();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Display() {
		setBounds(0, 0, 200, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		sliderX = new JSlider(200,1000,Minesweeper.getWindowSizeX());
		sliderX.setSnapToTicks(true);
		sliderX.setPaintTicks(true);
		sliderX.setPaintLabels(true);
		sliderX.addChangeListener(this);
		sliderX.setBounds(6, 6, 190, 29);
		contentPanel.add(sliderX);
		
		sliderY = new JSlider(200,1000,Minesweeper.getWindowSizeY());
		sliderY.setSnapToTicks(true);
		sliderY.setPaintTicks(true);
		sliderY.setPaintLabels(true);
		sliderY.addChangeListener(this);
		sliderY.setBounds(6, 62, 190, 29);
		contentPanel.add(sliderY);
		
		txtChooseHorizontalSize = new JTextField();
		txtChooseHorizontalSize.setHorizontalAlignment(SwingConstants.CENTER);
		txtChooseHorizontalSize.setFont(new Font("Arial", Font.PLAIN, 10));
		txtChooseHorizontalSize.setEditable(false);
		txtChooseHorizontalSize.setText("Choose Horizontal Size of Board");
		if(Minesweeper.getLanguage() == "SPANISH") {
			txtChooseHorizontalSize.setText("Elige el Tamno del Tablero Horizontal");
		}
		txtChooseHorizontalSize.setBounds(6, 34, 188, 26);
		contentPanel.add(txtChooseHorizontalSize);
		txtChooseHorizontalSize.setColumns(10);
		
		txtChooseVerticalSize = new JTextField();
		txtChooseVerticalSize.setHorizontalAlignment(SwingConstants.CENTER);
		txtChooseVerticalSize.setFont(new Font("Arial", Font.PLAIN, 10));
		txtChooseVerticalSize.setText("Choose Vertical Size of Board");
		if(Minesweeper.getLanguage() == "SPANISH") {
			txtChooseVerticalSize.setText("Elige el Tamano del Tablero Vertical");
		}
		txtChooseVerticalSize.setEditable(false);
		txtChooseVerticalSize.setBounds(6, 96, 188, 26);
		contentPanel.add(txtChooseVerticalSize);
		txtChooseVerticalSize.setColumns(10);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(112, 143, 82, 29);
		contentPanel.add(btnOk);
		btnOk.addActionListener(this);
	}

	@Override
	public void stateChanged(ChangeEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource().equals(sliderX)) {
			Minesweeper.setWindowSizeX(sliderX.getValue());
		} else if(event.getSource().equals(sliderY)) {
			Minesweeper.setWindowSizeY(sliderY.getValue());
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource().equals(btnOk)) {
			this.dispose();
		}
	}
}
