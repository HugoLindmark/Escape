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
        if (input.equals("S") && position.getRow() != 9) {
            int newRow = position.getRow();
            newRow++;
            position.setRow(newRow);
        } else if (input.equals("W") && position.getRow() != 0) {
            int newRow = position.getRow();
            newRow--;
            position.setRow(newRow);
        } else if (input.equals("D") && position.getCol() != 9) {
            int newCol = position.getCol();
            newCol++;
            position.setCol(newCol);
        } else if (input.equals("A") && position.getCol() != 0) {
            int newCol = position.getCol();
            newCol--;
            position.setCol(newCol);
        }
    }

    public void checkBoundaries(String input) {
        if (input.equals("S") && position.getRow() == 9) {
            System.out.println("You can't go farther down, try another direction");
        } else if (input.equals("W") && position.getRow() == 0) {
            System.out.println("You can't go farther up, try another direction");
        } else if (input.equals("D") && position.getCol() == 9) {
            System.out.println("You can't go farther right, try another direction");
        } else if (input.equals("A") && position.getCol() == 0) {
            System.out.println("You can't go farther left, try another direction");
        }
    }
}
