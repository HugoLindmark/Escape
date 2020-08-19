package se.nackademin;

import java.util.Scanner;

public class View {
    GameBoard gameBoard = new GameBoard();

    public void Start() {
        gameBoard.gameBoard();
        String input = "";

        while (true) {
            System.out.println("How do ya wanna move?");
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();

            while (!input.equalsIgnoreCase("W") && !input.equalsIgnoreCase("A") &&
                    !input.equalsIgnoreCase("D") && !input.equalsIgnoreCase("S")) {
                System.out.println("You can only use WASD to move!");
                input = scan.nextLine();

            }

            gameBoard.checkPosition(input);
            gameBoard.movePlayer(input);
            gameBoard.gameBoard();
        }
    }
}
