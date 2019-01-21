package Minesweeper;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class Colours extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnOk;
	private JTextField txtMine;
	private JTextField txtFlag;
	private JTextField txtOne;
	private JTextField txtTwo;
	private JTextField txtThree;
	private JTextField txtFour;
	private JTextField txtFive;
	private JTextField txtOther;
	private JRadioButton rdbtnMineBlack;
	private JRadioButton rdbtnFlagBlack;
	private JRadioButton rdbtnOneBlack;
	private JRadioButton rdbtnTwoBlack;
	private JRadioButton rdbtnThreeBlack;
	private JRadioButton rdbtnFourBlack;
	private JRadioButton rdbtnFiveBlack;
	private JRadioButton rdbtnOtherBlack;
	private JRadioButton rdbtnMineRed;
	private JRadioButton rdbtnFlagRed;
	private JRadioButton rdbtnOneRed;
	private JRadioButton rdbtnTwoRed;
	private JRadioButton rdbtnThreeRed;
	private JRadioButton rdbtnFourRed;
	private JRadioButton rdbtnFiveRed;
	private JRadioButton rdbtnOtherRed;
	private JRadioButton rdbtnMineOrange;
	private JRadioButton rdbtnFlagOrange;
	private JRadioButton rdbtnOneOrange;
	private JRadioButton rdbtnTwoOrange;
	private JRadioButton rdbtnThreeOrange;
	private JRadioButton rdbtnFourOrange;
	private JRadioButton rdbtnFiveOrange;
	private JRadioButton rdbtnOtherOrange;
	private JRadioButton rdbtnMineYellow;
	private JRadioButton rdbtnFlagYellow;
	private JRadioButton rdbtnOneYellow;
	private JRadioButton rdbtnTwoYellow;
	private JRadioButton rdbtnThreeYellow;
	private JRadioButton rdbtnFourYellow;
	private JRadioButton rdbtnFiveYellow;
	private JRadioButton rdbtnOtherYellow;
	private JRadioButton rdbtnMineGreen;
	private JRadioButton rdbtnFlagGreen;
	private JRadioButton rdbtnOneGreen;
	private JRadioButton rdbtnTwoGreen;
	private JRadioButton rdbtnThreeGreen;
	private JRadioButton rdbtnFourGreen;
	private JRadioButton rdbtnFiveGreen;
	private JRadioButton rdbtnOtherGreen;
	private JRadioButton rdbtnMineBlue;
	private JRadioButton rdbtnFlagBlue;
	private JRadioButton rdbtnOneBlue;
	private JRadioButton rdbtnTwoBlue;
	private JRadioButton rdbtnThreeBlue;
	private JRadioButton rdbtnFourBlue;
	private JRadioButton rdbtnFiveBlue;
	private JRadioButton rdbtnOtherBlue;
	private JRadioButton rdbtnMinePink;
	private JRadioButton rdbtnFlagPink;
	private JRadioButton rdbtnOnePink;
	private JRadioButton rdbtnTwoPink;
	private JRadioButton rdbtnThreePink;
	private JRadioButton rdbtnFourPink;
	private JRadioButton rdbtnFivePink;
	private JRadioButton rdbtnOtherPink;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Colours dialog = new Colours();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Colours() {
		setBounds(0, 0, 750, 375);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtMine = new JTextField();
			txtMine.setHorizontalAlignment(SwingConstants.CENTER);
			txtMine.setEditable(false);
			txtMine.setFont(new Font("Arial", Font.PLAIN, 10));
			txtMine.setText("Choose Mine Colour");
			txtMine.setBounds(6, 6, 130, 26);
			contentPanel.add(txtMine);
			txtMine.setColumns(10);
		}
		{
			txtFlag = new JTextField();
			txtFlag.setEditable(false);
			txtFlag.setHorizontalAlignment(SwingConstants.CENTER);
			txtFlag.setFont(new Font("Arial", Font.PLAIN, 10));
			txtFlag.setText("Choose Flag Colour");
			txtFlag.setBounds(6, 44, 130, 26);
			contentPanel.add(txtFlag);
			txtFlag.setColumns(10);
		}
		{
			txtOne = new JTextField();
			txtOne.setEditable(false);
			txtOne.setFont(new Font("Arial", Font.PLAIN, 10));
			txtOne.setHorizontalAlignment(SwingConstants.CENTER);
			txtOne.setText("Choose One Colour");
			txtOne.setBounds(6, 82, 130, 26);
			contentPanel.add(txtOne);
			txtOne.setColumns(10);
		}
		{
			txtTwo = new JTextField();
			txtTwo.setFont(new Font("Arial", Font.PLAIN, 10));
			txtTwo.setHorizontalAlignment(SwingConstants.CENTER);
			txtTwo.setEditable(false);
			txtTwo.setText("Choose Two Colour");
			txtTwo.setBounds(6, 120, 130, 26);
			contentPanel.add(txtTwo);
			txtTwo.setColumns(10);
		}
		{
			txtThree = new JTextField();
			txtThree.setText("Choose Three Colour");
			txtThree.setFont(new Font("Arial", Font.PLAIN, 10));
			txtThree.setEditable(false);
			txtThree.setHorizontalAlignment(SwingConstants.CENTER);
			txtThree.setBounds(6, 158, 130, 26);
			contentPanel.add(txtThree);
			txtThree.setColumns(10);
		}
		{
			txtFour = new JTextField();
			txtFour.setHorizontalAlignment(SwingConstants.CENTER);
			txtFour.setFont(new Font("Arial", Font.PLAIN, 10));
			txtFour.setText("Choose Four Colour");
			txtFour.setEditable(false);
			txtFour.setBounds(6, 196, 130, 26);
			contentPanel.add(txtFour);
			txtFour.setColumns(10);
		}
		{
			txtFive = new JTextField();
			txtFive.setFont(new Font("Arial", Font.PLAIN, 10));
			txtFive.setText("Choose Five Colour");
			txtFive.setHorizontalAlignment(SwingConstants.CENTER);
			txtFive.setEditable(false);
			txtFive.setBounds(6, 234, 130, 26);
			contentPanel.add(txtFive);
			txtFive.setColumns(10);
		}
		{
			txtOther = new JTextField();
			txtOther.setText("Choose Other Colour");
			txtOther.setHorizontalAlignment(SwingConstants.CENTER);
			txtOther.setFont(new Font("Arial", Font.PLAIN, 10));
			txtOther.setEditable(false);
			txtOther.setBounds(6, 272, 130, 26);
			contentPanel.add(txtOther);
			txtOther.setColumns(10);
		}
		
		rdbtnMineBlack = new JRadioButton("Black");
		rdbtnMineBlack.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnMineBlack.setBounds(148, 5, 70, 23);
		contentPanel.add(rdbtnMineBlack);
		rdbtnMineBlack.addActionListener(this);
		
		rdbtnFlagBlack = new JRadioButton("Black");
		rdbtnFlagBlack.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFlagBlack.setBounds(148, 43, 70, 23);
		contentPanel.add(rdbtnFlagBlack);
		rdbtnFlagBlack.addActionListener(this);
		
		rdbtnOneBlack = new JRadioButton("Black");
		rdbtnOneBlack.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOneBlack.setBounds(148, 81, 70, 23);
		contentPanel.add(rdbtnOneBlack);
		rdbtnOneBlack.addActionListener(this);
		
		rdbtnTwoBlack = new JRadioButton("Black");
		rdbtnTwoBlack.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnTwoBlack.setBounds(148, 119, 70, 23);
		contentPanel.add(rdbtnTwoBlack);
		rdbtnTwoBlack.addActionListener(this);
		
		rdbtnThreeBlack = new JRadioButton("Black");
		rdbtnThreeBlack.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnThreeBlack.setBounds(148, 157, 70, 23);
		contentPanel.add(rdbtnThreeBlack);
		rdbtnThreeBlack.addActionListener(this);
		
		rdbtnFourBlack = new JRadioButton("Black");
		rdbtnFourBlack.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFourBlack.setBounds(148, 195, 70, 23);
		contentPanel.add(rdbtnFourBlack);
		rdbtnFourBlack.addActionListener(this);
		
		rdbtnFiveBlack = new JRadioButton("Black");
		rdbtnFiveBlack.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFiveBlack.setBounds(148, 237, 70, 23);
		contentPanel.add(rdbtnFiveBlack);
		rdbtnFiveBlack.addActionListener(this);
		
		rdbtnOtherBlack = new JRadioButton("Black");
		rdbtnOtherBlack.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOtherBlack.setBounds(148, 275, 70, 23);
		contentPanel.add(rdbtnOtherBlack);
		rdbtnOtherBlack.addActionListener(this);
		
		rdbtnMineRed = new JRadioButton("Red");
		rdbtnMineRed.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnMineRed.setBounds(230, 5, 70, 23);
		contentPanel.add(rdbtnMineRed);
		rdbtnMineRed.addActionListener(this);
		
		rdbtnFlagRed = new JRadioButton("Red");
		rdbtnFlagRed.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFlagRed.setBounds(230, 43, 70, 23);
		contentPanel.add(rdbtnFlagRed);
		rdbtnFlagRed.addActionListener(this);
		
		rdbtnOneRed = new JRadioButton("Red");
		rdbtnOneRed.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOneRed.setBounds(230, 81, 70, 23);
		contentPanel.add(rdbtnOneRed);
		rdbtnOneRed.addActionListener(this);
		
		rdbtnTwoRed = new JRadioButton("Red");
		rdbtnTwoRed.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnTwoRed.setBounds(230, 119, 70, 23);
		contentPanel.add(rdbtnTwoRed);
		rdbtnTwoRed.addActionListener(this);
		
		rdbtnThreeRed = new JRadioButton("Red");
		rdbtnThreeRed.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnThreeRed.setBounds(230, 157, 70, 23);
		contentPanel.add(rdbtnThreeRed);
		rdbtnThreeRed.addActionListener(this);
		
		rdbtnFourRed = new JRadioButton("Red");
		rdbtnFourRed.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFourRed.setBounds(230, 195, 70, 23);
		contentPanel.add(rdbtnFourRed);
		rdbtnFourRed.addActionListener(this);
		
		rdbtnFiveRed = new JRadioButton("Red");
		rdbtnFiveRed.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFiveRed.setBounds(230, 233, 70, 23);
		contentPanel.add(rdbtnFiveRed);
		rdbtnFiveRed.addActionListener(this);
		
		rdbtnOtherRed = new JRadioButton("Red");
		rdbtnOtherRed.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOtherRed.setBounds(230, 275, 70, 23);
		contentPanel.add(rdbtnOtherRed);
		rdbtnOtherRed.addActionListener(this);
		
		rdbtnMineOrange = new JRadioButton("Orange");
		rdbtnMineOrange.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnMineOrange.setBounds(312, 5, 70, 23);
		contentPanel.add(rdbtnMineOrange);
		rdbtnMineOrange.addActionListener(this);
		
		rdbtnFlagOrange = new JRadioButton("Orange");
		rdbtnFlagOrange.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFlagOrange.setBounds(312, 43, 70, 23);
		contentPanel.add(rdbtnFlagOrange);
		rdbtnFlagOrange.addActionListener(this);
		
		rdbtnOneOrange = new JRadioButton("Orange");
		rdbtnOneOrange.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOneOrange.setBounds(312, 81, 70, 23);
		contentPanel.add(rdbtnOneOrange);
		rdbtnOneOrange.addActionListener(this);
		
		rdbtnTwoOrange = new JRadioButton("Orange");
		rdbtnTwoOrange.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnTwoOrange.setBounds(312, 119, 70, 23);
		contentPanel.add(rdbtnTwoOrange);
		rdbtnTwoOrange.addActionListener(this);
		
		rdbtnThreeOrange = new JRadioButton("Orange");
		rdbtnThreeOrange.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnThreeOrange.setBounds(312, 157, 70, 23);
		contentPanel.add(rdbtnThreeOrange);
		rdbtnThreeOrange.addActionListener(this);
		
		rdbtnFourOrange = new JRadioButton("Orange");
		rdbtnFourOrange.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFourOrange.setBounds(312, 195, 70, 23);
		contentPanel.add(rdbtnFourOrange);
		rdbtnFourOrange.addActionListener(this);
		
		rdbtnFiveOrange = new JRadioButton("Orange");
		rdbtnFiveOrange.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFiveOrange.setBounds(312, 233, 70, 23);
		contentPanel.add(rdbtnFiveOrange);
		rdbtnFiveOrange.addActionListener(this);
		
		rdbtnOtherOrange = new JRadioButton("Orange");
		rdbtnOtherOrange.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOtherOrange.setBounds(312, 271, 70, 23);
		contentPanel.add(rdbtnOtherOrange);
		rdbtnOtherOrange.addActionListener(this);
		
		rdbtnMineYellow = new JRadioButton("Yellow");
		rdbtnMineYellow.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnMineYellow.setBounds(394, 5, 70, 23);
		contentPanel.add(rdbtnMineYellow);
		rdbtnMineYellow.addActionListener(this);
		
		rdbtnFlagYellow = new JRadioButton("Yellow");
		rdbtnFlagYellow.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFlagYellow.setBounds(394, 43, 70, 23);
		contentPanel.add(rdbtnFlagYellow);
		rdbtnFlagYellow.addActionListener(this);
		
		rdbtnOneYellow = new JRadioButton("Yellow");
		rdbtnOneYellow.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOneYellow.setBounds(394, 81, 70, 23);
		contentPanel.add(rdbtnOneYellow);
		rdbtnOneYellow.addActionListener(this);
		
		rdbtnTwoYellow = new JRadioButton("Yellow");
		rdbtnTwoYellow.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnTwoYellow.setBounds(394, 119, 70, 23);
		contentPanel.add(rdbtnTwoYellow);
		rdbtnTwoYellow.addActionListener(this);
		
		rdbtnThreeYellow = new JRadioButton("Yellow");
		rdbtnThreeYellow.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnThreeYellow.setBounds(394, 157, 70, 23);
		contentPanel.add(rdbtnThreeYellow);
		rdbtnThreeYellow.addActionListener(this);
		
		rdbtnFourYellow = new JRadioButton("Yellow");
		rdbtnFourYellow.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFourYellow.setBounds(394, 195, 70, 23);
		contentPanel.add(rdbtnFourYellow);
		rdbtnFourYellow.addActionListener(this);
		
		rdbtnFiveYellow = new JRadioButton("Yellow");
		rdbtnFiveYellow.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFiveYellow.setBounds(394, 233, 70, 23);
		contentPanel.add(rdbtnFiveYellow);
		rdbtnFiveYellow.addActionListener(this);
		
		rdbtnOtherYellow = new JRadioButton("Yellow");
		rdbtnOtherYellow.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOtherYellow.setBounds(394, 271, 70, 23);
		contentPanel.add(rdbtnOtherYellow);
		rdbtnOtherYellow.addActionListener(this);
		
		rdbtnMineGreen = new JRadioButton("Green");
		rdbtnMineGreen.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnMineGreen.setBounds(476, 5, 70, 23);
		contentPanel.add(rdbtnMineGreen);
		rdbtnMineGreen.addActionListener(this);
		
		rdbtnFlagGreen = new JRadioButton("Green");
		rdbtnFlagGreen.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFlagGreen.setBounds(476, 43, 70, 23);
		contentPanel.add(rdbtnFlagGreen);
		rdbtnFlagGreen.addActionListener(this);
		
		rdbtnOneGreen = new JRadioButton("Green");
		rdbtnOneGreen.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOneGreen.setBounds(476, 81, 70, 23);
		contentPanel.add(rdbtnOneGreen);
		rdbtnOneGreen.addActionListener(this);
		
		rdbtnTwoGreen = new JRadioButton("Green");
		rdbtnTwoGreen.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnTwoGreen.setBounds(476, 119, 70, 23);
		contentPanel.add(rdbtnTwoGreen);
		rdbtnTwoGreen.addActionListener(this);
		
		rdbtnThreeGreen = new JRadioButton("Green");
		rdbtnThreeGreen.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnThreeGreen.setBounds(476, 157, 70, 23);
		contentPanel.add(rdbtnThreeGreen);
		rdbtnThreeGreen.addActionListener(this);
		
		rdbtnFourGreen = new JRadioButton("Green");
		rdbtnFourGreen.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFourGreen.setBounds(476, 195, 70, 23);
		contentPanel.add(rdbtnFourGreen);
		rdbtnFourGreen.addActionListener(this);
		
		rdbtnFiveGreen = new JRadioButton("Green");
		rdbtnFiveGreen.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFiveGreen.setBounds(476, 233, 70, 23);
		contentPanel.add(rdbtnFiveGreen);
		rdbtnFiveGreen.addActionListener(this);
		
		rdbtnOtherGreen = new JRadioButton("Green");
		rdbtnOtherGreen.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOtherGreen.setBounds(476, 271, 70, 23);
		contentPanel.add(rdbtnOtherGreen);
		rdbtnOtherGreen.addActionListener(this);
		
		rdbtnMineBlue = new JRadioButton("Blue");
		rdbtnMineBlue.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnMineBlue.setBounds(558, 5, 70, 23);
		contentPanel.add(rdbtnMineBlue);
		rdbtnMineBlue.addActionListener(this);
		
		rdbtnFlagBlue = new JRadioButton("Blue");
		rdbtnFlagBlue.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFlagBlue.setBounds(558, 43, 70, 23);
		contentPanel.add(rdbtnFlagBlue);
		rdbtnFlagBlue.addActionListener(this);
		
		rdbtnOneBlue = new JRadioButton("Blue");
		rdbtnOneBlue.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOneBlue.setBounds(558, 81, 70, 23);
		contentPanel.add(rdbtnOneBlue);
		rdbtnOneBlue.addActionListener(this);
		
		rdbtnTwoBlue = new JRadioButton("Blue");
		rdbtnTwoBlue.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnTwoBlue.setBounds(558, 119, 70, 23);
		contentPanel.add(rdbtnTwoBlue);
		rdbtnTwoBlue.addActionListener(this);
		
		rdbtnThreeBlue = new JRadioButton("Blue");
		rdbtnThreeBlue.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnThreeBlue.setBounds(558, 157, 70, 23);
		contentPanel.add(rdbtnThreeBlue);
		rdbtnThreeBlue.addActionListener(this);
		
		rdbtnFourBlue = new JRadioButton("Blue");
		rdbtnFourBlue.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFourBlue.setBounds(558, 195, 70, 23);
		contentPanel.add(rdbtnFourBlue);
		rdbtnFourBlue.addActionListener(this);
		
		rdbtnFiveBlue = new JRadioButton("Blue");
		rdbtnFiveBlue.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFiveBlue.setBounds(558, 233, 70, 23);
		contentPanel.add(rdbtnFiveBlue);
		rdbtnFiveBlue.addActionListener(this);
		
		rdbtnOtherBlue = new JRadioButton("Blue");
		rdbtnOtherBlue.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOtherBlue.setBounds(558, 271, 70, 23);
		contentPanel.add(rdbtnOtherBlue);
		rdbtnOtherBlue.addActionListener(this);
		
		rdbtnMinePink = new JRadioButton("Pink");
		rdbtnMinePink.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnMinePink.setBounds(640, 5, 70, 23);
		contentPanel.add(rdbtnMinePink);
		rdbtnMinePink.addActionListener(this);
		
		rdbtnFlagPink = new JRadioButton("Pink");
		rdbtnFlagPink.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFlagPink.setBounds(640, 43, 70, 23);
		contentPanel.add(rdbtnFlagPink);
		rdbtnFlagPink.addActionListener(this);
		
		rdbtnOnePink = new JRadioButton("Pink");
		rdbtnOnePink.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOnePink.setBounds(640, 81, 70, 23);
		contentPanel.add(rdbtnOnePink);
		rdbtnOnePink.addActionListener(this);
		
		rdbtnTwoPink = new JRadioButton("Pink");
		rdbtnTwoPink.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnTwoPink.setBounds(640, 119, 70, 23);
		contentPanel.add(rdbtnTwoPink);
		rdbtnTwoPink.addActionListener(this);
		
		rdbtnThreePink = new JRadioButton("Pink");
		rdbtnThreePink.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnThreePink.setBounds(640, 157, 70, 23);
		contentPanel.add(rdbtnThreePink);
		rdbtnThreePink.addActionListener(this);
		
		rdbtnFourPink = new JRadioButton("Pink");
		rdbtnFourPink.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFourPink.setBounds(640, 195, 70, 23);
		contentPanel.add(rdbtnFourPink);
		rdbtnFourPink.addActionListener(this);
		
		rdbtnFivePink = new JRadioButton("Pink");
		rdbtnFivePink.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFivePink.setBounds(640, 233, 70, 23);
		contentPanel.add(rdbtnFivePink);
		rdbtnFivePink.addActionListener(this);
		
		rdbtnOtherPink = new JRadioButton("Pink");
		rdbtnOtherPink.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnOtherPink.setBounds(640, 271, 70, 23);
		contentPanel.add(rdbtnOtherPink);
		rdbtnOtherPink.addActionListener(this);
		
		ButtonGroup mine = new ButtonGroup();
		mine.add(rdbtnMineBlack);
		mine.add(rdbtnMineBlue);
		mine.add(rdbtnMineGreen);
		mine.add(rdbtnMineOrange);
		mine.add(rdbtnMinePink);
		mine.add(rdbtnMineRed);
		mine.add(rdbtnMineYellow);
		
		ButtonGroup flag = new ButtonGroup();
		flag.add(rdbtnFlagBlack);
		flag.add(rdbtnFlagBlue);
		flag.add(rdbtnFlagGreen);
		flag.add(rdbtnFlagOrange);
		flag.add(rdbtnFlagPink);
		flag.add(rdbtnFlagPink);
		flag.add(rdbtnFlagRed);
		flag.add(rdbtnFlagYellow);
		
		ButtonGroup one = new ButtonGroup();
		one.add(rdbtnOneBlack);
		one.add(rdbtnOneBlue);
		one.add(rdbtnOneGreen);
		one.add(rdbtnOneOrange);
		one.add(rdbtnOnePink);
		one.add(rdbtnOneRed);
		one.add(rdbtnOneRed);
		one.add(rdbtnOneYellow);
		
		ButtonGroup two = new ButtonGroup();
		two.add(rdbtnTwoBlack);
		two.add(rdbtnTwoBlue);
		two.add(rdbtnTwoGreen);
		two.add(rdbtnTwoOrange);
		two.add(rdbtnTwoPink);
		two.add(rdbtnTwoRed);
		two.add(rdbtnTwoYellow);
		
		ButtonGroup three = new ButtonGroup();
		three.add(rdbtnThreeBlack);
		three.add(rdbtnThreeBlue);
		three.add(rdbtnThreeGreen);
		three.add(rdbtnThreeOrange);
		three.add(rdbtnThreePink);
		three.add(rdbtnThreeRed);
		three.add(rdbtnThreeYellow);
		
		ButtonGroup four = new ButtonGroup();
		four.add(rdbtnFourBlack);
		four.add(rdbtnFourBlue);
		four.add(rdbtnFourGreen);
		four.add(rdbtnFourOrange);
		four.add(rdbtnFourPink);
		four.add(rdbtnFourRed);
		four.add(rdbtnFourYellow);

		ButtonGroup five = new ButtonGroup();
		five.add(rdbtnFiveBlack);
		five.add(rdbtnFiveBlue);
		five.add(rdbtnFiveGreen);
		five.add(rdbtnFiveOrange);
		five.add(rdbtnFivePink);
		five.add(rdbtnFiveRed);
		five.add(rdbtnFiveYellow);
		
		ButtonGroup other = new ButtonGroup();
		other.add(rdbtnOtherBlack);
		other.add(rdbtnOtherBlue);
		other.add(rdbtnOtherGreen);
		other.add(rdbtnOtherOrange);
		other.add(rdbtnOtherPink);
		other.add(rdbtnOtherRed);
		other.add(rdbtnOtherYellow);
		
		if(Minesweeper.getLanguage() == "SPANISH") {
			rdbtnMineBlack.setText("Negro");
			rdbtnFlagBlack.setText("Negro");
			rdbtnOneBlack.setText("Negro");
			rdbtnTwoBlack.setText("Negro");
			rdbtnThreeBlack.setText("Negro");
			rdbtnFourBlack.setText("Negro");
			rdbtnFiveBlack.setText("Negro");
			rdbtnOtherBlack.setText("Negro");
			
			rdbtnMineRed.setText("Rojo");
			rdbtnFlagRed.setText("Rojo");
			rdbtnOneRed.setText("Rojo");
			rdbtnTwoRed.setText("Rojo");
			rdbtnThreeRed.setText("Rojo");
			rdbtnFourRed.setText("Rojo");
			rdbtnFiveRed.setText("Rojo");
			rdbtnOtherRed.setText("Rojo");
			
			rdbtnMineOrange.setText("Anaranjado");
			rdbtnFlagOrange.setText("Anaranjado");
			rdbtnOneOrange.setText("Anaranjado");
			rdbtnTwoOrange.setText("Anaranjado");
			rdbtnThreeOrange.setText("Anaranjado");
			rdbtnFourOrange.setText("Anaranjado");
			rdbtnFiveOrange.setText("Anaranjado");
			rdbtnOtherOrange.setText("Anaranjado");
			
			rdbtnMineYellow.setText("Amarillo");
			rdbtnFlagYellow.setText("Amarillo");
			rdbtnOneYellow.setText("Amarillo");
			rdbtnTwoYellow.setText("Amarillo");
			rdbtnThreeYellow.setText("Amarillo");
			rdbtnFourYellow.setText("Amarillo");
			rdbtnFiveYellow.setText("Amarillo");
			rdbtnOtherYellow.setText("Amarillo");
			
			rdbtnMineGreen.setText("Verde");
			rdbtnFlagGreen.setText("Verde");
			rdbtnOneGreen.setText("Verde");
			rdbtnTwoGreen.setText("Verde");
			rdbtnThreeGreen.setText("Verde");
			rdbtnFourGreen.setText("Verde");
			rdbtnFiveGreen.setText("Verde");
			rdbtnOtherGreen.setText("Verde");
			
			rdbtnMineBlue.setText("Azul");
			rdbtnFlagBlue.setText("Azul");
			rdbtnOneBlue.setText("Azul");
			rdbtnTwoBlue.setText("Azul");
			rdbtnThreeBlue.setText("Azul");
			rdbtnFourBlue.setText("Azul");
			rdbtnFiveBlue.setText("Azul");
			rdbtnOtherBlue.setText("Azul");
			
			rdbtnMinePink.setText("Rosado");
			rdbtnFlagPink.setText("Rosado");
			rdbtnOnePink.setText("Rosado");
			rdbtnTwoPink.setText("Rosado");
			rdbtnThreePink.setText("Rosado");
			rdbtnFourPink.setText("Rosado");
			rdbtnFivePink.setText("Rosado");
			rdbtnOtherPink.setText("Rosado");
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
		rdbtnMineRed.setSelected(true);
		rdbtnFlagRed.setSelected(true);
		rdbtnOneBlack.setSelected(true);
		rdbtnTwoBlue.setSelected(true);
		rdbtnThreeGreen.setSelected(true);
		rdbtnFourYellow.setSelected(true);
		rdbtnFiveOrange.setSelected(true);
		rdbtnOtherPink.setSelected(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource().equals(btnOk)) {
			this.dispose();
		} else if(event.getSource().equals(rdbtnMineBlack)) {
			Minesweeper.setMineColour(Color.black);
		} else if(event.getSource().equals(rdbtnMineRed)) {
			Minesweeper.setMineColour(Color.red);
		} else if(event.getSource().equals(rdbtnMineOrange)) {
			Minesweeper.setMineColour(Color.orange);
		} else if(event.getSource().equals(rdbtnMineYellow)) {
			Minesweeper.setMineColour(Color.yellow);
		} else if(event.getSource().equals(rdbtnMineGreen)) {
			Minesweeper.setMineColour(Color.green);
		} else if(event.getSource().equals(rdbtnMineBlue)) {
			Minesweeper.setMineColour(Color.blue);
		} else if(event.getSource().equals(rdbtnMinePink)) {
			Minesweeper.setMineColour(Color.pink);
		} else if(event.getSource().equals(rdbtnFlagBlack)) {
			Minesweeper.setFlagColour(Color.black);
		} else if(event.getSource().equals(rdbtnFlagRed)) {
			Minesweeper.setFlagColour(Color.red);
		} else if(event.getSource().equals(rdbtnFlagOrange)) {
			Minesweeper.setFlagColour(Color.orange);
		} else if(event.getSource().equals(rdbtnFlagYellow)) {
			Minesweeper.setFlagColour(Color.yellow);
		} else if(event.getSource().equals(rdbtnFlagGreen)) {
			Minesweeper.setFlagColour(Color.green);
		} else if(event.getSource().equals(rdbtnFlagBlue)) {
			Minesweeper.setFlagColour(Color.blue);
		} else if(event.getSource().equals(rdbtnFlagPink)) {
			Minesweeper.setFlagColour(Color.pink);
		} else if(event.getSource().equals(rdbtnOneBlack)) {
			Minesweeper.setOneColour(Color.black);
		} else if(event.getSource().equals(rdbtnOneRed)) {
			Minesweeper.setOneColour(Color.red);
		} else if(event.getSource().equals(rdbtnOneOrange)) {
			Minesweeper.setOneColour(Color.orange);
		} else if(event.getSource().equals(rdbtnOneYellow)) {
			Minesweeper.setOneColour(Color.yellow);
		} else if(event.getSource().equals(rdbtnOneGreen)) {
			Minesweeper.setOneColour(Color.green);
		} else if(event.getSource().equals(rdbtnOneBlue)) {
			Minesweeper.setOneColour(Color.blue);
		} else if(event.getSource().equals(rdbtnOnePink)) {
			Minesweeper.setOneColour(Color.pink);
		} else if(event.getSource().equals(rdbtnTwoBlack)) {
			Minesweeper.setTwoColour(Color.black);
		} else if(event.getSource().equals(rdbtnTwoRed)) {
			Minesweeper.setTwoColour(Color.red);
		} else if(event.getSource().equals(rdbtnTwoOrange)) {
			Minesweeper.setTwoColour(Color.orange);
		} else if(event.getSource().equals(rdbtnTwoYellow)) {
			Minesweeper.setTwoColour(Color.yellow);
		} else if(event.getSource().equals(rdbtnTwoGreen)) {
			Minesweeper.setTwoColour(Color.green);
		} else if(event.getSource().equals(rdbtnTwoBlue)) {
			Minesweeper.setTwoColour(Color.blue);
		} else if(event.getSource().equals(rdbtnTwoPink)) {
			Minesweeper.setTwoColour(Color.pink);
		} else if(event.getSource().equals(rdbtnThreeBlack)) {
			Minesweeper.setThreeColour(Color.black);
		} else if(event.getSource().equals(rdbtnThreeRed)) {
			Minesweeper.setThreeColour(Color.red);
		} else if(event.getSource().equals(rdbtnThreeOrange)) {
			Minesweeper.setThreeColour(Color.orange);
		} else if(event.getSource().equals(rdbtnThreeYellow)) {
			Minesweeper.setThreeColour(Color.yellow);
		} else if(event.getSource().equals(rdbtnThreeGreen)) {
			Minesweeper.setThreeColour(Color.green);
		} else if(event.getSource().equals(rdbtnThreeBlue)) {
			Minesweeper.setThreeColour(Color.blue);
		} else if(event.getSource().equals(rdbtnThreePink)) {
			Minesweeper.setThreeColour(Color.pink);
		} else if(event.getSource().equals(rdbtnFourBlack)) {
			Minesweeper.setFourColour(Color.black);
		} else if(event.getSource().equals(rdbtnFourRed)) {
			Minesweeper.setFourColour(Color.red);
		} else if(event.getSource().equals(rdbtnFourOrange)) {
			Minesweeper.setFourColour(Color.orange);
		} else if(event.getSource().equals(rdbtnFourYellow)) {
			Minesweeper.setFourColour(Color.yellow);
		} else if(event.getSource().equals(rdbtnFourGreen)) {
			Minesweeper.setFourColour(Color.green);
		} else if(event.getSource().equals(rdbtnFourBlue)) {
			Minesweeper.setFourColour(Color.blue);
		} else if(event.getSource().equals(rdbtnFourPink)) {
			Minesweeper.setFourColour(Color.pink);
		} else if(event.getSource().equals(rdbtnFiveBlack)) {
			Minesweeper.setFiveColour(Color.black);
		} else if(event.getSource().equals(rdbtnFiveRed)) {
			Minesweeper.setFiveColour(Color.red);
		} else if(event.getSource().equals(rdbtnFiveOrange)) {
			Minesweeper.setFiveColour(Color.orange);
		} else if(event.getSource().equals(rdbtnFiveYellow)) {
			Minesweeper.setFiveColour(Color.yellow);
		} else if(event.getSource().equals(rdbtnFiveGreen)) {
			Minesweeper.setFiveColour(Color.green);
		} else if(event.getSource().equals(rdbtnFiveBlue)) {
			Minesweeper.setFiveColour(Color.blue);
		} else if(event.getSource().equals(rdbtnFivePink)) {
			Minesweeper.setFiveColour(Color.pink);
		} else if(event.getSource().equals(rdbtnOtherBlack)) {
			Minesweeper.setOtherColour(Color.black);
		} else if(event.getSource().equals(rdbtnOtherRed)) {
			Minesweeper.setOtherColour(Color.red);
		} else if(event.getSource().equals(rdbtnOtherOrange)) {
			Minesweeper.setOtherColour(Color.orange);
		} else if(event.getSource().equals(rdbtnOtherYellow)) {
			Minesweeper.setOtherColour(Color.yellow);
		} else if(event.getSource().equals(rdbtnOtherGreen)) {
			Minesweeper.setOtherColour(Color.green);
		} else if(event.getSource().equals(rdbtnOtherBlue)) {
			Minesweeper.setOtherColour(Color.blue);
		} else if(event.getSource().equals(rdbtnOtherPink)) {
			Minesweeper.setOtherColour(Color.pink);
		}
	}
}
