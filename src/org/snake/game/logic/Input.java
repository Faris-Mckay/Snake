package org.snake.game.logic;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.snake.game.Game;
import org.snake.util.Miscellaneous;

/**
 * 
 * @author Faris
 */
public class Input implements KeyListener {

	/**
	 * Accepted characters for game
	 */
	private String ACCEPTED_KEYS = "wasd";
        
        /**
         * Accepted Key IDS for application
         */
        private Integer[] ACCEPTED_NUM_KEYS = {37,38,39,40};

	/**
	 * Handles Typed Keys in Input
	 * 
	 * @param e
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	/**
	 * Handles Pressed Keys in Input
	 * 
	 * @param e
	 */
	@Override
	public void keyPressed(KeyEvent e) {
            if(!Game.getSingleton().gameStarted)
                return;
            processInput(e);
	}

	/**
	 * Handles Released Keys in Input
	 * 
	 * @param e
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	/**
	 * Handles all keyboard input conversion into booleans
	 * 
	 * @param keyChar
	 */
	private static void decodeInput(char keyChar) {
            Movement.checkAllFalse();
            switch (keyChar) {
                case 'a': 
                        Movement.MOVEMENT[Movement.LEFT] = true;
                        Miscellaneous.log("LEFT");
                        break; 
                case 'w':
                        Movement.MOVEMENT[Movement.UP] = true;
                        Miscellaneous.log("UP");
                        break; 
                case 's':
                        Movement.MOVEMENT[Movement.DOWN] = true;
                        Miscellaneous.log("DOWN");
                        break; 
                case 'd':
                        Movement.MOVEMENT[Movement.RIGHT] = true;
                        Miscellaneous.log("RIGHT");
                        break; 
            }
	}
        
        private static void decodeNumberInput(int keyNumber) {
            Movement.checkAllFalse();
            switch (keyNumber) {
                case 37: 
                        Movement.MOVEMENT[Movement.LEFT] = true;
                        Miscellaneous.log("LEFT");
                        break; 
                case 38:
                        Movement.MOVEMENT[Movement.UP] = true;
                        Miscellaneous.log("UP");
                        break; 
                case 40:
                        Movement.MOVEMENT[Movement.DOWN] = true;
                        Miscellaneous.log("DOWN");
                        break; 
                case 39:
                        Movement.MOVEMENT[Movement.RIGHT] = true;
                        Miscellaneous.log("RIGHT");
                        break; 
            }
	}

	/**
	 * Removes any invalid keys from conversion
	 * 
	 * @param e
	 */
	private void processInput(KeyEvent e) {
            Integer keyNum = e.getKeyCode();
            Character keyChar = Character.toLowerCase(e.getKeyChar());
            if (ACCEPTED_KEYS.contains(keyChar.toString())) {
                decodeInput(keyChar);
            } 
            for(int i=0;i<ACCEPTED_NUM_KEYS.length;i++){
                if(ACCEPTED_NUM_KEYS[i] == keyNum){
                    decodeNumberInput(keyNum);
                }
            }
	}

}
