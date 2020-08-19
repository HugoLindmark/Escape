package se.nackademin;

import java.nio.channels.Pipe;

public class GameBoard {

    private int[][] tiles = new int[10][10];
    private Player player = new Player();
    private Key key = new Key(Position.randomizePosition());
    private Door door = new Door(Position.randomizePosition());

    public void gameBoard() {
        String output = "";
        for (int j = 0; j < tiles.length; j++) {
            for (int i = 0; i < tiles.length; i++) {
                if (player.getPosition().getCol() == i && player.getPosition().getRow() == j) {
                    output += i == 9 ? "[*]\n" : "[*]";
                } else if (key.getPosition().getCol() == i && key.getPosition().getRow() == j) {
                    output += i == 9 ? "[K]\n" : "[K]";
                } else if (door.getPosition().getCol() == i && door.getPosition().getRow() == j) {
                    output += i == 9 ? "[D]\n" : "[D]";
                } else {
                    output += i == 9 ? "[ ]\n" : "[ ]";
                }
            }
        }
        System.out.println(output);
    }

    public void movePlayer(String input) {
        player.movePlayer(input);
        //System.out.println(player.getPosition());
    }

    public void checkPosition(String input) {
        player.checkBoundaries(input);
    }

    public void checkIfPlayerHasFoundKey(){
        if(player.getPosition().comparePosition(key.getPosition()) ){
            player.setHasKey(true);
        }
    }
}