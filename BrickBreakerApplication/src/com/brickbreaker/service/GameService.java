package com.brickbreaker.service;

import com.brickbreaker.model.Ball;
import com.brickbreaker.model.GameBoard;

public class GameService {

    private GameBoard gameBoard;
    private Ball ball;

    public GameService(GameBoard gameBoard, Ball ball) {
        this.gameBoard = gameBoard;
        this.ball = ball;
    }

    public void moveBall(String command) {

        int newRow = ball.getRow();
        int newCol = ball.getCol();

        if (command.equalsIgnoreCase("St")) {
            newRow--;
        } 
        else if (command.equalsIgnoreCase("Lt")) {
            newRow--;
            newCol--;
        } 
        else if (command.equalsIgnoreCase("Rt")) {
            newRow--;
            newCol++;
        } 
        else {
            System.out.println("Invalid Command!");
            return;
        }

        char[][] board = gameBoard.getBoard();

        
        if (board[newRow][newCol] == 'w') {
            ball.decreaseLife();
            System.out.println("Hit Wall!");
            return;
        }

        
        if (board[newRow][newCol] == '1') {
            board[newRow][newCol] = ' ';
            ball.decreaseLife();
            System.out.println("Brick Broken!");
            return;
        }

        // Move ball
        board[ball.getRow()][ball.getCol()] = 'g';
        ball.setPosition(newRow, newCol);
        board[newRow][newCol] = 'o';
    }
}