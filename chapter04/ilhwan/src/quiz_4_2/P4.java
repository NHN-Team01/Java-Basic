package com.nhnacademy.quiz_4_2;

public class P4 {
    // TODO: 정적 변수를 정의하세요.
    static int gamesPlayed;
    static int gamesWon;

    public static void main(String[] args) {
        // TODO: playGame과 showScore 서브루틴을 순차적으로 호출하여 게임을 진행
        for(int i = 0; i < 10; i++) {
            System.out.println("게임을 시작합니다.");
            playGame();
            showScore();
        }
    }

    // TODO: playGame을 구현하세요.
    static void playGame() {
        gamesPlayed++;
        int r = (int)(Math.random()*2);
        if(r == 1) {
            gamesWon++;
        }
    }
    // TODO: showScore을 구현하세요.
    static void showScore() {
        System.out.printf("Played: %d, Won: %d\n", gamesPlayed, gamesWon);
    }

}
