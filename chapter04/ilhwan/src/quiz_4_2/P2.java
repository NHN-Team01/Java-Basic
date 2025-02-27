package com.nhnacademy.quiz_4_2;

public class P2 {
    // TODO: 정적 변수를 정의하세요.
    static int gamesPlayed;
    static int gamesWon;

    public static void main(String[] args) {
        for(int i = 0 ; i < 10 ; i++) {
        // TODO: playGame 서브루틴을 호출하여 게임을 시작하고 게임 수와 승리 수 출력하기
            System.out.println("게임을 시작합니다.");
            playGame();
            System.out.printf("Played: %d, Won: %d\n", gamesPlayed, gamesWon);
        }
    }

    // TODO: playGame()을 구현하세요.
    static void playGame() {
        gamesPlayed++;
        int r = (int)(Math.random()*2);
        if(r == 1) {
            gamesWon++;
        }
    }

}
