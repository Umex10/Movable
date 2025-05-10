package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RobotTest {


    protected Robot robot;

    @BeforeEach
    @DisplayName("Vehicle Test class")
    public void setup() {
        robot.count = 1;
        robot = new Robot(5, 15, 5);
    }

    @Test
    @DisplayName("Constructor Test")
    void constructorTest() {
        assertNotNull(robot);
    }

    @Test
    @DisplayName("@Override: toString()-Many Test")
    void toStringTest() {
    
        Robot r1 = new Robot(5, 10, 30);
        Robot r2 = new Robot(0, 12, 2);
        Robot r3 = new Robot(5, 14, 3);
        Robot r4 = new Robot(5, 20, 30);

        assertEquals("robot#<1>(5,15)", robot.toString());
        assertEquals("robot#<2>(5,10)", r1.toString());
        assertEquals("robot#<3>(0,12)", r2.toString());
        assertEquals("robot#<4>(5,14)", r3.toString());
        assertEquals("robot#<5>(5,20)", r4.toString());
        
    }

    @Test
    @DisplayName("Override: moveUp() Test")
    void moveUpTest() {
        robot.moveUp();
        assertEquals(20, robot.y);
    }

    @Test
    @DisplayName("Override: moveDown() Test")
    void moveDownTest() {
        robot.moveDown();
        assertEquals(10, robot.y);
    }

    @Test
    @DisplayName("Override: moveRight() Test")
    void moveRightTest() {
        robot.moveRight();
        assertEquals(10, robot.x);

    }

    @Test
    @DisplayName("Override: moveLeft() Test")
    void moveLeftTest() {
        robot.moveLeft();
        assertEquals(0, robot.x);
    }

    
    
}
