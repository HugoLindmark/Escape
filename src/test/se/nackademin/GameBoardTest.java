package se.nackademin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    private Position position;
    private GameBoard gameBoard;

    @BeforeEach
    void setup(){
        gameBoard = new GameBoard();
    }

    @DisplayName("Hugo")
    @Test
    void movePlayerStillSameRow() {
        String input = "W";
        position = new Position(0,0);
        gameBoard.movePlayer(input);
        assertEquals(position.getRow(),gameBoard.getPlayer().getPosition().getRow(),"Same row");

    }

    @Test
    void checkPosition() {
    }

    @Test
    void checkIfPlayerHasFoundKey() {
    }

    @Test
    void checkIfPlayerCanOpenDoor() {
    }
}