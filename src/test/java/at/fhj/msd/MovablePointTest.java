package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MovablePointTest {

    protected MovablePoint mv;

    @BeforeEach
    @DisplayName("MovablePoint Test class")
    public void setup() {
        mv = new MovablePoint(4, 16, 3, 3);
    }

    @Test
    @DisplayName("Constructor Test")
    void constructorTest() {
        assertNotNull(mv);
    }

    @Test
    @DisplayName("Constructor IllegalArgumentY Test")
    void illegalArgumentY() {
        assertThrows(IllegalArgumentException.class, () -> {
            MovablePoint mvIllegalY = new MovablePoint(3, 2, 3, -4);
        });
    }


    @Test
    @DisplayName("Constructor IllegalArgumentX Test")
    void illegalArgumentX() {
        assertThrows(IllegalArgumentException.class, () -> {
            new MovablePoint(3, 2, -3, 4);
        });
    }

  
    @Test
    @DisplayName("@Override: toString() Test")
    void toStringTest() {
        assertEquals("(4, 16) speed=(3, 3)", mv.toString());
    }

    @Test
    @DisplayName("Override: moveUp() Test")
    void moveUpTest() {
        mv.moveUp();
        assertEquals(19, mv.y);
    }

    @Test
    @DisplayName("Override: moveDown() Test")
    void moveDownTest() {
        mv.moveDown();
        assertEquals(13, mv.y);
    }

    @Test
    @DisplayName("Override: moveLeft() Test")
    void moveLeftTest() {
        mv.moveLeft();
        assertEquals(1, mv.x);
    }

    @Test
    @DisplayName("Override: moveRight() Test")
    void moveRightTest() {
        mv.moveRight();
        assertEquals(7, mv.x);
    }
}
