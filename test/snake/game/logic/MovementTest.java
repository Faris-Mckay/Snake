/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snake.game.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.snake.game.entity.Entity;
import org.snake.game.entity.impl.Snake;
import org.snake.game.logic.Movement;

/**
 *
 * @author Faris
 */
public class MovementTest {
    
    public MovementTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of returnMovementDirection method, of class Movement.
     */
    @Test
    public void testReturnMovementDirection() {
        System.out.println("returnMovementDirection");
        int expResult = 2;
        Movement.MOVEMENT[Movement.LEFT] = true;
        int result = Movement.returnMovementDirection();
        assertEquals(expResult, result);
    }

    /**
     * Test of maintainDirection method, of class Movement.
     */
    @Test
    public void testMaintainDirection() {
        System.out.println("maintainDirection");
        Entity snake = new Snake();
        snake.create();
        Movement.MOVEMENT[Movement.UP] = true;
        int pos = snake.getCurrentY() + 2;
        System.out.println("orig y pos: "+snake.getCurrentY());
        Movement.maintainDirection(snake);
        Movement.maintainDirection(snake);
        System.out.println("new y pos: "+snake.getCurrentY());
        int pos2 = snake.getCurrentY();
        assertEquals(pos, pos2);
    }
}
