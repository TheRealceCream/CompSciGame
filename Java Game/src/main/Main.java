package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			JFrame window = new JFrame(); //creates window
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Allows window to properly close when X button is hit
			window.setResizable(false); //can't resize
			window.setTitle("2D Lit Game"); //window title
			
			GamePanel gamePanel = new GamePanel();
			window.add(gamePanel);
			
			window.pack(); //Causes this window to be sized to fit the preferred size (set in the GamePanel class) and layouts of its subcomponets
			
			window.setLocationRelativeTo(null); //sets window to display at center of screen
			window.setVisible(true);
			gamePanel.startGameThread();
	}

}
