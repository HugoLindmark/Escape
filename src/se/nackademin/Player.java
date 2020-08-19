package se.nackademin;

public class Player {

    private Position position;
    private boolean hasKey;

    public Player() {
        this.position = new Position(0, 0);
        this.hasKey = true;
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
        if (input.equalsIgnoreCase("S") && position.getRow() != 9) {
            int newRow = position.getRow();
            newRow++;
            position.setRow(newRow);
        } else if (input.equalsIgnoreCase("W") && position.getRow() != 0) {
            int newRow = position.getRow();
            newRow--;
            position.setRow(newRow);
        } else if (input.equalsIgnoreCase("D") && position.getCol() != 9) {
            int newCol = position.getCol();
            newCol++;
            position.setCol(newCol);
        } else if (input.equalsIgnoreCase("A") && position.getCol() != 0) {
            int newCol = position.getCol();
            newCol--;
            position.setCol(newCol);
        }
    }

    public void checkBoundaries(String input) {
        if (input.equalsIgnoreCase("S") && position.getRow() == 9) {
            System.out.println("You can't go further down, try another direction");
        } else if (input.equalsIgnoreCase("W") && position.getRow() == 0) {
            System.out.println("You can't go further up, try another direction");
        } else if (input.equalsIgnoreCase("D") && position.getCol() == 9) {
            System.out.println("You can't go further right, try another direction");
        } else if (input.equalsIgnoreCase("A") && position.getCol() == 0) {
            System.out.println("You can't go further left, try another direction");
        }
    }
}
