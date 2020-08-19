package se.nackademin;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    private static Position playerPosition;

    @BeforeAll
    static void beforeAll() {
        playerPosition = new Position(0,0);
    }

    @DisplayName("Random position not the same as player position")
    @Test
    void randomizePosition() {
        //given
        Position randomizedPosition = Position.randomizePosition();

        //then
        assertNotEquals(playerPosition, randomizedPosition, "Player not equals");
    }

    @DisplayName("No position is equal")
    @Test
    void testRandomizePosition() {
        Position keyPosition = new Position(3,5);

        Position doorPosition = Position.randomizePosition(keyPosition);

        assertNotEquals(keyPosition, doorPosition);
    }

    @DisplayName("Position are the same")
    @Test
    void comparePosition() {
        Position keyPosition = new Position(0,0);

        assertTrue(playerPosition.comparePosition(keyPosition), "comparePosition will return true");
    }
}