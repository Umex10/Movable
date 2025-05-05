package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    protected Vehicle v;

    @BeforeEach
    @DisplayName("Vehicle Test class")
    public void setup() {
        v = new Vehicle("Car", 5, 15, 3, 2);
    }

     @Test
    @DisplayName("Constructor Test")
    void constructorTest() {
        assertNotNull(v);
    }

    @Test
    @DisplayName("Constructor acceleration Test")
    void constructorAccelerationTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Vehicle("Car", 5, 15, -3, 2);
        });
    }

    @Test
    @DisplayName("Constructor deceleration Test")
    void constructorDecelerationTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Vehicle("Car", 5, 15, 3, -2);
        });
    }

    
    @Test
    @DisplayName("@Override: toString() Test")
    void toStringTest() {
        assertEquals("<Car>(5, 15) speed=(<0>)", v.toString());
    }

    @Test
    @DisplayName("Override: moveUp() Test")
    void moveUpTest() {
        v.moveUp();
        assertEquals(3, v.speed);
        assertEquals(18, v.y);
    }

    @Test
    @DisplayName("Override: moveDown() Test")
    void moveDownTest() {
        v.moveUp();
        v.moveDown();
        assertEquals(1, v.speed);
        assertEquals(19, v.y);
    }

    @Test
    @DisplayName("Speed = 0 Test")
    void speedZeroTest() {
        Vehicle vZero = new Vehicle("Bike", 5, 11, 5, 4);
        v.moveDown();
        assertEquals(0, v.speed);
        assertEquals(15, v.y);
    }

    @Test
    @DisplayName("Override: moveLeft() Test")
    void moveLeftTest() {
        v.moveUp();
        v.moveLeft();
        assertEquals(3, v.x);
    }

    @Test
    @DisplayName("Override: moveRight() Test")
    void moveRightTest() {
        v.moveUp();
        v.moveRight();
        assertEquals(7, v.x);
    }
    
}
