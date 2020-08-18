package se.nackademin;

public class Main {

    public static void main(String[] args) {
        int[][] tiles = new int[10][10];
        Player player = new Player();
        Key key = new Key(Position.randomizePosition());
        Door door = new Door(Position.randomizePosition());

        String output = "";

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                if (player.getPosition().getCol() == i && player.getPosition().getRow() == j) {
                    output += j == 9 ? "[*]\n" : "[*]";
                } else if(key.getPosition().getCol() == i && key.getPosition().getRow() == j) {
                    output += j == 9 ? "[K]\n" : "[K]";
                } else if(door.getPosition().getCol() == i && door.getPosition().getRow() == j) {
                    output += j == 9 ? "[D]\n" : "[D]";
                } else {
                    output += j == 9 ? "[ ]\n" : "[ ]";
                }
            }
        }

        System.out.println(output);
    }
}
