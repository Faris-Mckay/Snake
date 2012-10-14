package snake.game.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.snake.Constants;
import org.snake.game.entity.Entity;
import org.snake.game.entity.impl.Egg;
import org.snake.game.entity.impl.Snake;
import org.snake.game.logic.Collision;

/**
 *
 * @author Faris
 */
public class CollisionTest {
    
    public CollisionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        a = new Snake();
        b = new Egg();
        a.create();
        b.create();
    }
    
    @After
    public void tearDown() {
    }
    
    Entity a;
    Entity b;


    /**
     * Test of checkEntityCollision method, of class Collision.
     */
    @Test
    public void testCheckEntityCollision() {
        System.out.println("checkEntityCollision");
        a.getPosition().setX(1);
        a.getPosition().setY(1);
        b.getPosition().setX(1);
        b.getPosition().setY(1);
        boolean expResult = true;
        boolean result = Collision.checkEntityCollision(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkWallCollision method, of class Collision.
     */
    @Test
    public void testCheckWallCollision() {
        System.out.println("checkWallCollision");
        Snake snake = new Snake();
        snake.create();
        snake.getPosition().setX(Constants.GAME_WIDTH);
        boolean expResult = true;
        boolean result = Collision.checkWallCollision(snake);
        assertEquals(expResult, result);
    }
}
