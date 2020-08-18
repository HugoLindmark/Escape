package se.nackademin;

public class Player {

    private Position position;
    private boolean hasKey;

    public Player() {
        this.position = new Position(0, 0);
        this.hasKey = false;
    }

    public boolean hasKey() {
        return hasKey;
    }

    public void setHasKey(boolean hasKey) {
        this.hasKey = hasKey;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void movePlayer(String input) {
        if (input == "S") {
            int newRow = position.getRow();
            newRow++;
            position.setRow(newRow);
        } else if (input == "W") {
            int newRow = position.getRow();
            newRow--;
            position.setRow(newRow);
        } else if (input == "D") {
            int newCol = position.getCol();
            newCol++;
            position.setCol(newCol);
        } else if (input == "A") {
            int newCol = position.getCol();
            newCol--;
            position.setCol(newCol);
        }
    }
}
