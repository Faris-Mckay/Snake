package org.snake.game.entity;

import java.util.LinkedList;
import java.util.List;
import org.snake.Constants;
import org.snake.task.UpdateableTask;
import org.snake.util.Miscellaneous;

/**
 *
 * @author Faris
 */
public abstract class Entity implements UpdateableTask {
    
    /**
     * Looped to handle Entity behaviour
     */
    @Override
    public abstract void update();
    
    /**
     * Creates the entity on the client with pre-sets
     */
    public abstract void create();
    
    /**
     * The position of the instanced entity
     * @returns the position object
     */
    public abstract Position getPosition();
    
    /**
     * Calls the create method in the given entity object
     * @param entity 
     */
    public static void createEntity(Entity entity){
        entity.create();
    }
    /**
     * Stores the active entities in a list for usage in update looping
     */
    public static List<Entity> entityList = new LinkedList<>();
    
    /**
     * The entity getter
     * @returns the entity coordinates X
     */
    public int getCurrentX(){
        return getPosition().getX();
    }
    
    /**
     * The entity getter
     * @returns the entity coordinates Y
     */
    public int getCurrentY(){
        return getPosition().getY();
    }
    
    /**
     * Creates a new X position for egg spawn
     * @return 
     */
    public int getNewX(){
        return Miscellaneous.getRandom(Constants.GAME_WIDTH-100);
    }
    
    /**
     * Creates a new Y position for egg spawn
     * @return 
     */
    public int getNewY(){
        return Miscellaneous.getRandom(Constants.GAME_HEIGHT-100);
    }

}
