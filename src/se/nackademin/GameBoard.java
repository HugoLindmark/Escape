package se.nackademin;

public class GameBoard {

    private int[][] tiles = new int[10][10];
    private Player player = new Player();
    private Key key = new Key(Position.randomizePosition());
    private Door door = new Door(Position.randomizePosition(key.getPosition()));

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void gameBoard() {
        String output = "";
        for (int j = 0; j < tiles.length; j++) {
            for (int i = 0; i < tiles.length; i++) {
                if (player.getPosition().getCol() == i && player.getPosition().getRow() == j) {
                    output += i == 9 ? "[*]\n" : "[*]";
                } else if (key.getPosition().getCol() == i && key.getPosition().getRow() == j && key.isVisible()) {
                    output += i == 9 ? "[K]\n" : "[K]";
                } else if (door.getPosition().getCol() == i && door.getPosition().getRow() == j && door.isVisible()) {
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
        checkIfPlayerHasFoundKey();
        checkIfPlayerCanOpenDoor();
    }

    public void checkPosition(String input) {
        player.checkBoundaries(input);
    }

    public void checkIfPlayerHasFoundKey() {
        if (player.getPosition().comparePosition(key.getPosition())) {
            player.setHasKey(true);
            key.setVisible(true);
            System.out.println("YOU HAVE FOUND THE KEY!");
        }
    }

    public void checkIfPlayerCanOpenDoor() {
        if (player.hasKey() && player.getPosition().comparePosition(door.getPosition())) {
            gameBoard();
            System.out.println("CONGRATULATONS!");
            System.out.println("You have escaped the maze, legends will be foretold regarding thou accomplishments.");
            System.out.println("Pls send money to our Patreon: Patreeon.con/TotallyNotATrojan.exe");
            System.exit(0);
        } else if (!player.hasKey() && player.getPosition().comparePosition(door.getPosition())){
            door.setVisible(true);
            System.out.println("You have found the door, but alas thou don't have thee key!");
            System.out.println("Keep searching, we believe in you!");
        }
    }
}
//testing pull request