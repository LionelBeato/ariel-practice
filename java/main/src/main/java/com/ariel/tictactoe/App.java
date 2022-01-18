package com.ariel.tictactoe;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TicTacToeClass ttt = new TicTacToeClass();

        char player = 'X';
        int rowInput;
        int columnInput;

//        !ttt.isWinner('X') || !ttt.isWinner('O') || !ttt.isFull()
        mainLoop:
        while (true) {
            ttt.displayBoard();
            System.out.println(" '" + player + "', choose your location (row, column): ");
            rowInput = scanner.nextInt();
            columnInput = scanner.nextInt();

            // this while loop checks to see if your input is invalid
            while (!ttt.isValid(rowInput, columnInput) || ttt.playerAt(rowInput, columnInput) != ' ') {

                if (!ttt.isValid(rowInput, columnInput)) {
                    System.out.println("That is not a valid location");
                    continue mainLoop;
                } else if (ttt.playerAt(rowInput, columnInput) != ' ') {
                    System.out.println("That location is already full. Try Again");
                    continue mainLoop;
                }
            }

            // commits a legal move
            ttt.playMove(player, rowInput, columnInput);

            // logic that will break out of the loop if
            // someone is a winner or the game board is full
            if (ttt.isWinner(player) || ttt.isFull()) {
                break mainLoop;
            }

            // flips the current player
            player = (player == 'X') ? 'O' : 'X';

        }

        ttt.displayBoard();

        if (ttt.isWinner('X')) {
            System.out.println("X is the winner!");
        } else if (ttt.isWinner('O')) {
            System.out.println("O is the winner!");
        } else if (ttt.isCat()) {
            System.out.println("The game is a tie!");
        }

    }
}
