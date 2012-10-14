package org.snake.game;

import java.sql.Time;
import org.snake.game.entity.Entity;
import org.snake.task.UpdateableTask;
import org.snake.game.entity.impl.Egg;
import org.snake.game.entity.impl.Snake;
import org.snake.util.Miscellaneous;

/**
 *
 * @author Faris
 */
public class Game implements UpdateableTask {
    


    
    @Override
    public void update() {
        //ObjectAction.getCanvas().initComponents("Score: "+score);
    }
    
    public Game(){
        gameStarted = true;
        startTime = new Time(System.currentTimeMillis());      
        Entity.createEntity(new Snake());
        Entity.createEntity(new Egg());
    }
    
    public static Game currentGame = null;
    
    /**
     * Creates a single instance of this class and makes sure only this instance is modified
     * @returns the instance
     */
    public static Game getSingleton(){
        if(currentGame == null){
            currentGame = new Game();
        }
        return currentGame;
    }
    
    /**
     * Stores the current score value
     */
    public static short score = 0;
    
    /**
     * Usage to prevent null pointer exceptions
     */
    public boolean gameStarted = false;
    
    /**
     * Stores time objects  for time played
     */
    private Time startTime = null, endTime = null;
    
    /**
     * Variables associated with stopping the game of snake
     */
    public void endGame(){
        endTime = new Time(System.currentTimeMillis()); 
        Miscellaneous.log("You played for "+startTime.getTime() % endTime.getTime());
    }

    /**
     * @return the score
     */
    public short getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(short score) {
        this.score = score; 
    }

}
