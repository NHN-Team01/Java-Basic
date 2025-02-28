package com.nhnacademy.quiz_7_2;

import java.util.Arrays;
import java.util.Comparator;

public class P10 {
    static class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return name + ": " + score;
        }
    }
    public static void main(String[] args) {
        Player[] players = {
            new Player("Alice", 85),
            new Player("Bob", 90),
            new Player("Charlie", 78)
        };

        // TODO: 점수(score)를 기준으로 플레이어 배열 정렬
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return Integer.compare(o1.score, o2.score);
            }
        });

        System.out.println(Arrays.toString(players));
    }
}