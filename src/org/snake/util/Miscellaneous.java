package org.snake.util;

/**
 * Class for uncategorized functions
 * @author Faris
 */
public class Miscellaneous {

    /**
     * Usage for returning a random integer
     * @param range
     * @return
     */
    public static int getRandom(int range) {
        return (int) (Math.random() * (range + 1));
    }

    /**
     * Usage for quick printing
     * @param s
     */
    public static void log(String s) {
        System.out.println(s);
    }

}
