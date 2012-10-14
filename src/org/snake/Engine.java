package org.snake;

import org.snake.client.Client;
import org.snake.client.sound.MP3;
import org.snake.task.Task;
import org.snake.task.TaskScheduler;
import org.snake.util.Difficulty;
import org.snake.util.Miscellaneous;
import org.snake.util.ObjectAction;

/**
 * 
 * @author Faris
 */
public class Engine {

    /**
     * The Task Event Manager
     */
    private static TaskScheduler pulse = null;
        
    /**
     * Used to terminate the application when necessary
     */
    public static boolean running = false;

    /**
     * @param args
     *      the command line arguments
     */
    public static void main(String[] args) {
            intialize();
            engineTick();
    }

    /**
     * Pre-loaded methods before execution tick
     */
    private static void intialize() {
        running = true;
        Miscellaneous.log("Starting up game...");
        
        /**
         * Starts up the user client
         */
        new Client();
        Miscellaneous.log("Client prepared.");
        
        /**
         * Initializes the starting game settings
         */
        new ObjectAction(Difficulty.LEDGENDARY);
        Miscellaneous.log("Settings prepared.");
        
        /**
         * Initializes the starting game sounds
         */
        new MP3();
        Miscellaneous.log("Sounds prepared.");
        
        /**
         * Game Engine Setter
         */
        pulse = new TaskScheduler();
        Miscellaneous.log("Game Engine Ready.");
        
    }
        
    /**
     * Handles a safe application termination
     */
    public static void destructGame(){
        pulse.terminate();
        System.exit(0);
    }

    /**
     * Uses Task Scheduler to run main game tick
     */
    public static void engineTick() {
        pulse.schedule(new Task() {
            @Override
            public void execute() {
                try {
                    if (running)
                        Pulse.enginePulse();
                    else
                        destructGame();
                } catch (Exception e) {
                        e.printStackTrace();
                }
            }
        });
    }

}
