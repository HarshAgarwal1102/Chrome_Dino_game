package userinterface;

import javax.swing.JFrame;

import util.Constants;

public class GameWindow extends JFrame implements Constants{
	
	
	private GameScreen gameScreen;
	
	public GameWindow() {
		super("Chrome-Dino game");
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setLocation(400, 400);
	//	setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		gameScreen = new GameScreen();
		addKeyListener(gameScreen);
		add(gameScreen);
	}
	
	public void startGame() {
		setVisible(true);
		gameScreen.startGame();
	}
	
	public static void main(String args[]) {
		(new GameWindow()).startGame();
	}
}
