package org.snake.game.entity.impl;

import org.snake.game.entity.Entity;
import org.snake.game.logic.Movement;
import org.snake.game.entity.Position;
import org.snake.game.logic.Collision;
import org.snake.util.Miscellaneous;
import org.snake.util.ObjectAction;


/**
 *
 * @author Faris
 */
public class Snake extends Entity{
    
    /**
     * Creates a new Snake object
     * @param xPos current X
     * @param yPos current Y
     * @param length Length of the Snake
     */
    @Override
    public void create(){
        ObjectAction.setSnake(this);
        this.position = new Position(getNewX(), getNewY());
        this.eggsCollected = 0;
        this.isAlive = true;
        super.entityList.add(this);
    }
    
    /**
     * Holds the amount of eggs collected by the snake
     */
    private Integer eggsCollected = 0;
    
    /**
     * Holds current location of the snake head
     */
    public Position position = null;
    
    /**
     * The snakes life
     */
    public boolean isAlive = false;
    
   /**
    * Handles tick based updating of Snake
    */
    @Override
    public void update() {
        if(!isAlive || ObjectAction.getSnake() == null) {
            return;
        }
        // the snake movement method
        Movement.maintainDirection(this);
        
        // basic collision detection
        if(Collision.checkWallCollision(this)){
            Collision.handleCollision(true);
        }
        Miscellaneous.log("Snake Position: X:"+getPosition().getX()+" Y:"+getPosition().getY());
    }
    
    /**
     * Gets the cached position of the snake
     * @returns the position object
     */
    @Override
    public Position getPosition() {
        return position;
    }
    
    
    /**
     * Makes the snake chain longer in-game
     */
    public void extendSnake(){
        Miscellaneous.log("You eat the egg, your body has grown; be careful!");
        addEggCollected();
    }
    

    /**
     * @return the eggsCollected
     */
    public int getEggsCollected() {
        return eggsCollected;
    }

    /**
     * eggsCollected the eggsCollected to increment
     */
    public void addEggCollected() {
        eggsCollected++;
    }

}
