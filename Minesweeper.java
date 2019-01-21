package Minesweeper;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Minesweeper extends JFrame implements MouseListener{
	
	private JFrame frame = new JFrame("Minesweeper");             //JFrame containing the game
	private JButton btnReset = new JButton("Reset");              //button returns game to original state
	private JButton btnSettings = new JButton("Settings");        //button opens JDialog to adjust settings
	private Container grid = new Container();                     //contains all buttons to place together in JFrame
	private JButton[][] btnButtons;                               //2D array of buttons
	private JDialog settingsPage = new Settings();                //settings page
	private JDialog winPage = new Win();        	              //"You win" screen
	private Random random = new Random();                         //used to create random mine placement
	
	private static int windowSizeX = 500;						  //size of horizontal window
	private static int windowSizeY = 500;                		  //size of vertical window
	private static int sizeX = 20;                                //# of buttons horizontally
	private static int sizeY = 20;                                //# of buttons vertically
	private static String language = "ENGLISH";                   //language setting
	private static int mineCount = 40;                            //used to keep track of # of mines
	private boolean gameStarted = false;                          //boolean if game has started
	private int[][] counts;                                       //mines and numerical values stored underneath buttons
	private final int MINE = -1;                                  //value given to mines
	private final String MINE_SYMBOL = "X";
	private final String FLAG_SYMBOL = "!";
	private static Color MINE_COLOUR = Color.RED;
	private static Color FLAG_COLOUR = Color.RED;
	private static Color ONE_COLOUR = Color.BLACK;
	private static Color TWO_COLOUR = Color.BLUE;
	private static Color THREE_COLOUR = Color.GREEN;
	private static Color FOUR_COLOUR = Color.YELLOW;
	private static Color FIVE_COLOUR = Color.ORANGE;
	private static Color OTHER_COLOUR = Color.PINK;
	
	public Minesweeper(int sizeX, int sizeY, int mines) {
		Minesweeper.sizeX = sizeX;
		Minesweeper.sizeY = sizeY;
		btnButtons = new JButton[Minesweeper.sizeX][Minesweeper.sizeY];
		counts = new int[Minesweeper.sizeX][Minesweeper.sizeY];
		Minesweeper.mineCount = mines;
		
		//create frame
		frame.setSize(windowSizeX, windowSizeY);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//add reset button and actionlistener
		frame.add(btnReset, BorderLayout.NORTH);
		btnReset.addMouseListener(this);
		
		//add grid containing 2D array of buttons
		grid.setLayout(new GridLayout(Minesweeper.sizeX,Minesweeper.sizeY));
		frame.add(grid, BorderLayout.CENTER);
		
		//add settings button and actionlistener
		btnSettings.addMouseListener(this);
		frame.add(btnSettings, BorderLayout.SOUTH);

		//add buttons to 2D button array
		for(int a = 0;a < btnButtons.length;a++) {
			for(int b = 0;b < btnButtons[0].length;b++) {
				btnButtons[a][b] = new JButton();
				btnButtons[a][b].addMouseListener(this);
				grid.add(btnButtons[a][b]);
			}
		}
		if(language == "SPANISH") {
			btnReset.setText("Reiniciar");
			btnSettings.setText("Ajustes");
		}
	}
	public void mousePressed(MouseEvent event) {
		if(gameStarted) { // if a first move has already been made
			if(event.getSource().equals(btnReset)) {
				clearMines();
				gameStarted = false;
			} else if(event.getSource().equals(btnSettings)) {
				settingsPage.setVisible(true);
			} else {
				for(int a = 0;a < btnButtons.length;a++) {
					for(int b = 0;b < btnButtons[0].length;b++) {
						if(event.getSource().equals(btnButtons[a][b]) && event.getButton() == MouseEvent.BUTTON1) { //if left click on button
							if(btnButtons[a][b].getText() != FLAG_SYMBOL) { // if buttons has been flagged do nothing
								if(counts[a][b] == MINE) { // if button is a mine
									btnButtons[a][b].setForeground(decideForegroundColor(a,b));
									btnButtons[a][b].setText(MINE_SYMBOL);
									lostGame();
								} else { // if buttons isn't a mine
									btnButtons[a][b].setForeground(decideForegroundColor(a,b));
									if(counts[a][b] == 0) {
										clearZeros(a,b);
									} else {
										btnButtons[a][b].setText(Integer.toString(counts[a][b]));
									}
									btnButtons[a][b].setEnabled(false);
									isGameWon();
								}
							}	
						} else if(event.getSource().equals(btnButtons[a][b]) && event.getButton() == MouseEvent.BUTTON3) { // if right click on button
							if(btnButtons[a][b].getText() == FLAG_SYMBOL) { // if button has already been flagged
								btnButtons[a][b].setText(null);
							} else { // if button has not been flagged
								btnButtons[a][b].setForeground(decideForegroundColor(a,b));
								btnButtons[a][b].setText(FLAG_SYMBOL);	
							}
						}
					}
				}
			}
		} else {
			gameStarted = true;
			for(int a = 0;a < btnButtons.length;a++) {
				for(int b = 0;b < btnButtons[0].length;b++) {
					if(event.getSource().equals(btnButtons[a][b])) {
						placeMines(a,b);
						clearZeros(a,b);
					}
				}
			}
		}
	}
	public boolean inProximityTo(int x1, int y1, int x2, int y2) {
		if((x1 == x2) || (x1 + 1 == x2) || (x1 - 1 == x2)) { //if x2 is within 1 space of x1
			if((y1 == y2) || (y1 + 1 == y2) || (y1 - 1 == y2)) { //if y2 is within 1 space of y1
				return true;
			}
		}
		return false;
	}
	public void placeMines(int a, int b) {
		//place random mines
		int indexX;
		int indexY;
		for(int i = 0;i < mineCount;i++) {
			indexX = random.nextInt(counts.length);
			indexY = random.nextInt(counts[0].length);
			//mines cannot be placed within 2 spaces of the first click so the first click is always 0
			if(counts[indexX][indexY] != MINE && inProximityTo(indexX,indexY,a,b) == false) {
				counts[indexX][indexY] = MINE;
			} else {
				i--;
			}
		}
		//place neighboring values
		for(int x = 0;x < counts.length;x++) {
			for(int y = 0;y < counts[0].length;y++) {
				if(counts[x][y] == MINE) {
					//top left
					if(validIndex(x-1,y-1)) {
						if(counts[x-1][y-1] != MINE) {
							counts[x-1][y-1]++;
						}
					}
					//top
					if(validIndex(x,y-1)) {
						if(counts[x][y-1] != MINE) {
							counts[x][y-1]++;
						}
					}
					//top right
					if(validIndex(x+1,y-1)) {
						if(counts[x+1][y-1] != MINE) {
							counts[x+1][y-1]++;
						}
					}
					//right
					if(validIndex(x+1,y)) {
						if(counts[x+1][y] != MINE) {
							counts[x+1][y]++;
						}
					}
					//bottom right
					if(validIndex(x+1,y+1)) {
						if(counts[x+1][y+1] != MINE) {
							counts[x+1][y+1]++;
						}
					}
					//bottom
					if(validIndex(x,y+1)) {
						if(counts[x][y+1] != MINE) {
							counts[x][y+1]++;
						}
					}
					//bottom left
					if(validIndex(x-1,y+1)) {
						if(counts[x-1][y+1] != MINE) {
							counts[x-1][y+1]++;
						}
					}
					//left
					if(validIndex(x-1,y)) {
						if(counts[x-1][y] != MINE) {
							counts[x-1][y]++;
						}
					}
				}
			}
		}
		
	}
	public void clearMines() {
		for(int a = 0;a < counts.length;a++) {
			for(int b = 0;b < counts[0].length;b++) {
				counts[a][b] = 0;
				btnButtons[a][b].setForeground(decideForegroundColor(a,b));
				btnButtons[a][b].setText(null);
				btnButtons[a][b].setEnabled(true);
			}
		}
	}
	public void lostGame() {
		for(int a = 0;a < btnButtons.length;a++) {
			for(int b = 0;b < btnButtons[0].length;b++) {
				if(btnButtons[a][b].isEnabled()) {
					if(counts[a][b] != MINE) {
						if(counts[a][b] != 0) {
							btnButtons[a][b].setText(Integer.toString(counts[a][b]));
							btnButtons[a][b].setEnabled(false);
						} else {
							btnButtons[a][b].setEnabled(false);
						}	
					} else {
						btnButtons[a][b].setForeground(decideForegroundColor(a,b));
						btnButtons[a][b].setText(MINE_SYMBOL);
						btnButtons[a][b].setEnabled(false);
					}
				}
				
			}
		}
	}
	public void isGameWon() {
		boolean gameWon = true;
		for(int a = 0;a < btnButtons.length;a++) {
			for(int b = 0;b < btnButtons[0].length;b++) {
				if(counts[a][b] != MINE && btnButtons[a][b].isEnabled()) {
					gameWon = false;
				}
			}
		}
		if(gameWon) {
			for(int a = 0;a < btnButtons.length;a++) {
				for(int b = 0;b < btnButtons[0].length;b++) {
					btnButtons[a][b].setEnabled(false);
					if(counts[a][b] == MINE) {
						btnButtons[a][b].setForeground(decideForegroundColor(a,b));
						btnButtons[a][b].setText(MINE_SYMBOL);
					} else if(counts[a][b] != 0) {
						btnButtons[a][b].setForeground(decideForegroundColor(a,b));
						btnButtons[a][b].setText(Integer.toString(counts[a][b]));
					}
				}
			}
			winPage.setVisible(true);
			
		}
	}
	public Color decideForegroundColor(int x, int y) {
		if(counts[x][y] == MINE) {
			return MINE_COLOUR;
		} else if(counts[x][y] == 0) {
			return null;
		} else if(counts[x][y] == 1) {
			return ONE_COLOUR;
		} else if(counts[x][y] == 2) {
			return TWO_COLOUR;
		} else if(counts[x][y] == 3) {
			return THREE_COLOUR;
		} else if(counts[x][y] == 4) {
			return FOUR_COLOUR;
		} else if(counts[x][y] == 5) {
			return FIVE_COLOUR;
		} else {
			return OTHER_COLOUR;
		}
	}
	public boolean validIndex(int x, int y) {
		if(x < 0 || y < 0 || x >= btnButtons.length || y >= btnButtons[0].length) {
			return false;
		} else {
			return true;
		}
	}
	public void clearZeros(int x, int y) {
		if(counts[x][y] == 0) {
			btnButtons[x][y].setEnabled(false);
			//top left
			if(validIndex(x-1,y-1)) {
				if(counts[x-1][y-1] == 0 && btnButtons[x-1][y-1].isEnabled()) {
					clearZeros(x-1,y-1);
				} else if(counts[x-1][y-1] != 0 && btnButtons[x-1][y-1].isEnabled()) {
					btnButtons[x-1][y-1].setEnabled(false);
					btnButtons[x-1][y-1].setForeground(decideForegroundColor(x-1,y-1));
					btnButtons[x-1][y-1].setText(Integer.toString(counts[x-1][y-1]));
				}
			}
			//top
			if(validIndex(x,y-1)) {
				if(counts[x][y-1] == 0 && btnButtons[x][y-1].isEnabled()) {
					clearZeros(x,y-1);
				} else if(counts[x][y-1] == 0 && btnButtons[x][y-1].isEnabled()) {
					btnButtons[x][y-1].setEnabled(false);
					btnButtons[x][y-1].setForeground(decideForegroundColor(x,y-1));
					btnButtons[x][y-1].setText(Integer.toString(counts[x][y-1]));
				}
			}
			//top right
			if(validIndex(x+1,y-1)) {
				if(counts[x+1][y-1] == 0 && btnButtons[x+1][y-1].isEnabled()) {
					clearZeros(x+1,y-1);
				} else if(counts[x+1][y-1] == 0 && btnButtons[x+1][y-1].isEnabled()) {
					btnButtons[x+1][y-1].setEnabled(false);
					btnButtons[x+1][y-1].setForeground(decideForegroundColor(x+1,y-1));
					btnButtons[x+1][y-1].setText(Integer.toString(counts[x+1][y-1]));
				}
			}
			//right
			if(validIndex(x+1,y)) {
				if(counts[x+1][y] == 0 && btnButtons[x+1][y].isEnabled()) {
					clearZeros(x+1,y);
				} else if(counts[x+1][y] == 0 && btnButtons[x+1][y].isEnabled()) {
					btnButtons[x+1][y].setEnabled(false);
					btnButtons[x+1][y].setForeground(decideForegroundColor(x+1,y));
					btnButtons[x+1][y].setText(Integer.toString(counts[x+1][y]));
				}
			}
			//bottom right
			if(validIndex(x+1,y+1)) {
				if(counts[x+1][y+1] == 0 && btnButtons[x+1][y+1].isEnabled()) {
					clearZeros(x+1,y+1);
				} else if(counts[x+1][y+1] != 0 && btnButtons[x+1][y+1].isEnabled()) {
					btnButtons[x+1][y+1].setEnabled(false);
					btnButtons[x+1][y+1].setForeground(decideForegroundColor(x+1,y+1));
					btnButtons[x+1][y+1].setText(Integer.toString(counts[x+1][y+1]));
				}
			}
			//bottom
			if(validIndex(x,y+1)) {
				if(counts[x][y+1] == 0 && btnButtons[x][y+1].isEnabled()) {
					clearZeros(x,y+1);
				} else if(counts[x][y+1] == 0 && btnButtons[x][y+1].isEnabled()) {
					btnButtons[x][y+1].setEnabled(false);
					btnButtons[x][y+1].setForeground(decideForegroundColor(x,y+1));
					btnButtons[x][y+1].setText(Integer.toString(counts[x][y+1]));
				}
			}
			//bottom left
			if(validIndex(x-1,y+1)) {
				if(counts[x-1][y+1] == 0 && btnButtons[x-1][y+1].isEnabled()) {
					clearZeros(x-1,y+1);
				} else if(counts[x-1][y+1] == 0 && btnButtons[x-1][y+1].isEnabled()) {
					btnButtons[x-1][y+1].setEnabled(false);
					btnButtons[x-1][y+1].setForeground(decideForegroundColor(x-1,y+1));
					btnButtons[x-1][y+1].setText(Integer.toString(counts[x-1][y+1]));
				}
			}
			//left
			if(validIndex(x-1,y)) {
				if(counts[x-1][y] == 0 && btnButtons[x-1][y].isEnabled()) {
					clearZeros(x-1,y);
				} else if(counts[x-1][y] == 0 && btnButtons[x-1][y].isEnabled()) {
					btnButtons[x-1][y].setEnabled(false);
					btnButtons[x-1][y].setForeground(decideForegroundColor(x-1,y));
					btnButtons[x-1][y].setText(Integer.toString(counts[x-1][y]));
				}
			}
		}
	}

	//getters
	public static int getWindowSizeX() {return Minesweeper.windowSizeX;}
	public static int getWindowSizeY() {return Minesweeper.windowSizeY;}
	public static int getSizeX() {return Minesweeper.sizeX;}
	public static int getSizeY() {return Minesweeper.sizeY;}
	public static String getLanguage() {return Minesweeper.language;}
	public static int getMineCount() {return Minesweeper.mineCount;}
	public static Color getMineColour() {return Minesweeper.MINE_COLOUR;}
	public static Color getFlagColour() {return Minesweeper.FLAG_COLOUR;}
	public static Color getOneColour() {return Minesweeper.ONE_COLOUR;}
	public static Color getTwoColour() {return Minesweeper.TWO_COLOUR;}
	public static Color getThreeColour() {return Minesweeper.THREE_COLOUR;}
	public static Color getFourColour() {return Minesweeper.FOUR_COLOUR;}
	public static Color getFiveColour() {return Minesweeper.FIVE_COLOUR;}
	public static Color getOtherColour() {return Minesweeper.OTHER_COLOUR;}
	
	//setters
	public static void setWindowSizeX(int size) {Minesweeper.windowSizeX = size;}
	public static void setWindowSizeY(int size) {Minesweeper.windowSizeY = size;}
	public static void setSizeX(int size) {Minesweeper.sizeX = size;}
	public static void setSizeY(int size) {Minesweeper.sizeY = size;}
	public static void setLanguage(String language) {Minesweeper.language = language;}
	public static void setMineCount(int mines) {Minesweeper.mineCount = mines;}
	public static void setMineColour(Color colour) {Minesweeper.MINE_COLOUR = colour;}
	public static void setFlagColour(Color colour) {Minesweeper.FLAG_COLOUR = colour;}
	public static void setOneColour(Color colour) {Minesweeper.ONE_COLOUR = colour;}
	public static void setTwoColour(Color colour) {Minesweeper.TWO_COLOUR = colour;}
	public static void setThreeColour(Color colour) {Minesweeper.THREE_COLOUR = colour;}
	public static void setFourColour(Color colour) {Minesweeper.FOUR_COLOUR = colour;}
	public static void setFiveColour(Color colour) {Minesweeper.FIVE_COLOUR = colour;}
	public static void setOtherColour(Color colour) {Minesweeper.OTHER_COLOUR = colour;}
	
	public static void main(String[] args) {
		new Minesweeper(Minesweeper.sizeX, Minesweeper.sizeY, Minesweeper.mineCount);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}