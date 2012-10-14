package org.snake.game.logic;

import org.snake.game.entity.Entity;

/**
 *
 * @author Faris
 */
public class Movement {

    /**
     * Variables set to control snake movement
     */
    public static boolean MOVEMENT[] = new boolean[4];
    
    /**
     * The index of the boolean array for movement
     */
    public static int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3;
    
    /**
     * Sets all movement variables false before decoding from input
     */
    public static void checkAllFalse(){
        for(int i=0; i<MOVEMENT.length;i++){
            MOVEMENT[i] = false;
        }
    }
    
    /**
     * Goes through all of the movement direction booleans
     * @return a key of the one which is true
     */
    public static int returnMovementDirection(){
       for(int i=0; i<MOVEMENT.length;i++){
           if(MOVEMENT[i]){
               return i;
           }
       }
        return 0;
    }
    
     /**
     * gets and updates snake direction on tick updates
     * receives the current direction set by the user input
     * and increments direction variables in that manner
     */
    public static void maintainDirection(Entity snake){
        switch(Movement.returnMovementDirection()){
            case 0:
                snake.getPosition().updateYPosition(1);
                break;
            case 1:
                snake.getPosition().updateYPosition(-1);
                break;
            case 2:
                 snake.getPosition().updateXPosition(1);
                break;
            case 3:
                 snake.getPosition().updateXPosition(-1);
                break;
        }
    }
    
    
}
