package org.snake.game.entity;

/**
 *
 * @author Faris
 */
public class Position {
    
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * Stores the X and Y coordinates for the object
     */
    private int x, y;

    /**
     * @return the x position
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
    
    /**
     * Sets Y variable as given
     * @param x 
     */
    public void setY(int y){
        this.y = y;
    }
    
    /**
     * Sets X variable as given
     * @param x 
     */
    public void setX(int x){
        this.x = x;
    }
    
        /**
     * Increments or decrements snake current Y position after tick
     * @param modifier 
     */
    public void updateYPosition(int modifier){
       y += modifier;     
    }
    
    /**
     * Increments or decrements snake current X position after tick
     * @param modifier 
     */
    public void updateXPosition(int modifier){
       x += modifier;     
    }

}
