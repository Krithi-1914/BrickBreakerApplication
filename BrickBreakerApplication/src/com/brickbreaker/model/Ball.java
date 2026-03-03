package com.brickbreaker.model;

public class Ball {

    private int row;
    private int col;
    private int lives;

    public Ball() {
        this.row = 6;
        this.col = 3;
        this.lives = 5;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public int getLives() { return lives; }

    public void setPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void decreaseLife() {
        lives--;
    }
}