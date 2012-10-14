package org.snake.util;

import org.snake.client.Client;
import org.snake.client.GameCanvas;
import org.snake.client.sound.MP3;
import org.snake.game.entity.impl.Egg;
import org.snake.game.entity.impl.Snake;

/**
 * Class for retrieving objects
 * @author Faris
 */
public class ObjectAction {   

    /**
     * @return the snake
     */
    public static Snake getSnake() {
        return snake;
    }

    /**
     * @param aSnake the snake to set
     */
    public static void setSnake(Snake aSnake) {
        snake = aSnake;
    }

    /**
     * @return the egg
     */
    public static Egg getEgg() {
        return egg;
    }

    /**
     * @param aEgg the egg to set
     */
    public static void setEgg(Egg aEgg) {
        egg = aEgg;
    }

    /**
     * @return the client
     */
    public static Client getClient() {
        return client;
    }

    /**
     * @param aClient the client to set
     */
    public static void setClient(Client aClient) {
        client = aClient;
    }

    /**
     * @return the mp3
     */
    public static MP3 getMp3() {
        return mp3;
    }

    /**
     * @param aMp3 the mp3 to set
     */
    public static void setMp3(MP3 aMp3) {
        mp3 = aMp3;
    }

    /**
     * @return the canvas
     */
    public static GameCanvas getCanvas() {
        return canvas;
    }

    /**
     * @param aCanvas the canvas to set
     */
    public static void setCanvas(GameCanvas aCanvas) {
        canvas = aCanvas;
    }
    /**
     * Sets the 
     * @param difficulty 
     */
    public ObjectAction(Difficulty difficulty){
        this.difficulty = difficulty;
    }
        
    /**
     * The Difficulty level
     */
    public static Difficulty difficulty = null;
    
    /**
     * The main client
     */
    private static Client client = null;
    
    /**
     * The snake object
     */
    private static Snake snake = null;
    
    /**
     * The egg object
     */
    private static Egg egg = null;
    
    /**
     * The Mp3 object
     */
    private static MP3 mp3 = null;
    
    /**
     * The game screen
     */
    private static GameCanvas canvas = null;
    
    
}
