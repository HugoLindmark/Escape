package se.nackademin;

import java.util.Random;

public class Position {


    private int col;
    private int row;
    Player player = new Player();


    public Position() {
    }

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
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
        return new Position(col, row);
    }

    @Override
    public String toString() {
        return "Position{" +
                "col=" + col +
                ", row=" + row +
                '}';
    }

}