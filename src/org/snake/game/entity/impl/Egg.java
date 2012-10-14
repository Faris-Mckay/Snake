package org.snake.game.entity.impl;

import org.snake.game.entity.Entity;
import org.snake.game.logic.Collision;
import org.snake.game.entity.Position;
import org.snake.util.Miscellaneous;
import org.snake.util.ObjectAction;

/**
 *
 * @author Faris
 */
public class Egg extends Entity {
    
    /**
     * Creates the egg object with all necessary references
     */
    @Override
    public void create(){
        ObjectAction.setEgg(this);
        this.position = new Position(getNewX(), getNewY());
        super.entityList.add(this);
    }
         
    /**
     * Handles Egg updating via Task tick
     */
    @Override
    public void update(){
       if(ObjectAction.getEgg() == null) {
            return;
        }
       if(Collision.checkEntityCollision(this, ObjectAction.getSnake())) {
            Collision.handleEggCollection();
        }
        Miscellaneous.log("Egg Position: X:"+getPosition().getX()+" Y:"+getPosition().getY());
    }
    
    /**
     * Gets the cached position of the egg
     * @returns the position object
     */
    @Override
    public Position getPosition() {
        return position;
    }
    
    /**
     * Caches the position of the Egg
     */
    private Position position = null;

    public void drawNewEgg() {
        position = new Position(getNewX(), getNewY());
    }
    
}
