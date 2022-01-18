package com.ariel.tictactoe;


public class TicTacToeClass {

    // board
    private char[][] board;
    // [] [] []
    // [] [] []
    // [] [] []

    // turns
    private int turns;

    public TicTacToeClass() {
        board = new char[3][3];
        turns = 0;

//        for ( char[] row : board ) {
//            for (char c : row) {
//                row = ' ';
//            }
//        }

        for ( int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                board[row][column] = ' ';
            }
        }

    }

    // this method checks to see if the player is the winner
    public boolean isWinner (char player) {

        // horizontal
        if (board[0][0] == player
                && board[0][1] == player
                && board[0][2] == player) {
            return true;
        }

        if (board[1][0] == player
                && board[1][1] == player
                && board[1][2] == player) {
            return true;
        }

        if (board[2][0] == player
                && board[2][1] == player
                && board[2][2] == player) {
            return true;
        }

        // vertical

        if (board[0][0] == player
                && board[1][0] == player
                && board[2][0] == player ) {
            return true;
        }

        if (board[0][1] == player
                && board[1][1] == player
                && board[2][1] == player ) {
            return true;
        }

        if (board[0][2] == player
                && board[1][2] == player
                && board[2][2] == player ) {
            return true;
        }


        // diagonal

        if (board[0][0] == player
                && board[1][1] == player
                && board[2][2] == player ) {
            return true;
        }

        if (board[2][2] == player
                && board[1][1] == player
                && board[0][0] == player ) {
            return true;
        }

        return false;
    }

    // this checks to see if turns is equal to 9
    // to determine if the board is completely full
    public boolean isFull() {
        return turns == 9;
    }

    public boolean isCat() {
        return turns == 9 &&
                !isWinner('X') &&
                !isWinner('O');
    }


    public boolean isValid( int row, int column) {
        return 0 <= row && row <= 2 && 0 <= column && column <= 2;
    }

    public int getTurns() {
        return turns;
    }

    public void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public void playMove( char player, int row, int column) {
        board[row][column] = player;
//        player = X;
//        player = O;
//        { [][][],  0
//          [][][],  1
//          [][][] } 2
    }

    public char playerAt(int row, int column) {
        return board[row][column];
    }
}
