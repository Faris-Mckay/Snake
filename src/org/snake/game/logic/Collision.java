package org.snake.game.logic;

import org.snake.Constants;
import org.snake.Engine;
import org.snake.game.Game;
import org.snake.game.entity.Entity;
import org.snake.game.entity.impl.Snake;
import org.snake.util.Miscellaneous;
import org.snake.util.ObjectAction;

/**
 *
 * @author Faris
 */
public class Collision {
    
    /**
     * Ends the game
     */
    public static void handleCollision(boolean wall){
        String object = wall == true ? "a wall" : "your tail";
        Miscellaneous.log("Game Over! You hit "+object+"!");
        Miscellaneous.log("Your score was: "+Game.getSingleton().getScore());
        Engine.destructGame();
    }
    
    /**
     * Executes all process require for successful egg collection
     */
    public static void handleEggCollection(){
        Game.getSingleton().setScore(++Game.score);
        ObjectAction.getSnake().extendSnake();
        ObjectAction.getEgg().drawNewEgg();
        Miscellaneous.log("COLLISION!");
    }

    /**
     * Checks if egg and snake head are on the same position
     * @return if they are
     */
    public static boolean checkEntityCollision(Entity a, Entity b) {
        return (a.getCurrentX() == b.getCurrentX()) && (a.getCurrentY() == b.getCurrentY());
    }
    
    /**
     * Constantly checking for the snake object to be level with a wall on x or y
     * @param snake is the snake object in game
     * @return when the snake is in line with a wall
     */
    public static boolean checkWallCollision(Snake snake){
        return (snake.getCurrentX() >= Constants.GAME_WIDTH) || (snake.getCurrentY() >= Constants.GAME_HEIGHT);
    }
    
}
