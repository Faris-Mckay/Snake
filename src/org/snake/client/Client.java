package org.snake.client;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.snake.Constants;
import org.snake.client.gui.MainMenu;
import org.snake.game.logic.Input;
import org.snake.util.ObjectAction;

/**
 * 
 * @author Faris
 */
public class Client extends JFrame {

	/**
	 * Creates a new GamePanel object
	 */
	MainMenu gp;
        
        /**
         * Caches a reference to the current displayed panel
         */
        JPanel currentPanel = null;

	/**
	 * JFrame client constructor sets constant variables
	 */
	public Client() {
		gp = new MainMenu();
		addKeyListener(new Input());
		setVisible(Constants.VISIBLE);
		setTitle(Constants.TITLE);
		setResizable(Constants.RESIZABLE);
		setSize(Constants.GAME_HEIGHT, Constants.GAME_WIDTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFocusable(Constants.GAME_FOCUSABLE);
		getContentPane().add(gp);
                currentPanel = gp;
                ObjectAction.setClient(this);
	}
        
        public void changeToFrame(JPanel panelNew){
            getContentPane().removeAll();
            getContentPane().add(panelNew);
            validate();
            setVisible(true);
        }

}