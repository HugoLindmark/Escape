package se.nackademin;

import java.util.Random;

public class Position {

    private int col;
    private int row;

    public Position() {
    }

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public static Position randomizePosition() {
        Random random = new Random();
        int col = random.nextInt(10);
        int row = random.nextInt(10);

        Position position = new Position(col, row);
        Position playerPosition = new Position(0, 0);

        while (position.comparePosition(playerPosition)) {
            col = random.nextInt(10);
            row = random.nextInt(10);
            position.setCol(col);
            position.setRow(row);
        }

        return position;
    }

    public static Position randomizePosition(Position position) {
        Random random = new Random();
        int col = random.nextInt(10);
        int row = random.nextInt(10);

        Position randomizedPosition = new Position(col, row);
        Position playerPosition = new Position(0, 0);

        while (randomizedPosition.comparePosition(playerPosition) && randomizedPosition.comparePosition(position)) {
            col = random.nextInt(10);
            row = random.nextInt(10);
            randomizedPosition.setCol(col);
            randomizedPosition.setRow(row);

        }

        return randomizedPosition;
    }

    public boolean comparePosition(Position position){
        return this.col == position.col && this.row == position.row;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}