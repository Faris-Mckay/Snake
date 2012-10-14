package org.snake.game.sprites;

import org.snake.client.GameCanvas;

/**
 * Unimplemented 
 * @author Faris
 */
public class Sprites {
    
    /**
     * The panel variable to write images to the screen
     */
    private GameCanvas panel = new GameCanvas();
    
    /**
     * Constructor defines between which object to create
     * @param type 
     */
    public Sprites(int type){
        if (type == 1){
            createEgg();
        } else {
            createSnake();
        }
    }
    
    /**
     * Renders Egg sprite on screen
     */
    private void createEgg(){
        //TODO Synch Egg class with sprite
    }
    
    /**
     * Renders Snake sprite on screen
     */
    private void createSnake(){
        //TODO Synch Snake class with sprite
    }
    
}
