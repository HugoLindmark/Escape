package se.nackademin;

import java.util.Scanner;

public class View {
    GameBoard gameBoard = new GameBoard();

    public void Start() {
        gameBoard.gameBoard();

        while (true) {
            System.out.println("How do ya wanna move?");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            gameBoard.checkPosition(input);
            gameBoard.movePlayer(input);

            gameBoard.gameBoard();
        }
    }
}
