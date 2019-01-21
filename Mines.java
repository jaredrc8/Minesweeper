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
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Mines extends JDialog implements ActionListener, ChangeListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnOk;
	private JSlider sliderX;
	private JSlider sliderY;
	private JSlider sliderMineCount;
	private JTextField txtgridX;
	private JTextField txtgridY;
	private JTextField txtMineCount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mines dialog = new Mines();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mines() {
		setBounds(0, 0, 200, 250);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		sliderX = new JSlider();
		sliderX.addChangeListener(this);
		sliderX.setSnapToTicks(true);
		sliderX.setPaintTicks(true);
		sliderX.setPaintLabels(true);
		sliderX.setBounds(6, 6, 190, 29);
		sliderX.setValue(Minesweeper.getSizeX());
		sliderX.setMinimum(10);
		contentPanel.add(sliderX);
		
		sliderMineCount = new JSlider();
		sliderMineCount.addChangeListener(this);
		sliderMineCount.setPaintTicks(true);
		sliderMineCount.setPaintLabels(true);
		sliderMineCount.setSnapToTicks(true);
		sliderMineCount.setValue(Minesweeper.getMineCount());
		sliderMineCount.setBounds(6, 128, 190, 29);
		sliderMineCount.setMinimum(10);
		contentPanel.add(sliderMineCount);
		
		sliderY = new JSlider();
		sliderY.addChangeListener(this);
		sliderY.setSnapToTicks(true);
		sliderY.setPaintTicks(true);
		sliderY.setPaintLabels(true);
		sliderY.setBounds(6, 68, 190, 29);
		sliderY.setValue(Minesweeper.getSizeY());
		sliderY.setMinimum(10);
		contentPanel.add(sliderY);
		
		txtgridX = new JTextField();
		txtgridX.setHorizontalAlignment(SwingConstants.CENTER);
		txtgridX.setFont(new Font("Arial", Font.PLAIN, 10));
		txtgridX.setText("Choose Number of Horizontal Buttons");
		txtgridX.setBounds(6, 32, 188, 26);
		contentPanel.add(txtgridX);
		txtgridX.setColumns(10);
		
		txtgridY = new JTextField();
		txtgridY.setHorizontalAlignment(SwingConstants.CENTER);
		txtgridY.setFont(new Font("Arial", Font.PLAIN, 10));
		txtgridY.setText("Choose Number of Vertical Buttons");
		txtgridY.setBounds(6, 96, 190, 26);
		contentPanel.add(txtgridY);
		txtgridY.setColumns(10);
		
		txtMineCount = new JTextField();
		txtMineCount.setHorizontalAlignment(SwingConstants.CENTER);
		txtMineCount.setFont(new Font("Arial", Font.PLAIN, 10));
		txtMineCount.setText("Choose Number of Mines");
		txtMineCount.setBounds(6, 157, 190, 26);
		contentPanel.add(txtMineCount);
		txtMineCount.setColumns(10);
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
		if(event.getSource().equals(btnOk)) {
			this.dispose();
		}
	}

	@Override
	public void stateChanged(ChangeEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource().equals(sliderMineCount)) {
			Minesweeper.setMineCount(sliderMineCount.getValue());
		} else if(event.getSource().equals(sliderX)) {
			Minesweeper.setSizeX(sliderX.getValue());
		} else if(event.getSource().equals(sliderY)) {
			Minesweeper.setSizeY(sliderY.getValue());
		}
	}
}