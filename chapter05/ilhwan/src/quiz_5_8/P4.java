package com.nhnacademy.quiz_5_8;

public class P4 {
    public static void main(String[] args) {
        Game game = new Game();
        Game.Player player = game.new Player("Alice");
        player.setPlayerScore(50);
        player.displayScore(); // "Alice: 50 (Game Score: 100)" 출력
    }
}

class Game {
    private int gameScore = 100;

    class Player {
        private String name;
        private int playerScore;

        public Player(String name) {
            this.name = name;
        }

        // TODO: setPlayerScore 메서드와 displayScore 메서드를 작성하세요.
        void setPlayerScore(int score) {
            playerScore = score;
        }
        
        void displayScore() {
            System.out.println(name + ": " + playerScore + "(Game Score: " + gameScore + ")");
        }
    }
}