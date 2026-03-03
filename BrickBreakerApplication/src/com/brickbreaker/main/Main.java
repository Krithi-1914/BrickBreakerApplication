package com.brickbreaker.main;

import com.brickbreaker.model.Ball;
import com.brickbreaker.model.GameBoard;
import com.brickbreaker.service.GameService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GameBoard board = new GameBoard();
        Ball ball = new Ball();
        GameService service = new GameService(board, ball);

        Scanner sc = new Scanner(System.in);

        board.printBoard();

        while (ball.getLives() > 0) {

            System.out.println("\nEnter Command (St / Lt / Rt / Exit): ");
            String cmd = sc.next();

            if (cmd.equalsIgnoreCase("Exit"))
                break;

            service.moveBall(cmd);
            board.printBoard();
            System.out.println("Ball Lives: " + ball.getLives());
        }

        System.out.println("Game Over!");
    }
}