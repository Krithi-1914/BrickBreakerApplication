package com.brickbreaker.model;

public class GameBoard {

    private char[][] board;

    public GameBoard() {
        board = new char[7][7];
        initializeBoard();
    }

    private void initializeBoard() {

        
        for (int i = 0; i < 7; i++) {
            board[0][i] = 'w';
            board[6][i] = 'w';
            board[i][0] = 'w';
            board[i][6] = 'w';
        }

        
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                board[i][j] = ' ';
            }
        }

        
        board[2][2] = '1';
        board[2][3] = '1';
        board[2][4] = '1';
        board[3][2] = '1';
        board[3][3] = '1';
        board[3][4] = '1';

        // Ground
        board[6][2] = 'g';
        board[6][3] = 'o'; 
    }

    public char[][] getBoard() {
        return board;
    }

    public void printBoard() {
        System.out.println();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}