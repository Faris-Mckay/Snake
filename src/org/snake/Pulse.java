package org.snake;

import org.snake.game.Game;
import org.snake.game.entity.Entity;
import org.snake.util.Miscellaneous;
import org.snake.util.ObjectAction;

/**
 *
 * @author Faris
 */
public class Pulse {
    
    
    /**
     * Handles the game engine tick event
     */
    public static void enginePulse(){
        if(Game.currentGame == null)
            return;
        if(ObjectAction.difficulty == null){
            Miscellaneous.log("[FATAL] Cycle rate not set, game ending.");
            Engine.destructGame();
        }
        for(Entity entity : Entity.entityList){
            entity.update();
        }
        Game.getSingleton().update();
    }
    
}
