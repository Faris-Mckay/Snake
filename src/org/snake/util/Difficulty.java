package org.snake.util;

/**
 *Sets and stores the game cycle rate for different difficulty settings
 * @author Faris
 */
public enum Difficulty {

    EASY(500),

    MEDIUM(400),

    HARD(300),

    LEDGENDARY(200);

    Difficulty(int cycleRate){
        this.cycleSpeed = cycleRate;
    }

    /**
     * Stores the speed variable for game difficulty
     */
    private int cycleSpeed;

    /**
     * getter for cycle speed variable
     * @returns the difficulty selected
     */
    public int getCycleSpeed(){
        return cycleSpeed;
    }
}
